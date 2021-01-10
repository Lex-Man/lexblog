package com.lexusmanson.lexblog.dao;

import com.lexusmanson.lexblog.domain.ArticleDomain;

import java.util.List;
import java.util.Optional;

public interface ArticleDAO {

    void saveArticle(ArticleDomain article);

    Optional<ArticleDomain> loadArticle(int id);

    Iterable<ArticleDomain> getAllArticles();
}
