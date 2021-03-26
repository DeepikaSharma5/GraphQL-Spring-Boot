package com.hms.covid19dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class Covid19DashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(Covid19DashboardApplication.class, args);
    }

}
