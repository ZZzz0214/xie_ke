package com.javaee.demo.po;

public class Auditor {


    public int getAaId() {
        return aaId;
    }

    public void setAaId(int aaId) {
        this.aaId = aaId;
    }

    public String getAaName() {
        return aaName;
    }

    public void setAaName(String aaName) {
        this.aaName = aaName;
    }

    public String getAaUsername() {
        return aaUsername;
    }

    public void setAaUsername(String aaUsername) {
        this.aaUsername = aaUsername;
    }

    public String getAaPassword() {
        return aaPassword;
    }

    public void setAaPassword(String aaPassword) {
        this.aaPassword = aaPassword;
    }

    public String getAaDescribe() {
        return aaDescribe;
    }

    public void setAaDescribe(String aaDescribe) {
        this.aaDescribe = aaDescribe;
    }

    private int aaId;//审核人id
    private String aaName;//审核人姓名
    private String aaUsername;//审核人账号
    private String aaPassword;//审核人密码
    private String aaDescribe;//审核人描述

}
