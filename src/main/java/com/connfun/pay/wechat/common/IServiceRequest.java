package com.connfun.pay.wechat.common;

public interface IServiceRequest {
    public String sendPost(String uri, Boolean security, String content);
}

