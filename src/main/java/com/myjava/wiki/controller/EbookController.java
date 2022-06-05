package com.myjava.wiki.controller;

import com.myjava.wiki.domain.Ebook;
import com.myjava.wiki.domain.response.CommonResponse;
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

    @GetMapping("/list")
    public CommonResponse getAllBook() {
        List<Ebook> allEbook = service.getAllEbook();
        CommonResponse<List<Ebook>> response = new CommonResponse<>();
        response.setContent(allEbook);
        response.setMessage("获取所有书籍成功");
        return response;
    }
}
