package com.lexusmanson.lexblog.service;

import com.googlecode.jmapper.JMapper;
import com.lexusmanson.lexblog.dao.ArticleDAO;
import com.lexusmanson.lexblog.dto.ArticleDTO;
import com.lexusmanson.lexblog.domain.ArticleDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class ManagementServiceImpl implements ManagementService {

    @Autowired
    ArticleDAO articleDAO;

    private static JMapper<ArticleDomain, ArticleDTO> articleDomainMapper = new JMapper<>(ArticleDomain.class, ArticleDTO.class);
    private static JMapper<ArticleDTO, ArticleDomain> articleDTOMapper = new JMapper<>(ArticleDTO.class, ArticleDomain.class);

    @Override
    public void saved(ArticleDTO article) {
        ArticleDomain ad = articleDomainMapper.getDestination(article);
        if(article.getId() == 0) { ad.setCreated(LocalDate.now()); }
        ad.setEdited(LocalDate.now());

        articleDAO.saveArticle(ad);
    }

    @Override
    public Optional<ArticleDTO> loadArticle(int id) {
        Optional<ArticleDomain> articleDomain = articleDAO.loadArticle(id);

        if(articleDomain.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(articleDTOMapper.getDestination(articleDomain.get()));
    }

    @Override
    public Set<ArticleDTO> loadAllArticles() {
        Iterable<ArticleDomain> domain = articleDAO.getAllArticles();
        Set<ArticleDTO> articles = new HashSet<>();
        domain.forEach(a -> articles.add(articleDTOMapper.getDestination(a)));
        return articles;
    }
}
