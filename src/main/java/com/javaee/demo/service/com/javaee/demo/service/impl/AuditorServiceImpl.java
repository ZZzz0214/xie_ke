package com.javaee.demo.service.com.javaee.demo.service.impl;

import com.javaee.demo.mapper.AuditorMapper;
import com.javaee.demo.mapper.AuditorMapper;
import com.javaee.demo.mapper.AuditorMapper;
import com.javaee.demo.po.Auditor;
import com.javaee.demo.po.Auditor;
import com.javaee.demo.po.PageInfo;
import com.javaee.demo.service.AuditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AuditorServiceImpl implements AuditorService {
    // 注入UserDao
    @Autowired
    private AuditorMapper auditorMapper;
    public Auditor findAuditor(Auditor auditor) {
        System.out.println(auditor.getAaUsername());
        System.out.println(auditor.getAaPassword());
        Auditor a = auditorMapper.findAuditor(auditor);
        return a;
    }
    public List<Auditor> getAll(){

        List<Auditor> auditorList = auditorMapper.getAll();
        System.out.println(auditorList);
        return auditorList;
    }
    public PageInfo<Auditor> findPageInfo(String a_username, String a_describe, Integer a_id, Integer pageIndex, Integer pageSize) {
        PageInfo<Auditor> pi = new PageInfo<Auditor>();
        pi.setPageIndex(pageIndex);
        pi.setPageSize(pageSize);
        //获取总条数
        Integer totalCount = auditorMapper.totalCount(a_username,a_describe,a_id);
        if (totalCount>0){
            pi.setTotalCount(totalCount);
            //每一页显示管理员信息数
            //currentPage = (pageIndex-1)*pageSize  当前页码数减1*最大条数=开始行数
            List<Auditor> auditorList =	auditorMapper.getAuditorList(a_username,a_describe,a_id,
                    (pi.getPageIndex()-1)*pi.getPageSize(),pi.getPageSize());
            pi.setList(auditorList);
        }
        return pi;
    }
    public int addAuditor(Auditor auditor) {
        return auditorMapper.addAuditor(auditor);
    }
    public int deleteAuditor(Integer a_id) {
        return auditorMapper.deleteAuditor(a_id);
    }
    public int updateAuditor(Auditor auditor) {
        return auditorMapper.updateAuditor(auditor);
    }
    public Auditor findAuditorById (Integer a_id){
        Auditor a = auditorMapper.findAuditorById(a_id);
        return  a;
    }
}
