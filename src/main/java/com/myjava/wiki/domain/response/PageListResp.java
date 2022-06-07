package com.myjava.wiki.domain.response;

import lombok.Data;

import java.util.List;

@Data
public class PageListResp<T> {
    private Long total;

    private CommonResponse response;

    private List<T> dataList;
}
