package com.myjava.wiki.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myjava.wiki.domain.Ebook;
import com.myjava.wiki.domain.request.PageRequest;
import com.myjava.wiki.domain.response.PageListResp;
import com.myjava.wiki.domain.response.ResposeMessage;
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

    @Override
    public PageListResp<Ebook> getEbookList(PageRequest page) {
        PageHelper.startPage(page.getCurrent(), page.getPageSize());
        List<Ebook> ebooks = mapper.selectAll(page.getQueryText());
        PageInfo<Ebook> pageInfo = new PageInfo<>(ebooks, page.getCurrent());
        PageListResp<Ebook> resp = new PageListResp<>();
        resp.setDataList(ebooks);
        resp.setTotal(pageInfo.getTotal());
        resp.setResposeMessage(new ResposeMessage(true, "成功获取电子书"));
        return resp;
    }

    @Override
    public ResposeMessage updateEbook(Ebook ebook) {
        int i = mapper.updateByPrimaryKey(ebook);
        ResposeMessage response = null;
        if (i > 0) {
            response = new ResposeMessage(true, "更新电子书成功");
        } else {
            response = new ResposeMessage(false, "更新电子书失败");
        }
        return response;
    }

    @Override
    public ResposeMessage addEbook(Ebook ebook) {
        ResposeMessage response = null;
        int insert = mapper.insert(ebook);
        if (insert > 0) {
            response = new ResposeMessage(true, "新增电子书成功");
        } else {
            response = new ResposeMessage(false, "新增电子书失败");
        }
        return response;
    }

    @Override
    public ResposeMessage deleteById(Long id) {
        int i = mapper.deleteByPrimaryKey(id);
        ResposeMessage response = null;
        if (i > 0) {
            response = new ResposeMessage(true, "删除成功");
        } else {
            response = new ResposeMessage(false, "删除失败");
        }
        return response;
    }


}
