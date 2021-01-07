package com.lexusmanson.lexblog.controller;

import com.lexusmanson.lexblog.dto.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("man/")
public class ManagementController {

    @GetMapping("/")
    public String main(){
        return "management/main";
    }

    @GetMapping("/edit")
    public String edit(Model model){
        Article article = new Article();
        model.addAttribute("article", article);
        return "management/edit";
    }

    @GetMapping("/edit/{id}")
    public String open(Model model, @PathVariable int id){
        return "management/edit";
    }

    @PostMapping("/save")
    public String save(Model model, @ModelAttribute Article article){
        return "temp";
    }

}
