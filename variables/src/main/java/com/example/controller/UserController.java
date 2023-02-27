package com.example.controller;

import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/list")
    public String list(Model model){
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"Tung",1));
        userList.add(new User(2,"Truong",2));
        userList.add(new User(3,"Trang",3));
        userList.add(new User(4,"Truc",3));
        userList.add(new User(5,"Quan",2));
        model.addAttribute("users",userList);
        return "variables";
    }
}
