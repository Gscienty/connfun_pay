package com.connfun.pay.wechat.common;

import junit.framework.TestCase;

import com.connfun.pay.wechat.entity.BaseEntity;

public class XMLSerializerTest extends TestCase {

    class SignTestEntity extends BaseEntity {

        private String deviceInfo = "1000";
        private String body = "test";

        public SignTestEntity() {
            super();
        }

        public String getWebAPI() {
            return "";
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

    public void testSerialize() {
        Configure.APP_ID = "wxd930ea5d5a258f4f";
        Configure.KEY = "192006250b4c09247ec02edce69f6a2d";
        Configure.MCH_ID = "10000100";
        Configure.SIGN_TYPE = SignType.MD5;

        SignTestEntity entity = new SignTestEntity();
        entity.setNonceStr("ibuaiVcKdpRxkhJA");
        entity.setSignType(null);

        String xmlContent = XMLSerializer.serialize(entity);

        TestCase.assertEquals("<xml><body>test</body><device_info>1000</device_info><nonce_str>ibuaiVcKdpRxkhJA</nonce_str><appid>wxd930ea5d5a258f4f</appid><mch_id>10000100</mch_id></xml>",
                xmlContent);
    }
}

