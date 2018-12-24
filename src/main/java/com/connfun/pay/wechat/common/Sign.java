package com.connfun.pay.wechat.common;

import java.io.UnsupportedEncodingException;
import java.lang.UnsupportedOperationException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.TreeMap;

import com.connfun.pay.common.EntityName;

import com.connfun.pay.wechat.entity.BaseEntity;

public class Sign {
    public static String getStringA(final BaseEntity obj ){

        Map<String, Object> params = new TreeMap<String, Object>();

        Class<?> clazz = obj.getClass();

        Method[] getMethods = clazz.getMethods();

        for (Method getMethod : getMethods) {
            if (getMethod.getName().startsWith("get") == false) {
                continue;
            }
            EntityName entityName = getMethod.getAnnotation(EntityName.class);
            if (entityName == null) {
                continue;
            }
            try {
                Object value = getMethod.invoke(obj);
                if (value == null) {
                    continue;
                }
                String key = entityName.value();
                if (key == "sign") {
                    continue;
                }

                params.put(key, value);
            }
            catch (IllegalAccessException e) {
                continue;
            }
            catch (InvocationTargetException e) {
                continue;
            }
        }

        StringBuffer sb = new StringBuffer();

        for (String key : params.keySet()) {
            if (sb.length() != 0) {
                sb.append('&');
            }
            sb.append(key);
            sb.append('=');
            sb.append(params.get(key).toString());
        }

        return sb.toString();
    }

    public static String sign(final BaseEntity obj)
            throws UnsupportedOperationException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        SignType signType = obj.getSignType();
        if (signType == null) {
            signType = SignType.MD5;
        }

        String stringA = Sign.getStringA(obj) + "&key=" + Configure.KEY;
        if (!signType.getSupport()) {
            throw new UnsupportedOperationException();
        }

        return MessageSign.sign(stringA, signType);
    }

    public static boolean verify(final BaseEntity obj) 
            throws IllegalAccessException, InvocationTargetException, UnsupportedOperationException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        String stringA = Sign.getStringA(obj) + "&key=" + Configure.KEY;
        String localSign = MessageSign.sign(stringA, obj.getSignType());
        return obj.getSign().equals(localSign);
    }
}

