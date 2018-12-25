package com.connfun.pay.wechat.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

import com.connfun.pay.wechat.common.IServiceRequest;
import com.connfun.pay.common.LackRequireFieldException;
import com.connfun.pay.wechat.common.Sign;
import com.connfun.pay.wechat.common.XMLSerializer;
import com.connfun.pay.wechat.entity.BaseEntity;
import com.connfun.pay.wechat.entity.BaseResponseEntity;

public class WechatPayService {
    public String send(IServiceRequest serviceRequest, BaseEntity entity)
            throws LackRequireFieldException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {

        entity.setSign(Sign.sign(entity));

        if (!entity.legal()) {
            throw new LackRequireFieldException();
        }

        String xmlContent = XMLSerializer.serialize(entity);
        return serviceRequest.sendPost(entity.getWebAPI(), entity.security(), xmlContent);
    }

    public <T extends BaseResponseEntity> T recv(String msg, Class<T> clazz)
        throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ParserConfigurationException, SAXException, IOException {
        T obj = XMLSerializer.deserialize(msg, clazz);

        return obj;
    }
}

