package com.myjava.wiki.service.Impl;

import com.myjava.wiki.domain.Ebook;
import com.myjava.wiki.mapper.EbookMapper;
import com.myjava.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookServiceImpl implements EbookService {
    @Autowired
    EbookMapper mapper;

    @Override
    public List<Ebook> getAllEbook(String name) {
        return mapper.selectAll(name);
    }
}
