package com.connfun.pay.wechat.entity;

import com.connfun.pay.wechat.common.EntityName;

public class UnifiedOrderResponseEntity extends BaseResponseEntity {
    private String tradeType;
    private String prepayId;
    private String codeUrl;

    @EntityName(value = "trade_type")
    public String getTradeType() {
        return tradeType;
    }

    @EntityName(value = "prepare_id")
    public String getPrepayId() {
        return prepayId;
    }

    @EntityName(value = "code_url")
    public String getCodeUrl() {
        return codeUrl;
    }

    @EntityName(value = "trade_type")
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    @EntityName(value = "prepay_id")
    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    @EntityName(value = "code_url")
    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }
}

