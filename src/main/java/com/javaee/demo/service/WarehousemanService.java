package com.javaee.demo.service;

import com.javaee.demo.po.Warehouseman;
import com.javaee.demo.po.PageInfo;

import java.util.List;

public interface WarehousemanService {
    // 通过账号和密码查询用户
    public Warehouseman findWarehouseman(Warehouseman warehouseman);


    //找到所有所有数据
    public List<Warehouseman> getAll();

    //分页查询
    public PageInfo<Warehouseman> findPageInfo(String a_username, String a_describe, Integer a_id, Integer pageIndex, Integer pageSize);

    public int addWarehouseman(Warehouseman warehouseman);    //添加管理员信息
    public int deleteWarehouseman(Integer w_id);   //删除管理员信息
    public int updateWarehouseman(Warehouseman warehouseman); //修改管理员信息
    public Warehouseman findWarehousemanById(Integer w_id);
    
}
