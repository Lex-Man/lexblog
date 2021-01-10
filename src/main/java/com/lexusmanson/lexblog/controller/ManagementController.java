package com.lexusmanson.lexblog.controller;

import com.lexusmanson.lexblog.dto.ArticleDTO;
import com.lexusmanson.lexblog.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping("man/")
public class ManagementController {

    @Autowired
    ManagementService managementService;

    @GetMapping("/")
    public String main(Model model){
        Set<ArticleDTO> articles = managementService.loadAllArticles();
        model.addAttribute("articles", articles);
        return "management/main";
    }

    @GetMapping("/edit")
    public String edit(Model model){
        ArticleDTO article = new ArticleDTO();
        model.addAttribute("article", article);
        return "management/edit";
    }

    @GetMapping("/edit/{id}")
    public String open(Model model, @PathVariable int id){
        Optional<ArticleDTO> articleDTO = managementService.loadArticle(id);
        model.addAttribute( "article", articleDTO.get());
        return "management/edit";
    }

    @PostMapping("/save")
    public RedirectView save(Model model, @ModelAttribute ArticleDTO article){
        managementService.saved(article);

        return new RedirectView("edit/" + article.getId());
    }

}
