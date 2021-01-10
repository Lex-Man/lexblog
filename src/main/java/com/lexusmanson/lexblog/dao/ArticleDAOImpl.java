package com.lexusmanson.lexblog.dao;

import com.lexusmanson.lexblog.Repository.ArticleRepository;
import com.lexusmanson.lexblog.domain.ArticleDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArticleDAOImpl implements ArticleDAO {

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public void saveArticle(ArticleDomain article) {
        articleRepository.save(article);
    }

    @Override
    public Optional<ArticleDomain> loadArticle(int id) {
        return articleRepository.findById(id);
    }

    @Override
    public Iterable<ArticleDomain> getAllArticles() {
        return articleRepository.findAll();
    }
}
