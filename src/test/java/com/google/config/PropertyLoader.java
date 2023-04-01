package com.google.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {

    private static final String PROJECT_PATH = System.getProperty("user.dir");
    private static final String PROPERTY_FILE_PATH = "/src/test/resources/configuration.properties";
    public static String loadProperty(String name) {
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(PROJECT_PATH + PROPERTY_FILE_PATH);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String value = "";

        if (name != null) {
            value = properties.getProperty(name);
        }
        return value;
    }
}
