package com.tme.wallboxmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class WallboxManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(WallboxManagementApplication.class, args);
    }

}
