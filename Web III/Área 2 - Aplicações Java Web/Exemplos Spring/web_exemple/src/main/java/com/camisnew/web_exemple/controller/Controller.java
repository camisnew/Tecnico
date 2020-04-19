package com.camisnew.web_exemple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorldController() {
        return "hello world";
    }

}
