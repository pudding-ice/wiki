package com.myjava.wiki.mapper;

import com.myjava.wiki.domain.Ebook;

import java.util.List;

public interface EbookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Ebook record);

    Ebook selectByPrimaryKey(Long id);

    List<Ebook> selectAll();

    int updateByPrimaryKey(Ebook record);
}