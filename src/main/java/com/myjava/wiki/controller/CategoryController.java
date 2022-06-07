package com.myjava.wiki.controller;

import com.myjava.wiki.domain.Category;
import com.myjava.wiki.domain.response.PageListResp;
import com.myjava.wiki.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService service;

    @RequestMapping("/getAll")
    public PageListResp<Category> getAll() {
        PageListResp<Category> response = service.getAll();
        return response;
    }
}
