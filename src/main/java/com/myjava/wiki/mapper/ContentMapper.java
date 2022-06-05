package com.myjava.wiki.mapper;

import com.myjava.wiki.domain.Content;

import java.util.List;

public interface ContentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Content record);

    Content selectByPrimaryKey(Long id);

    List<Content> selectAll();

    int updateByPrimaryKey(Content record);
}