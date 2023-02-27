package com.example.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class OperatorController {
    @GetMapping("/operator")
    public String operator(){
        return "operator";
    }
}
