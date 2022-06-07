package com.myjava.wiki.service;

import com.myjava.wiki.domain.Category;
import com.myjava.wiki.domain.response.PageListResp;

public interface CategoryService {
    Category getOneById(Long id);

    PageListResp<Category> getAll();
}
