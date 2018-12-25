package com.connfun.pay.wechat.entity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.connfun.pay.wechat.common.Configure;
import com.connfun.pay.common.EntityName;
import com.connfun.pay.wechat.common.RandGenerator;
import com.connfun.pay.common.RequireField;
import com.connfun.pay.wechat.common.SignType;

public abstract class BaseEntity {
    private String appId;
    private String mchId;
    private String sign;
    private SignType signType;
    private String nonceStr;

    public BaseEntity() {
        appId = Configure.getInstance().getAppId();
        mchId = Configure.getInstance().getMchId();
        signType = Configure.getInstance().getSignType();
        nonceStr = RandGenerator.get(32);
    }

    public abstract String getWebAPI();

    public boolean legal() {
        Method[] getMethods = this.getClass().getMethods();

        try {
            for (Method getMehtod : getMethods) {
                if (getMehtod.getAnnotation(RequireField.class) != null) {
                    Object val = getMehtod.invoke(this);
                    if (val == null) {
                        return false;
                    }
                }
            }
        }
        catch (IllegalAccessException e) {
            return false;
        }
        catch (InvocationTargetException e) {
            return false;
        }

        return true;
    }

    @RequireField
    @EntityName(value = "appid")
    public String getAppId() {
        return appId;
    }
    
    @RequireField
    @EntityName(value = "mch_id")
    public String getMchId() {
        return mchId;
    }

    @RequireField
    @EntityName(value = "sign")
    public String getSign() {
        return sign;
    }

    @RequireField
    @EntityName(value = "sign_type")
    public SignType getSignType() {
        return signType;
    }

    @RequireField
    @EntityName(value = "nonce_str")
    public String getNonceStr() {
        return nonceStr;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setSignType(SignType signType) {
        this.signType = signType;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }
}
