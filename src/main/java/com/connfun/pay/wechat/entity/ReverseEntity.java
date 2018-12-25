package com.connfun.pay.wechat.entity;

import com.connfun.pay.wechat.common.Configure;
import com.connfun.pay.common.EntityName;

public class ReverseEntity extends BaseEntity {
    private String transactionId;
    private String outTradeNo;

    public ReverseEntity() {
        super();
    }

    public String getWebAPI() {
        return Configure.REVERSE_WEBAPI;
    }

    public Boolean security() {
        return true;
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

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }
}

