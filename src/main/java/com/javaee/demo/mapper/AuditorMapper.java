package com.javaee.demo.mapper;

import com.javaee.demo.po.Auditor;
import com.javaee.demo.po.Auditor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuditorMapper {

    public Auditor findAuditor(Auditor auditor);
    //获取总条数
    public Integer totalCount(@Param("a_username") String a_username, @Param("a_describe") String a_describe, @Param("a_id") Integer a_id);
    //获取用户列表
    public List<Auditor> getAuditorList(@Param("a_username") String a_username, @Param("a_describe") String a_describe, @Param("a_id") Integer a_id, @Param("currentPage") Integer currentPage, @Param("pageSize") Integer pageSize);

    public int addAuditor(Auditor auditor);    //添加管理员信息
    public int deleteAuditor(Integer aa_id);   //删除管理员信息
    public int updateAuditor(Auditor auditor); //修改管理员信息
    public Auditor findAuditorById(Integer aa_id);
    public List<Auditor> getAll();
}
