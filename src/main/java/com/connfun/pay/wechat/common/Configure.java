package com.connfun.pay.wechat.common;

public class Configure {
    public static String KEY                       = "";
    public static String APP_ID                    = "";
    public static String MCH_ID                    = "";
    public static String SUB_MCH_ID                = "";
    public static String CERT_PATH                 = "";
    public static String CERT_PASSWD               = "";

    public static String QRCODE_API                = "weixin://wxpay/qrcode_url";
    public static String DEVICE_INFO               = "WEB";
    public static String NOTIFY_URL                = "http://localhost";

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

    public static SignType SIGN_TYPE             = SignType.MD5;
}

