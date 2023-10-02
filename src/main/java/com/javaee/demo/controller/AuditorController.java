package com.javaee.demo.controller;

import com.javaee.demo.mapper.AuditorMapper;
import com.javaee.demo.po.Admin;
import com.javaee.demo.po.Auditor;
import com.javaee.demo.service.AdminService;
import com.javaee.demo.service.AuditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Auditor")//审核人控制层
public class AuditorController {
    @Autowired
    private AuditorService auditorService;
    @RequestMapping(value = "/login")
    public String login(Auditor auditor, Model model, HttpSession session, HttpServletRequest request) {
        // 通过账号和密码查询用户

        Auditor ad = auditorService.findAuditor(auditor);

        if(ad!=null){
            session.setAttribute("ad", ad);
            System.out.println("运行成功！");
            return "User/success";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录！");
        return "User/fail";
    }

    /**
     * 退出登录
     */
    @RequestMapping(value = "/loginOut")
    public String loginOut(Admin admin, Model model, HttpSession session) {
        session.invalidate();
        return "forwward:/index.jsp";
    }
    }
