package com.myjava.wiki.domain.response;

import lombok.Data;

@Data
public class AxiosRespMessage {
    private Boolean success;
    private String message;

    public AxiosRespMessage() {
    }

    public AxiosRespMessage(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
