package com.lexusmanson.lexblog.Repository;

import com.lexusmanson.lexblog.dto.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Integer> {
}
