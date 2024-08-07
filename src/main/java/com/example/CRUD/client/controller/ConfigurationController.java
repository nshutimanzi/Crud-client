package com.example.CRUD.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConfigurationController {

    @Autowired
    private Environment environment;

    @GetMapping("/configs")
    public Map<String, String> getConfig(){
        Map<String, String> properties = new HashMap<>();
        properties.put("example.property",environment.getProperty("example.property"));
        properties.put("spring.datasource.url",environment.getProperty("spring.datasource.url"));
        properties.put("spring.datasource.username",environment.getProperty("spring.datasource.username"));
        properties.put("spring.datasource.password",environment.getProperty("spring.datasource.password"));
        return properties;
    }
}
