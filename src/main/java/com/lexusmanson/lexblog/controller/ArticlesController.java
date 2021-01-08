package com.lexusmanson.lexblog.controller;

import com.lexusmanson.lexblog.domain.ArticleDomain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("a")
public class ArticlesController {

    @GetMapping(value = "/{id}", produces = "application/json")
    public ArticleDomain getArticle(@PathVariable int id){
        ArticleDomain a = ArticleDomain.builder().title("Text Title").text("This is my test article").imgRef("/blah.png").build();
        return a;
    }
}
