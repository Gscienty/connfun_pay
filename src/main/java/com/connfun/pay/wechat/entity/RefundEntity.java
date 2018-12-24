package com.connfun.pay.wechat.entity;

import com.connfun.pay.wechat.common.Configure;
import com.connfun.pay.common.EntityName;
import com.connfun.pay.common.RequireField;

public class RefundEntity extends BaseEntity {

    private String transactionId;
    private String outTradeNo;
    private String outRefundNo;
    private Integer totalFee;
    private Integer refundFee;
    private String refundFeeType;
    private String refundDesc;
    private String refundAccount;
    private String notifyUrl;

    public RefundEntity() {
        super();
    }
    
    public String getWebAPI() {
        return Configure.PAY_REFUND_WEBAPI;
    }

    @Override
    public boolean legal() {
        if (this.transactionId == null && this.outTradeNo == null) {
            return false;
        }
        if (this.transactionId != null && this.outTradeNo != null) {
            return false;
        }

        return super.legal();
    }

    @EntityName(value = "transaction_id")
    public String getTransactionId() {
        return transactionId;
    }

    @EntityName(value = "out_trade_no")
    public String getOutTradeNo() {
        return outTradeNo;
    }

    @RequireField
    @EntityName(value = "out_refund_no")
    public String getOutRefundNo() {
        return outRefundNo;
    }

    @RequireField
    @EntityName(value = "total_fee")
    public Integer getTotalFee() {
        return totalFee;
    }

    @RequireField
    @EntityName(value = "refund_fee")
    public Integer getRefundFee() {
        return refundFee;
    }

    @EntityName(value = "refund_fee_type")
    public String getRefundFeeType() {
        return refundFeeType;
    }

    @EntityName(value = "refund_desc")
    public String getRefundDesc() {
        return refundDesc;
    }

    @EntityName(value = "refund_account")
    public String getRefundAccount() {
        return refundAccount;
    }

    @EntityName(value = "notify_url")
    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public void setRefundFee(Integer refundFee) {
        this.refundFee = refundFee;
    }

    public void setRefundFeeType(String refundFeeType) {
        this.refundFeeType = refundFeeType;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}

