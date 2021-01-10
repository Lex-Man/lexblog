package com.lexusmanson.lexblog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name = "articles")
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String title;
    String text;

    @Column(name = "imgref")
    String imgRef;
    LocalDate created;
    LocalDate published;
    LocalDate edited;

}
