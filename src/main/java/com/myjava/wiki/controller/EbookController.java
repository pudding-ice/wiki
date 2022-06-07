package com.myjava.wiki.controller;

import com.myjava.wiki.domain.Ebook;
import com.myjava.wiki.domain.request.PageRequest;
import com.myjava.wiki.domain.response.CommonResponse;
import com.myjava.wiki.domain.response.PageListResp;
import com.myjava.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/ebook")
public class EbookController {
    @Autowired
    EbookService service;

    @GetMapping("/getAll")
    public PageListResp<Ebook> getAllBook(String name) {
        List<Ebook> allEbook = service.getAllEbook(name);
        PageListResp<Ebook> pageListResp = new PageListResp<>();
        pageListResp.setDataList(allEbook);
        pageListResp.setResponse(new CommonResponse(true, "获取所有书籍成功"));
        return pageListResp;
    }

    @GetMapping("/getList")
    public PageListResp<Ebook> getEbookList(PageRequest request) {
        PageListResp<Ebook> ebookList = service.getEbookList(request);
        return ebookList;
    }
}
