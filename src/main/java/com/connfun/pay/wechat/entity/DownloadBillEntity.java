package com.connfun.pay.wechat.entity;

import com.connfun.pay.wechat.common.Configure;
import com.connfun.pay.wechat.common.EntityName;
import com.connfun.pay.wechat.common.RequireField;

public class DownloadBillEntity extends BaseEntity {
    
    private String billDate;
    private String billType;
    private String tarType;

    public DownloadBillEntity() {
        super();
    }

    public String getWebAPI() {
        return Configure.DOWNLOAD_BILL_WEBAPI;
    }

    @RequireField
    @EntityName(value = "bill_date")
    public String getBillDate() {
        return billDate;
    }

    @RequireField
    @EntityName(value = "bill_type")
    public String getBillType() {
        return billType;
    }

    @EntityName(value = "tar_type")
    public String getTarType() {
        return tarType;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public void setTarType(String tarType) {
        this.tarType = tarType;
    }
}
