package com.demo.singleton;

import java.util.Properties;

public class ConfigurationManager {
 
    private static final ConfigurationManager instance = new ConfigurationManager();
    private Properties settings;


    private ConfigurationManager() {
        System.out.println("Loading configuration...");
        settings = new Properties();
        settings.setProperty("appName", "MyApp");
        settings.setProperty("version", "1.0");
    }

    public static ConfigurationManager getInstance() {
        return instance;
    }

    public String getSetting(String key) {
        return settings.getProperty(key);
    }
}
