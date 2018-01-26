package com.example.plat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class DemoPlatApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoPlatApplication.class, args);
    }
}
