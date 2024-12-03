package br.com.gmarqueszx.moviedata.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    public static String getApiKey() throws IOException {
        Properties properties = new Properties();
        FileInputStream input = new FileInputStream("src/main/resources/application.properties");
        properties.load(input);
        return properties.getProperty("API_KEY");
    }
}