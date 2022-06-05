package com.myjava.wiki.domain.response;

import lombok.Data;

@Data
public class CommonResponse<T> {
    private boolean success = true;

    private String message;

    private T content;
}
