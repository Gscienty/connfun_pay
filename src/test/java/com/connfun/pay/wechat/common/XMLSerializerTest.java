package com.connfun.pay.wechat.common;

import junit.framework.TestCase;

import com.connfun.pay.common.EntityName;
import com.connfun.pay.wechat.entity.BaseEntity;
import com.connfun.pay.wechat.entity.UnifiedOrderResponseEntity;

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

    public void testSerialize() {
        Configure.getInstance().setAppId("wxd930ea5d5a258f4f");
        Configure.getInstance().setKey("192006250b4c09247ec02edce69f6a2d");
        Configure.getInstance().setMchId("10000100");
        Configure.getInstance().setSignType(SignType.MD5);

        SignTestEntity entity = new SignTestEntity();
        entity.setNonceStr("ibuaiVcKdpRxkhJA");
        entity.setSignType(null);

        String xmlContent = XMLSerializer.serialize(entity);
        System.out.println(xmlContent);
    }

    public void testDeserialize() {
        String msg = "<xml>"
                + "<return_code><![CDATA[SUCCESS]]></return_code>"
                + "<return_msg><![CDATA[OK]]></return_msg>"
                + "<appid><![CDATA[wx2421b1c4370ec43b]]></appid>"
                + "<mch_id><![CDATA[10000100]]></mch_id>"
                + "<device_info><![CDATA[1000]]></device_info>"
                + "<nonce_str><![CDATA[TN55wO9Pba5yENl8]]></nonce_str>"
                + "<sign><![CDATA[BDF0099C15FF7BC6B1585FBB110AB635]]></sign>"
                + "<result_code><![CDATA[SUCCESS]]></result_code>"
                + "<openid><![CDATA[oUpF8uN95-Ptaags6E_roPHg7AG0]]></openid>"
                + "<trade_type><![CDATA[MICROPAY]]></trade_type>"
                + "<prepay_id><![CDATA[wx201411101639507cbf6ffd8b0779950874]]></prepay_id>"
                + "</xml>";

        try {
            UnifiedOrderResponseEntity resp = XMLSerializer.deserialize(msg, UnifiedOrderResponseEntity.class);
            TestCase.assertEquals("BDF0099C15FF7BC6B1585FBB110AB635", resp.getSign());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

