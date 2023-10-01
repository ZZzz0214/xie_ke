package com.javaee.demo.service.com.javaee.demo.service.impl;

import com.javaee.demo.mapper.AdminMapper;
import com.javaee.demo.po.Admin;
import com.javaee.demo.po.PageInfo;
import com.javaee.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    // 注入UserDao
    @Autowired
    private AdminMapper adminMapper;
    public Admin findAdmin(Admin admin) {

        Admin a = adminMapper.findAdmin(admin);
        return a;
    }
    public List<Admin> getAll(){

        List<Admin> adminList = adminMapper.getAll();
        System.out.println(adminList);
        return adminList;
    }
    public PageInfo<Admin> findPageInfo(String a_username, String a_describe, Integer a_id, Integer pageIndex, Integer pageSize) {
        PageInfo<Admin> pi = new PageInfo<Admin>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        //获取总条数
        Integer totalCount = adminMapper.totalCount(a_username,a_describe,a_id);
        if (totalCount>0){
            pi.setTotalCount(totalCount);
            //每一页显示管理员信息数
            //currentPage = (pageIndex-1)*pageSize  当前页码数减1*最大条数=开始行数
            List<Admin> adminList =	adminMapper.getAdminList(a_username,a_describe,a_id,
                    (pi.getPageIndex()-1)*pi.getPageSize(),pi.getPageSize());
            pi.setList(adminList);
        }
        return pi;
    }
    public int addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }
    public int deleteAdmin(Integer a_id) {
        return adminMapper.deleteAdmin(a_id);
    }
    public int updateAdmin(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }
    public Admin findAdminById (Integer a_id){
        Admin a = adminMapper.findAdminById(a_id);
        return  a;
    }

}
