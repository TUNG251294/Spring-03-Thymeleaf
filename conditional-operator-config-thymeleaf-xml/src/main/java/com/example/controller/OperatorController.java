package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/operator")
public class OperatorController {
    @GetMapping("/condition")
    public ModelAndView viewOperator(){
        ModelAndView modelAndView = new ModelAndView("condition-operator");
        return modelAndView;
    }
    @GetMapping("/comparison")
    public ModelAndView viewOperator2(){
        ModelAndView modelAndView = new ModelAndView("comparison-operator");
        return modelAndView;
    }
    @GetMapping("/mathematical")
    public String viewOperator3(){
        return "mathematical-operator";
    }
    @GetMapping("/logical")
    public String viewOperator4(){
        return "logical-operator";
    }
}
