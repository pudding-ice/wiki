package com.myjava.wiki.service;

import com.myjava.wiki.domain.Ebook;
import com.myjava.wiki.domain.request.PageRequest;
import com.myjava.wiki.domain.response.PageListResp;
import com.myjava.wiki.domain.response.ResposeMessage;

import java.util.List;

public interface EbookService {
    List<Ebook> getAllEbook(String name);

    PageListResp<Ebook> getEbookList(PageRequest pageRequest);

    ResposeMessage updateEbook(Ebook ebook);

    ResposeMessage addEbook(Ebook ebook);

    ResposeMessage deleteById(Long id);
}
