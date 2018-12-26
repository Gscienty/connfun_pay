package com.connfun.pay.wechat.common;

public class Configure {
    
    private String key;
    private String appId;
    private String mchId;
    private SignType signType;
    private String qrcodeApi;
    private String deviceInfo;
    private String notifyUrl;
    private String certPath;
    private String certPasswd;

    public static String MICRO_PAY_WEBAPI          = "https://api.mch.qq.com/pay/micropay";
    public static String PAY_WEBAPI                = "https://api.mch.weixin.qq.com/pay/micropay";
    public static String PAY_QUERY_WEBAPI          = "https://api.mch.weixin.qq.com/pay/orderquery";
    public static String PAY_REFUND_WEBAPI         = "https://api.mch.weixin.qq.com/secapi/pay/refund";
    public static String PAY_REFUND_QUERY_WEBAPI   = "https://api.mch.weixin.qq.com/pay/refundquery";
    public static String REVERSE_WEBAPI            = "https://api.mch.weixin.qq.com/secapi/pay/reverse";
    public static String DOWNLOAD_BILL_WEBAPI      = "https://api.mch.weixin.qq.com/pay/downloadbill";
    public static String REPORT_WEBAPI             = "https://api.mch.weixin.qq.com/payitil/report";
    public static String UNIFIFED_ORDER_WEBAPI     = "https://api.mch.weixin.qq.com/pay/unifiedorder";
    public static String DOWNLOAD_FUND_FLOW_WEBAPI = "https://api.mch.weixin.qq.com/pay/downloadfundflow";
    public static String SEND_RED_PACK_WEBAPI      = "https://api.mch.weixin.qq.com/mmpaymkttransfers/sendredpack";


    private Configure() {

    }

    public static Configure getInstance() {
        return ConfigureHolder.INSTANCE;
    }

    private static class ConfigureHolder {
        private static final Configure INSTANCE = new Configure();
    }

    public String getKey() {
        return key;
    }

    public String getAppId() {
        return appId;
    }

    public String getMchId() {
        return mchId;
    }

    public SignType getSignType() {
        return signType;
    }

    public String getQrcodeApi() {
        return qrcodeApi;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public String getCertPath() {
        return certPath;
    }

    public String getCertPasswd() {
        return certPasswd;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public void setSignType(SignType signType) {
        this.signType = signType;
    }

    public void setQrcodeApi(String qrcodeApi) {
        this.qrcodeApi = qrcodeApi;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public void setCertPath(String certPath) {
        this.certPath = certPath;
    }

    public void setCertPasswd(String certPasswd) {
        this.certPasswd = certPasswd;
    }
}

