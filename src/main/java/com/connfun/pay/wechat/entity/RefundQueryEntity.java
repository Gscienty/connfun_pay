package com.connfun.pay.wechat.entity;

import com.connfun.pay.wechat.common.Configure;
import com.connfun.pay.wechat.common.EntityName;

public class RefundQueryEntity extends BaseEntity {

    private String transactionId;
    private String outTradeNo;
    private String outRefundNo;
    private String refundId;
    private Integer offset;

    public RefundQueryEntity() {
        super();
    }

    public String getWebAPI() {
        return Configure.PAY_REFUND_QUERY_WEBAPI;
    }

    @Override
    public boolean legal() {

        if ((this.transactionId != null && this.outTradeNo == null && this.outRefundNo == null && this.refundId == null) ||
            (this.transactionId == null && this.outTradeNo != null && this.outRefundNo == null && this.refundId == null) ||
            (this.transactionId == null && this.outTradeNo == null && this.outRefundNo != null && this.refundId == null) ||
            (this.transactionId == null && this.outTradeNo == null && this.outRefundNo == null && this.refundId != null)) {

            return super.legal();
        }

        return false;
    }

    @EntityName(value = "transaction_id")
    public String getTransactionId() {
        return transactionId;
    }

    @EntityName(value = "out_trade_no")
    public String getOutTradeNo() {
        return outTradeNo;
    }

    @EntityName(value = "out_refund_no")
    public String getOutRefundNo() {
        return outRefundNo;
    }

    @EntityName(value = "refund_id")
    public String getRefundId() {
        return refundId;
    }

    @EntityName(value = "offset")
    public Integer getOffset() {
        return offset;
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

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}

