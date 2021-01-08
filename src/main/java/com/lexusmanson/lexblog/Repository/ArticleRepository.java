package com.lexusmanson.lexblog.Repository;

import com.lexusmanson.lexblog.domain.ArticleDomain;
import org.springframework.data.repository.CrudRepository;


public interface ArticleRepository extends CrudRepository<ArticleDomain, Integer> {
}
