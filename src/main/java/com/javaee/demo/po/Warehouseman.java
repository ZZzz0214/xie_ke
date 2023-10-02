package com.javaee.demo.po;

public class Warehouseman {
    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public String getwName() {
        return wName;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }

    public String getwUsername() {
        return wUsername;
    }

    public void setwUsername(String wUsername) {
        this.wUsername = wUsername;
    }

    public String getwPassword() {
        return wPassword;
    }

    public void setwPassword(String wPassword) {
        this.wPassword = wPassword;
    }

    public String getwDescribe() {
        return wDescribe;
    }

    public void setwDescribe(String wDescribe) {
        this.wDescribe = wDescribe;
    }

    private int wId;//仓库人Id
    private String wName;//仓库人名字
    private String wUsername;//仓库人账号
    private String wPassword;//仓库人密码
    private String wDescribe;//仓库人描述

}
