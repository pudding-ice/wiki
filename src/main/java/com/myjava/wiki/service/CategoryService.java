package com.myjava.wiki.service;

import com.myjava.wiki.domain.Category;
import com.myjava.wiki.domain.response.CommonResponse;

public interface CategoryService {
    Category getOneById(Long id);

    CommonResponse<Category> getAll();
}
