package com.lexusmanson.lexblog.service;

import com.googlecode.jmapper.JMapper;
import com.lexusmanson.lexblog.dao.ArticleDAO;
import com.lexusmanson.lexblog.domain.ArticleDomain;
import com.lexusmanson.lexblog.dto.ArticleDTO;
import com.lexusmanson.lexblog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MainServiceImpl implements MainService{

    @Autowired
    ArticleDAO articleDAO;

    private static JMapper<ArticleDTO, ArticleDomain> articleDTOMapper = new JMapper<>(ArticleDTO.class, ArticleDomain.class);

    @Override
    public List<ArticleDTO> getLatestArticles() {

        Page<ArticleDomain> articles = articleDAO.getLatestArticles();

        List<ArticleDTO> articlesList = articles.stream().map(a -> articleDTOMapper.getDestination(a)).collect(Collectors.toList());
        return articlesList;

    }
}
