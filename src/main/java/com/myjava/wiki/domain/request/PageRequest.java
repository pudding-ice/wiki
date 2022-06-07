package com.myjava.wiki.domain.request;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
public class PageRequest {
    @NotNull(message = "[提示] 查询页码不能为空")
    Integer current;
    @NotNull(message = "[提示] 查询页面大小不能为空")
    @Max(value = 100, message = "[提示] 查询页面大小不能超过100")
    Integer pageSize;
}
