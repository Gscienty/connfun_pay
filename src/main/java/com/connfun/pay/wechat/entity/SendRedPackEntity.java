package com.connfun.pay.wechat.entity;

import com.connfun.pay.common.EntityName;
import com.connfun.pay.wechat.common.Configure;

public class SendRedPackEntity extends BaseEntity {

    private String mchBillno;
    private String wxAppId;
    private String sendName;
    private String reOpenId;
    private String totalAmount;
    private String totalNum;
    private String wishing;
    private String clientIp;
    private String actName;
    private String remark;
    private String sceneId;
    private String riskInfo;
    private String consumeMchId;

    public SendRedPackEntity() {
        setAppId(null);
        setSignType(null);
        setMchId(Configure.getInstance().getMchId());
        wxAppId = Configure.getInstance().getAppId();
    }

    public String getWebAPI() {
        return Configure.SEND_RED_PACK_WEBAPI;
    }

    public Boolean security() {
        return true;
    }

    @Override
    public boolean legal() {
        if (getNonceStr() == null) return false;
        if (getSign() == null) return false;
        if (mchBillno == null) return false;
        if (getMchId() == null) return false;
        if (wxAppId == null) return false;
        if (sendName == null) return false;
        if (reOpenId == null) return false;
        if (totalAmount == null) return false;
        if (totalNum == null) return false;
        if (wishing == null) return false;
        if (clientIp == null) return false;
        if (actName == null) return false;
        if (remark == null) return false;

        return true;
    }

    @EntityName(value = "mch_billno")
    public String getMchBillno() {
        return mchBillno;
    }

    @EntityName(value = "wxappid")
    public String getWxAppId() {
        return wxAppId;
    }

    @EntityName(value = "send_name")
    public String getSendName() {
        return sendName;
    }

    @EntityName(value = "re_openid")
    public String getReOpenId() {
        return reOpenId;
    }

    @EntityName(value = "total_amount")
    public String getTotalAmount() {
        return totalAmount;
    }

    @EntityName(value = "total_num")
    public String getTotalNum() {
        return totalNum;
    }

    @EntityName(value = "wishing")
    public String getWishing() {
        return wishing;
    }

    @EntityName(value = "client_ip")
    public String getClientIp() {
        return clientIp;
    }

    @EntityName(value = "act_name")
    public String getActName() {
        return actName;
    }

    @EntityName(value = "remark")
    public String getRemark() {
        return remark;
    }

    @EntityName(value = "scene_id")
    public String getSceneId() {
        return sceneId;
    }

    @EntityName(value = "risk_info")
    public String getRiskInfo() {
        return riskInfo;
    }

    @EntityName(value = "consume_mch_id")
    public String getConsumeMchId() {
        return consumeMchId;
    }

    public void setMchBillno(String mchBillno) {
        this.mchBillno = mchBillno;
    }

    public void setWxAppId(String wxAppId) {
        this.wxAppId = wxAppId;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public void setReOpenId(String reOpenId) {
        this.reOpenId = reOpenId;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    public void setWishing(String wishing) {
        this.wishing = wishing;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public void setRiskInfo(String riskInfo) {
        this.riskInfo = riskInfo;
    }

    public void setConsumeMchId(String consumeMchId) {
        this.consumeMchId = consumeMchId;
    }

}

