package com.connfun.pay.wechat.entity;

import com.connfun.pay.wechat.common.Sign;
import com.connfun.pay.wechat.common.XMLSerializer;

import junit.framework.TestCase;

public class SendRedPackEntityTest extends TestCase {
    
    public void testSerialize() {
        SendRedPackEntity entity = new SendRedPackEntity();

        entity.setMchBillno("mch_billno");
        entity.setSendName("send_name");
        entity.setReOpenId("re_openid");
        entity.setTotalAmount("1000");
        entity.setTotalNum("1");
        entity.setWishing("wishing");
        entity.setClientIp("127.0.0.1");
        entity.setActName("act_name");
        entity.setRemark("remark");

        try {
            entity.setSign(Sign.sign(entity));

            assertTrue(entity.legal());

            String xml = XMLSerializer.serialize(entity);
            System.out.println(xml);
        }
        catch (Exception e) {
            fail();
        }
    }

}

