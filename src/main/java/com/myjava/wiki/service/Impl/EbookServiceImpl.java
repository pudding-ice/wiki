package com.myjava.wiki.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myjava.wiki.domain.Ebook;
import com.myjava.wiki.domain.request.PageRequest;
import com.myjava.wiki.domain.response.AxiosRespMessage;
import com.myjava.wiki.domain.response.PageListResp;
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
        List<Ebook> ebooks = mapper.selectAll("");
        PageInfo<Ebook> pageInfo = new PageInfo<>(ebooks, page.getCurrent());
        PageListResp<Ebook> resp = new PageListResp<>();
        resp.setDataList(ebooks);
        resp.setTotal(pageInfo.getTotal());
        AxiosRespMessage axiosRespMessage = new AxiosRespMessage(true, "获取数据列表成功");
        resp.setRespMessage(axiosRespMessage);
        return resp;
    }
}
