package com.lexusmanson.lexblog.service;

import com.lexusmanson.lexblog.dto.ArticleDTO;

import java.util.List;

public interface MainService {

    List<ArticleDTO> getLatestArticles();

}
