package com.example.exo22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.sql.SQLException;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.exo22.repository", "com.example.exo22.services", "com.example.exo22.controller"})
public class Exo22Application {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(Exo22Application.class, args);
        System.out.println("starting...");
    }

}
