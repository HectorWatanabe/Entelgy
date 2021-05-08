package com.hector.entelgy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String index() {
        return "Bienvenido, ingresa a <br><br> POST localhost:8080/api/v1/users ";
    }
}
