package com.javaee.demo.controller;

import com.javaee.demo.po.Admin;
import com.javaee.demo.po.User;
import com.javaee.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping(value = "/login")
    public String login(Admin admin, Model model, HttpSession session, HttpServletRequest request) {
        // 通过账号和密码查询用户
//		System.out.println("!!!");
//		System.out.println(admin.getA_password());
//		admin.setA_password(MD5Util.MD5EncodeUtf8(admin.getA_password()));
//		System.out.println(MD5Util.MD5EncodeUtf8(admin.getA_password()));
//		System.out.println(admin);

        Admin ad = adminService.findAdmin(admin);

        if(ad!=null){
            session.setAttribute("ad", ad);
            System.out.println("运行成功！");
            return "User/success";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录！");
        return "User/fail";
    }

}
