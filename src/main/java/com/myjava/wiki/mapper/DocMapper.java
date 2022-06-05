package com.myjava.wiki.mapper;

import com.myjava.wiki.domain.Doc;

import java.util.List;

public interface DocMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Doc record);

    Doc selectByPrimaryKey(Long id);

    List<Doc> selectAll();

    int updateByPrimaryKey(Doc record);
}