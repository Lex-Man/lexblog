package com.lexusmanson.lexblog.controller;

import com.lexusmanson.lexblog.dto.ArticleDTO;
import com.lexusmanson.lexblog.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class NavigationController {

    @Autowired
    MainService mainService;

    @GetMapping({"/home", "", "/index"})
    public String index(Model model){
        List<ArticleDTO> articles = mainService.getLatestArticles();
        model.addAttribute("articles", articles);
        return "index";
    }
}
