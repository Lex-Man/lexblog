package com.lexusmanson.lexblog.dto;

import com.googlecode.jmapper.annotations.JMap;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDTO {

    @JMap
    int id;
    @JMap("title")
    String title;
    @JMap("text")
    String text;
    @JMap("imgRef")
    String imgRef;
    @JMap("created")
    LocalDate created;
    @JMap("published")
    LocalDate published;
    @JMap("edited")
    LocalDate edited;

}
