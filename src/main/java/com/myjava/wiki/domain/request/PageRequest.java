package com.myjava.wiki.domain.request;

import lombok.Data;

@Data
public class PageRequest {
    Integer current;
    Integer pageSize;
}
