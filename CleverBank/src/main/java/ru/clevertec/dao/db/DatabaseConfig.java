package ru.clevertec.dao.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.YAMLConfiguration;
import org.apache.commons.configuration2.ex.ConfigurationException;
import ru.clevertec.service.appsettings.AppSettings;

import java.io.InputStream;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DatabaseConfig {

    private String dbDriver = configuration.getString("dbDriver");
    private String url = configuration.getString("url");
    private String user = configuration.getString("user");
    private String password = configuration.getString("password");

    private static final Configuration configuration;

    static {
        final InputStream resourceAsStream = AppSettings.class.getResourceAsStream("/settings_db.yml");
        final YAMLConfiguration yamlConfiguration = new YAMLConfiguration();
        try {
            yamlConfiguration.read(resourceAsStream);
        } catch (ConfigurationException e) {
            throw new RuntimeException(e);
        }
        configuration = yamlConfiguration;
    }
}
