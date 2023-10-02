package com.javaee.demo.po;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigInteger;
import java.util.Date;

public class OObject {
    private int oId;//物品Id
    private String oName;//物品名
    private String oType;//物品类型
    private BigInteger oNumber;//物品在库数目
    private BigInteger oInNumber;//物品入库数目
    private int oInType;//物品入库类型
    private BigInteger oOutNumber;//物品出库数目
    private int oOutType;//物品出库状态
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date oInTime;//物品入库时间
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date oOutTime;//物品出库时间
    private  int oAuditorId;
    private int oWarehousemanId;

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public String getoType() {
        return oType;
    }

    public void setoType(String oType) {
        this.oType = oType;
    }

    public BigInteger getoNumber() {
        return oNumber;
    }

    public void setoNumber(BigInteger oNumber) {
        this.oNumber = oNumber;
    }

    public BigInteger getoInNumber() {
        return oInNumber;
    }

    public void setoInNumber(BigInteger oInNumber) {
        this.oInNumber = oInNumber;
    }

    public int getoInType() {
        return oInType;
    }

    public void setoInType(int oInType) {
        this.oInType = oInType;
    }

    public BigInteger getoOutNumber() {
        return oOutNumber;
    }

    public void setoOutNumber(BigInteger oOutNumber) {
        this.oOutNumber = oOutNumber;
    }

    public int getoOutType() {
        return oOutType;
    }

    public void setoOutType(int oOutType) {
        this.oOutType = oOutType;
    }

    public Date getoInTime() {
        return oInTime;
    }

    public void setoInTime(Date oInTime) {
        this.oInTime = oInTime;
    }

    public Date getoOutTime() {
        return oOutTime;
    }

    public void setoOutTime(Date oOutTime) {
        this.oOutTime = oOutTime;
    }

    public int getoAuditorId() {
        return oAuditorId;
    }

    public void setoAuditorId(int oAuditorId) {
        this.oAuditorId = oAuditorId;
    }

    public int getoWarehousemanId() {
        return oWarehousemanId;
    }

    public void setoWarehousemanId(int oWarehousemanId) {
        this.oWarehousemanId = oWarehousemanId;
    }




}
