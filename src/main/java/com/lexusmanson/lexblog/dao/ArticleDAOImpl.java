package com.lexusmanson.lexblog.dao;

import com.lexusmanson.lexblog.Repository.ArticleRepository;
import com.lexusmanson.lexblog.domain.ArticleDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDAOImpl implements ArticleDAO {

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public void saveArticle(ArticleDomain article) {
        articleRepository.save(article);
    }
}
