package com.connfun.pay.wechat.common;

public class TradeType {

    public final static TradeType JSAPI  = new TradeType("JSAPI");
    public final static TradeType Native = new TradeType("NATIVE");
    public final static TradeType APP    = new TradeType("APP");
    public final static TradeType HTML5  = new TradeType("MWEB");

    private String value;

    private TradeType(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    public boolean equals(String value) {
        return this.value.equals(value);
    }
}

