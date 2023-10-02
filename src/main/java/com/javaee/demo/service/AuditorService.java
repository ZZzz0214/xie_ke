package com.javaee.demo.service;

import com.javaee.demo.po.Auditor;
import com.javaee.demo.po.PageInfo;

import java.util.List;

public interface AuditorService {
    // 通过账号和密码查询用户
    public Auditor findAuditor(Auditor auditor);


    //找到所有所有数据
    public List<Auditor> getAll();

    //分页查询
    public PageInfo<Auditor> findPageInfo(String a_username, String a_describe, Integer a_id, Integer pageIndex, Integer pageSize);

    public int addAuditor(Auditor auditor);    //添加管理员信息
    public int deleteAuditor(Integer aa_id);   //删除管理员信息
    public int updateAuditor(Auditor auditor); //修改管理员信息
    public Auditor findAuditorById(Integer aa_id);
}
