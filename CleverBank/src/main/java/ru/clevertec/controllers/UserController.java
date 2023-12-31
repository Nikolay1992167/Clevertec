package ru.clevertec.controllers;


import com.google.gson.Gson;
import ru.clevertec.dao.UserDAOImpl;
import ru.clevertec.dao.api.UserDAO;
import ru.clevertec.data.user.request.RequestUser;
import ru.clevertec.data.user.response.ResponseUser;
import ru.clevertec.mapper.UserMapper;
import ru.clevertec.service.UserServiceImpl;
import ru.clevertec.service.api.UserService;
import ru.clevertec.util.ControllerUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet("/users/*")
public class UserController extends HttpServlet {

    private final UserDAO userDAO = new UserDAOImpl();
    private final UserMapper userMapper = new UserMapper();
    private final UserService userService = new UserServiceImpl(userDAO, userMapper);
    private final Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String pathInfo = req.getPathInfo();
        if (Objects.isNull(pathInfo)) {
            List<ResponseUser> users;
            users = userService.getAllUsers();
            String json = gson.toJson(users);
            sendJsonResponse(json, resp);
        } else if (ControllerUtil.isId(pathInfo)) {
            String id = pathInfo.substring(1);
            ResponseUser user;
            user = userService.getUserById(Long.parseLong(id));
            String json = gson.toJson(user);
            sendJsonResponse(json, resp);
        } else {
            resp.sendError(404, String.format("The requested resource [%s] is not available", req.getRequestURI()));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        RequestUser userDto = gson.fromJson(req.getReader(), RequestUser.class);
        userService.addUser(userDto);
        String json = gson.toJson(userDto);
        sendJsonResponse(json, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String pathInfo = req.getPathInfo();
        if (!ControllerUtil.isId(pathInfo)) {
            resp.sendError(400, "Id must be set!");
            return;
        }
        String id = pathInfo.substring(1);
        RequestUser user = gson.fromJson(req.getReader(), RequestUser.class);
        userService.updateUser(Long.parseLong(id), user);
        String json = gson.toJson(user);
        sendJsonResponse(json, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String pathInfo = req.getPathInfo();
        if (!ControllerUtil.isId(pathInfo)) {
            resp.sendError(400, "Invalid id!");
            return;
        }
        String id = pathInfo.substring(1);
        userService.deleteUser(Long.parseLong(id));
        resp.setStatus(204);
    }

    private void sendJsonResponse(String json, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.setStatus(200);
        response.getWriter().println(json);
    }
}
