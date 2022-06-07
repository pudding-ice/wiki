package com.myjava.wiki.domain.response;

import lombok.Data;

@Data
public class ResposeMessage {
    private boolean success = true;
    private String message;

    public ResposeMessage() {
    }

    public ResposeMessage(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
