package com.iridiuz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IridiuzInitializer extends SpringBootServletInitializer{

    /* @RequestMapping("/")
    public String home() {
        return "Iridiuz Framework initialized...";
    } */

    public static void main(String[] args) {
        SpringApplication.run(IridiuzInitializer.class, args);
    }

}
