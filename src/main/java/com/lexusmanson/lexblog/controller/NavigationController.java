package com.lexusmanson.lexblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class NavigationController {

    @GetMapping("/home")
    public String index(){
        return "index";
    }
}
