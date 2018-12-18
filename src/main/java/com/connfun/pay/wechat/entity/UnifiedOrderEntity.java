package com.connfun.pay.wechat.entity;

import com.connfun.pay.wechat.common.Configure;
import com.connfun.pay.wechat.common.EntityName;
import com.connfun.pay.wechat.common.RequireField;
import com.connfun.pay.wechat.common.TradeType;

public class UnifiedOrderEntity extends BaseEntity {

    private String body;
    private String detail;
    private String attach;
    private String outTradeNo;
    private String feeType;
    private Integer totalFee;
    private String spbillCreateIP;
    private String timeStart;
    private String timeExpire;
    private String goodsTag;
    private String notifyURL;
    private String tradeType;
    private String productId;
    private String limitPay;
    private String openId;
    private String receipt;
    private String sceneInfo;


    public UnifiedOrderEntity() {
        super();
    }

    public String getWebAPI() {
        return Configure.UNIFIFED_ORDER_WEBAPI;
    }

    @Override
    public boolean legal() {

        if (TradeType.Native.equals(this.tradeType) && this.productId == null) {
            return false;
        }
        if (TradeType.JSAPI.equals(this.tradeType) && this.openId == null) {
            return false;
        }

        return super.legal();
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

    @EntityName(value = "fee_type")
    public String getFeeType() {
        return feeType;
    }

    @RequireField
    @EntityName(value = "total_fee")
    public Integer getTotalFee() {
        return totalFee;
    }

    @RequireField
    @EntityName(value = "spbill_create_ip")
    public String getSpbillCreateIP() {
        return spbillCreateIP;
    }

    @EntityName(value = "time_start")
    public String getTimeStart() {
        return timeStart;
    }

    @EntityName(value = "time_expire")
    public String getTimeExpire() {
        return timeExpire;
    }

    @EntityName(value = "goods_tag")
    public String getGoodsTag() {
        return goodsTag;
    }

    @RequireField
    @EntityName(value = "Notify_url")
    public String getNotifyURL() {
        return notifyURL;
    }

    @RequireField
    @EntityName(value = "trade_type")
    public String getTradeType() {
        return tradeType;
    }

    @EntityName(value = "product_id")
    public String getProductId() {
        return productId;
    }

    @EntityName(value = "limit_pay")
    public String getLimitPay() {
        return limitPay;
    }

    @EntityName(value = "open_id")
    public String getOpenId() {
        return openId;
    }

    @EntityName(value = "receipt")
    public String getReceipt() {
        return receipt;
    }

    @EntityName(value = "scene_info")
    public String getSceneInfo() {
        return sceneInfo;
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

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public void setSpbillCreateIP(String spbillCreateIP) {
        this.spbillCreateIP = spbillCreateIP;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public void setTimeExpire(String timeExpire) {
        this.timeExpire = timeExpire;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public void setNotifyURL(String notifyURL) {
        this.notifyURL = notifyURL;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public void setSceneInfo(String sceneInfo) {
        this.sceneInfo = sceneInfo;
    }
}

