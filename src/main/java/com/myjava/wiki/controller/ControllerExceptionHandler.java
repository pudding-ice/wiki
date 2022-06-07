package com.myjava.wiki.controller;

import com.myjava.wiki.domain.response.PageListResp;
import com.myjava.wiki.domain.response.ResposeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理、数据预处理等
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    /**
     * 校验异常统一处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public PageListResp validExceptionHandler(BindException e) {
        PageListResp response = new PageListResp();
        LOG.warn("参数校验失败：{}", e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
        response.setResposeMessage(new ResposeMessage(false, e.getBindingResult().getAllErrors().get(0).getDefaultMessage()));
        return response;
    }
//
//    /**
//     * 校验异常统一处理
//     * @param e
//     * @return
//     */
//    @ExceptionHandler(value = BusinessException.class)
//    @ResponseBody
//    public CommonResp validExceptionHandler(BusinessException e) {
//        CommonResp commonResp = new CommonResp();
//        LOG.warn("业务异常：{}", e.getCode().getDesc());
//        commonResp.setSuccess(false);
//        commonResp.setMessage(e.getCode().getDesc());
//        return commonResp;
//    }
//
//    /**
//     * 校验异常统一处理
//     * @param e
//     * @return
//     */
//    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
//    public CommonResp validExceptionHandler(Exception e) {
//        CommonResp commonResp = new CommonResp();
//        LOG.error("系统异常：", e);
//        commonResp.setSuccess(false);
//        commonResp.setMessage("系统出现异常，请联系管理员");
//        return commonResp;
//    }
}
