package com.example.javawebproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DemoApplication
{

    public static void main(String[] args) { SpringApplication.run(DemoApplication.class, args); }

    @GetMapping
    public String hello(){
        return "Hello from Jx K8x";
        }
    }

}
