package com.lexusmanson.lexblog.repository;

import com.lexusmanson.lexblog.domain.ArticleDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;


public interface ArticleRepository extends JpaRepository<ArticleDomain, Integer> {

    @Modifying
    @Query("UPDATE ArticleDomain ad SET ad.published = :publishDate WHERE ad.id = :articleId")
    int updatePublish(@Param("articleId") Integer id, @Param("publishDate") LocalDate date);
}
