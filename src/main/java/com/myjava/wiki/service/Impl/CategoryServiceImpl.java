package com.myjava.wiki.service.Impl;

import com.myjava.wiki.domain.Category;
import com.myjava.wiki.domain.response.CommonResponse;
import com.myjava.wiki.domain.response.ResposeMessage;
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
    public CommonResponse<Category> getAll() {
        List<Category> categories = mapper.selectAll();
        CommonResponse<Category> pageListResp = new CommonResponse<>();
        pageListResp.setDataList(categories);
        pageListResp.setResposeMessage(new ResposeMessage(true, "获取分类成功"));
        return pageListResp;
    }
}
