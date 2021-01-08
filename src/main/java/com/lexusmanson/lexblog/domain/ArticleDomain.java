package com.lexusmanson.lexblog.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Builder
@Entity
public class ArticleDomain {

    @Id
    @GeneratedValue
    int id;
    String title;
    String text;
    String imgRef;
    LocalDate created;
    LocalDate published;
    LocalDate edited;

}
