package com.damon.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);

        System.out.println(Runtime.getRuntime().maxMemory() / (1024 * 1024) + "MB");
        System.out.println(Runtime.getRuntime().totalMemory() / (1024 * 1024) + "MB");
    }

}
