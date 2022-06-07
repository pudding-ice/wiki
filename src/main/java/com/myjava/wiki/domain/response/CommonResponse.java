package com.myjava.wiki.domain.response;

import lombok.Data;

import java.util.List;

@Data
public class CommonResponse<T> {
    private ResposeMessage resposeMessage;
    private List<T> dataList;

    public CommonResponse() {
    }

    public CommonResponse(ResposeMessage resposeMessage) {
        this.resposeMessage = resposeMessage;
    }
}
