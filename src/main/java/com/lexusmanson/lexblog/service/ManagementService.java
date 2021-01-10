package com.lexusmanson.lexblog.service;

import com.lexusmanson.lexblog.dto.ArticleDTO;

import java.util.Optional;
import java.util.Set;

public interface ManagementService {

    void saved(ArticleDTO article);

    Optional<ArticleDTO> loadArticle(int id);

    Set<ArticleDTO> loadAllArticles();
}
