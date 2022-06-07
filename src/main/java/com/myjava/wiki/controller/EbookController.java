package com.myjava.wiki.controller;

import com.myjava.wiki.domain.Ebook;
import com.myjava.wiki.domain.request.PageRequest;
import com.myjava.wiki.domain.response.PageListResp;
import com.myjava.wiki.domain.response.ResposeMessage;
import com.myjava.wiki.service.EbookService;
import com.myjava.wiki.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/ebook")
public class EbookController {
    @Autowired
    EbookService service;

    @GetMapping("/list")
    public PageListResp<Ebook> getAllBook(String name) {
        List<Ebook> allEbook = service.getAllEbook(name);
        PageListResp<Ebook> pageListResp = new PageListResp<>();
        pageListResp.setDataList(allEbook);
        return pageListResp;
    }

    @GetMapping("/getList")
    public PageListResp<Ebook> getEbookList(@Valid PageRequest request) {
        PageListResp<Ebook> ebookList = service.getEbookList(request);
        return ebookList;
    }

    /***
     * 添加电子书和更新电子书使用一个save方法,根据id来判断是新增还是更新
     * @param ebook 传入的参数
     * @return 返回结果对象
     */
    @PostMapping("/save")
    public ResposeMessage updateEbook(@RequestBody Ebook ebook) {
        ResposeMessage response = null;
        if (ebook.getId() == null) {
            //新增操作
            //使用雪花算法生成id
            ebook.setId(new SnowFlake().nextId());
            response = service.addEbook(ebook);
        } else {
            //更新操作
            response = service.updateEbook(ebook);
        }
        return response;
    }

    @RequestMapping("/delete")
    public ResposeMessage delete(Long id) {
        System.out.println(id);
        ResposeMessage response = service.deleteById(id);
        return response;
    }
}
