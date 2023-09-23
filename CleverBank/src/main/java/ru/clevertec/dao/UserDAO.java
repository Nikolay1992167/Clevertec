package ru.clevertec.dao;



import ru.clevertec.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserDAO {

    Optional<User> findById(Long id);

    List<User> findAll();

    User save(User user);

    User update(User user);

    Optional<User> delete(Long id);

}
