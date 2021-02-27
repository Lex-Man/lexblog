package com.lexusmanson.lexblog.dao;

import com.lexusmanson.lexblog.domain.ArticleDomain;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.util.Optional;

public interface ArticleDAO {

    void saveArticle(ArticleDomain article);

    Optional<ArticleDomain> loadArticle(int id);

    Iterable<ArticleDomain> getAllArticles();

    void publishArticle(int id, LocalDate date);

    Page<ArticleDomain> getLatestArticles();
}
