package com.connfun.pay.wechat.service;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import com.connfun.pay.wechat.common.IServiceRequest;
import com.connfun.pay.wechat.common.LackRequireFieldException;
import com.connfun.pay.wechat.common.Sign;
import com.connfun.pay.wechat.common.XMLSerializer;
import com.connfun.pay.wechat.entity.BaseEntity;

public class WechatPayService {
    public String send(IServiceRequest serviceRequest, BaseEntity entity)
            throws LackRequireFieldException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {

        entity.setSign(Sign.sign(entity));

        if (!entity.legal()) {
            throw new LackRequireFieldException();
        }

        String xmlContent = XMLSerializer.serialize(entity);
        return serviceRequest.sendPost(entity.getWebAPI(), xmlContent);
    }
}

