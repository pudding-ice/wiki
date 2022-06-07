package com.myjava.wiki.service.Impl;

import com.myjava.wiki.domain.Category;
import com.myjava.wiki.domain.response.CommonResponse;
import com.myjava.wiki.domain.response.PageListResp;
import com.myjava.wiki.mapper.CategoryMapper;
import com.myjava.wiki.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper mapper;

    @Override
    public Category getOneById(Long id) {
        return null;
    }

    @Override
    public PageListResp<Category> getAll() {
        List<Category> categories = mapper.selectAll();
        PageListResp<Category> pageListResp = new PageListResp<>();
        pageListResp.setDataList(categories);
        pageListResp.setResponseContent(new CommonResponse(true, "获取成功"));
        return pageListResp;
    }
}
