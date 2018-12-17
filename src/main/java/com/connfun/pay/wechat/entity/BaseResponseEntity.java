package com.connfun.pay.wechat.entity;

import com.connfun.pay.wechat.common.EntityName;

public abstract class BaseResponseEntity {
    private String returnCode;
    private String returnMsg;
    private String resultCode;
    private String appId;
    private String mchId;
    private String deviceInfo;
    private String nonceStr;
    private String sign;
    private String errCode;
    private String errCodeDes;

    @EntityName(value = "return_code")
    public String getReturnCode() {
        return returnCode;
    }

    @EntityName(value = "return_msg")
    public String getReturnMsg() {
        return returnMsg;
    }

    @EntityName(value = "result_code")
    public String getResultCode() {
        return resultCode;
    }

    @EntityName(value = "appid")
    public String getAppId() {
        return appId;
    }

    @EntityName(value = "mch_id")
    public String getMchId() {
        return mchId;
    }

    @EntityName(value = "device_info")
    public String getDeviceInfo() {
        return deviceInfo;
    }

    @EntityName(value = "nonce_str")
    public String getNonceStr() {
        return nonceStr;
    }

    @EntityName(value = "sign")
    public String getSign() {
        return sign;
    }

    @EntityName(value = "err_code")
    public String getErrCode() {
        return errCode;
    }

    @EntityName(value = "err_code_des")
    public String getErrCodeDes() {
        return errCodeDes;
    }

    @EntityName(value = "return_code")
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    @EntityName(value = "return_msg")
    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    @EntityName(value = "result_code")
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @EntityName(value = "appid")
    public void setAppId(String appId) {
        this.appId = appId;
    }

    @EntityName(value = "mch_id")
    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    @EntityName(value = "device_info")
    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    @EntityName(value = "nonce_str")
    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    @EntityName(value = "sign")
    public void setSign(String sign) {
        this.sign = sign;
    }

    @EntityName(value = "err_code")
    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    @EntityName(value = "err_code_des")
    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }
}

