package com.myjava.wiki.service;

import com.myjava.wiki.domain.Ebook;
import com.myjava.wiki.domain.request.PageRequest;
import com.myjava.wiki.domain.response.CommonResponse;
import com.myjava.wiki.domain.response.PageListResp;

import java.util.List;

public interface EbookService {
    List<Ebook> getAllEbook(String name);

    PageListResp<Ebook> getEbookList(PageRequest pageRequest);


    CommonResponse updateEbook(Ebook ebook);

    CommonResponse addEbook(Ebook ebook);
}
