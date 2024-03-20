package br.com.estudos.bookmanagement.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Book {

    private String title;
    private String editor;
    private String author;

}
