package com.javaee.demo.service.com.javaee.demo.service.impl;

import com.javaee.demo.mapper.WarehousemanMapper;
import com.javaee.demo.po.Warehouseman;
import com.javaee.demo.po.PageInfo;
import com.javaee.demo.service.WarehousemanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class WarehousemanServiceImpl implements WarehousemanService {
    // 注入UserDao
    @Autowired
    private WarehousemanMapper warehousemanMapper;
    public Warehouseman findWarehouseman(Warehouseman warehouseman) {

        Warehouseman a = warehousemanMapper.findWarehouseman(warehouseman);
        return a;
    }
    public List<Warehouseman> getAll(){

        List<Warehouseman> warehousemanList = warehousemanMapper.getAll();
        System.out.println(warehousemanList);
        return warehousemanList;
    }
    public PageInfo<Warehouseman> findPageInfo(String a_username, String a_describe, Integer a_id, Integer pageIndex, Integer pageSize) {
        PageInfo<Warehouseman> pi = new PageInfo<Warehouseman>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        //获取总条数
        Integer totalCount = warehousemanMapper.totalCount(a_username,a_describe,a_id);
        if (totalCount>0){
            pi.setTotalCount(totalCount);
            //每一页显示管理员信息数
            //currentPage = (pageIndex-1)*pageSize  当前页码数减1*最大条数=开始行数
            List<Warehouseman> warehousemanList =	warehousemanMapper.getWarehousemanList(a_username,a_describe,a_id,
                    (pi.getPageIndex()-1)*pi.getPageSize(),pi.getPageSize());
            pi.setList(warehousemanList);
        }
        return pi;
    }
    public int addWarehouseman(Warehouseman warehouseman) {
        return warehousemanMapper.addWarehouseman(warehouseman);
    }
    public int deleteWarehouseman(Integer a_id) {
        return warehousemanMapper.deleteWarehouseman(a_id);
    }
    public int updateWarehouseman(Warehouseman warehouseman) {
        return warehousemanMapper.updateWarehouseman(warehouseman);
    }
    public Warehouseman findWarehousemanById (Integer a_id){
        Warehouseman a = warehousemanMapper.findWarehousemanById(a_id);
        return  a;
    }
}
