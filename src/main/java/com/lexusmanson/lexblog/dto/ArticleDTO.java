package com.lexusmanson.lexblog.dto;

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

    int id;
    String title;
    String text;
    String imgRef;

}
