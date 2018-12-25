package com.connfun.pay.wechat.entity;

import com.connfun.pay.wechat.common.Configure;
import com.connfun.pay.common.EntityName;
import com.connfun.pay.common.RequireField;

public class MicroPayEntity extends BaseEntity {
    private String deviceInfo;
    private String body;
    private String detail;
    private String attach;
    private String outTradeNo;
    private Integer totalFee;
    private String feeType;
    private String spbillCreateIP;
    private String goodsTag;
    private String limitPay;
    private String timeStart;
    private String timeExpire;
    private String receipt;
    private String authCode;
    private String sceneInfo;


    public MicroPayEntity() {
        super();
    }

    public String getWebAPI() {
        return Configure.MICRO_PAY_WEBAPI;
    }

    public Boolean security() {
        return false;
    }

    @EntityName(value = "device_info")
    public String getDeviceInfo() {
        return deviceInfo;
    }

    @RequireField
    @EntityName(value = "body")
    public String getBody() {
        return body;
    }

    @EntityName(value = "detail")
    public String getDetail() {
        return detail;
    }

    @EntityName(value = "attach")
    public String getAttach() {
        return attach;
    }
    
    @RequireField
    @EntityName(value = "out_trade_no")
    public String getOutTradeNo() {
        return outTradeNo;
    }

    @RequireField
    @EntityName(value = "total_fee")
    public Integer getTotalFee() {
        return totalFee;
    }

    @RequireField
    @EntityName(value = "fee_type")
    public String getFeeType() {
        return feeType;
    }

    @RequireField
    @EntityName(value = "spbill_create_ip")
    public String getSpbillCreateIP() {
        return spbillCreateIP;
    }

    @EntityName(value = "limit_pay")
    public String getLimitPay() {
        return limitPay;
    }

    @EntityName(value = "goods_tag")
    public String getGoodsTag() {
        return goodsTag;
    }

    @EntityName(value = "time_start")
    public String getTimeStart() {
        return timeStart;
    }

    @EntityName(value = "time_expire")
    public String getTimeExpire() {
        return timeExpire;
    }

    @EntityName(value = "receipt")
    public String getReceipt() {
        return receipt;
    }

    @RequireField
    @EntityName(value = "auth_code")
    public String getAuthCode() {
        return authCode;
    }

    @EntityName(value = "scene_info")
    public String getSceneInfo() {
        return sceneInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
    }

    public void setSpbillCreateIP(String spbillCreateIP) {
        this.spbillCreateIP = spbillCreateIP;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public void setSceneInfo(String sceneInfo) {
        this.sceneInfo = sceneInfo;
    }
}

