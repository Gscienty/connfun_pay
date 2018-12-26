package com.connfun.pay.wechat.common;

import junit.framework.TestCase;

import com.connfun.pay.common.EntityName;
import com.connfun.pay.wechat.entity.BaseEntity;

public class SignTest extends TestCase {

    class SignTestEntity extends BaseEntity {

        private String deviceInfo = "1000";
        private String body = "test";

        public SignTestEntity() {
            super();
        }

        public String getWebAPI() {
            return "";
        }

        public Boolean security() {
            return false;
        }

        @EntityName(value = "body")
        public String getBody() {
            return body;
        }

        @EntityName(value = "device_info")
        public String getDeviceInfo() {
            return deviceInfo;
        }
    }

    public void testMD5Sign() {
        Configure.getInstance().setAppId("wxd930ea5d5a258f4f");
        Configure.getInstance().setKey("192006250b4c09247ec02edce69f6a2d");
        Configure.getInstance().setMchId("10000100");
        Configure.getInstance().setSignType(SignType.MD5);

        SignTestEntity entity = new SignTestEntity();
        entity.setNonceStr("ibuaiVcKdpRxkhJA");
        entity.setSignType(null);

        try {
            TestCase.assertEquals("9A0A8659F005D6984697E2CA0A9CF3B7", Sign.sign(entity));
        }
        catch (Exception e) {
            e.printStackTrace();

            TestCase.fail();
        }
    }

    public void testHMACSHA256Sign() {
        Configure.getInstance().setAppId("wxd930ea5d5a258f4f");
        Configure.getInstance().setKey("192006250b4c09247ec02edce69f6a2d");
        Configure.getInstance().setMchId("10000100");
        Configure.getInstance().setSignType(SignType.MD5);

        SignTestEntity entity = new SignTestEntity();
        entity.setNonceStr("ibuaiVcKdpRxkhJA");

        try {
            TestCase.assertEquals("2C9DF1156522C0B2B03B4DBF3BCA5CACB602CBD5CA0F9E112458CF3E9855303B", Sign.sign(entity));
        }
        catch (Exception e) {
            e.printStackTrace();

            TestCase.fail();
        }
    }
}

