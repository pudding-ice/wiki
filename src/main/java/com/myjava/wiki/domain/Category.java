package com.myjava.wiki.domain;

import lombok.Data;

@Data
public class Category {
    private Long id;

    private Long parent;

    private String name;

    private Integer sort;


}