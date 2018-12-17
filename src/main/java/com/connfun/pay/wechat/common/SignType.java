package com.connfun.pay.wechat.common;

public class SignType {
    public final static SignType MD5        = new SignType(1 , "MD5"         , true);
    public final static SignType SHA1       = new SignType(2 , "SHA1"        , false);
    public final static SignType HMACSHA256 = new SignType(3 , "HMAC-SHA256" , true);


    private Integer typeCode;
    private String value;
    private boolean support;
    
    private SignType(int typeCode, String value, boolean support) {
        this.typeCode = typeCode;
        this.value    = value;
        this.support  = support;
    }

    public boolean equals(SignType other) {
        return this.typeCode.equals(other.typeCode);
    }

    public boolean getSupport() {
        return support;
    }

    @Override
    public String toString() {
        return value;
    }
}

