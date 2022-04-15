package com.kosgei.dev.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Index {
    @GetMapping("/")
    public String index() {
        return "Spring from MAVEN build";
    }
}
