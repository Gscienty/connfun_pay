package com.connfun.pay.wechat.entity;

import com.connfun.pay.common.EntityName;

public class SendRedPackResponseEntity extends BaseResponseEntity {
    private String mchBillno;
    private String wxAppId;
    private String reOpenId;
    private String totalAmount;
    private String sendListId;

    @EntityName(value = "mch_billno")
    public String getMchBillno() {
        return mchBillno;
    }

    @EntityName(value = "wxappid")
    public String getWxAppId() {
        return wxAppId;
    }

    @EntityName(value = "re_openid")
    public String getReOpenId() {
        return reOpenId;
    }

    @EntityName(value = "total_amount")
    public String getTotalAmount() {
        return totalAmount;
    }

    @EntityName(value = "sentlistid")
    public String getSendListId() {
        return sendListId;
    }

    @EntityName(value = "mch_billno")
    public void setMchBillno(String mchBillno) {
        this.mchBillno = mchBillno;
    }

    @EntityName(value = "wxappid")
    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId;
    }

    @EntityName(value = "re_openid")
    public void setReOpenId(String reOpenId) {
        this.reOpenId = reOpenId;
    }

    @EntityName(value = "total_amount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @EntityName(value = "send_listid")
    public void setSendListId(String sendListId) {
        this.sendListId = sendListId;
    }
}

