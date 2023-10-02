package com.javaee.demo.mapper;

import com.javaee.demo.po.Warehouseman;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WarehousemanMapper {

    public Warehouseman findWarehouseman(Warehouseman warehouseman);
    //获取总条数
    public Integer totalCount(@Param("a_username") String a_username, @Param("a_describe") String a_describe, @Param("a_id") Integer a_id);
    //获取用户列表
    public List<Warehouseman> getWarehousemanList(@Param("a_username") String a_username, @Param("a_describe") String a_describe, @Param("a_id") Integer a_id, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

    public int addWarehouseman(Warehouseman warehouseman);    //添加管理员信息
    public int deleteWarehouseman(Integer w_id);   //删除管理员信息
    public int updateWarehouseman(Warehouseman warehouseman); //修改管理员信息
    public Warehouseman findWarehousemanById(Integer w_id);
    public List<Warehouseman> getAll();
}
