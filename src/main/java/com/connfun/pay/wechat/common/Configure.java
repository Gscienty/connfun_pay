package com.connfun.pay.wechat.common;

public class Configure {
    
    private String key;
    private String appId;
    private String mchId;
    private SignType signType;
    private String qrcodeApi;
    private String deviceInfo;
    private String notifyUrl;

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
}

