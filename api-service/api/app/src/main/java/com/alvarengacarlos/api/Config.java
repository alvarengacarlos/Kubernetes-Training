package com.alvarengacarlos.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Value("${mongoDb.connection.url}")
    private String mongoDbConnectionUrl;
}
