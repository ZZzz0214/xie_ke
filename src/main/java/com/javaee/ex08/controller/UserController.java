package com.javaee.ex08.controller;

import com.javaee.ex08.po.Publisher;
import com.javaee.ex08.po.User;
import com.javaee.ex08.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/User")
public class UserController {
    @Resource
    private UserService UserService;
    @RequestMapping("/find_userById")
    public String finduserByid(int UserId,Model model)
    {
        System.out.println(UserId);
        model.addAttribute("user", UserService.findUserById(UserId));
        return "User/finduserById";
    }
    @RequestMapping("/to_login")
    public  String to_login()
    {
        return "User/login";
    }
    @RequestMapping("/user_login")
    public  String user_login(String login_name,int password){
        List<User> user_List=UserService.findUserAll();
        for (User user : user_List)
        {
            if(user.getLoginName().equals(login_name) &&user.getPassword()==password)
            {
                return "User/success";
            }

        }
        return "forward:/index.jsp";
    }
    @RequestMapping("/sign_in")
    public String user_sign(User user){
    return "User/signIn";
    }
    @RequestMapping("/signIn")
    public String signIn(User user){
        System.out.println(user.getLoginName());
        System.out.println(user.getPassword());
        System.out.println(user.getUserName());
        System.out.println(user.getMobile());

        int count=UserService.userSignUp(user);
        System.out.println("成功了"+count+"条信息");
        return "User/success";
    }

    @RequestMapping("/user_list")
    public ResponseEntity<List<User>> user_list() {
        List<User> users = UserService.findUserAll();
        return ResponseEntity.ok(users);
    }
    @RequestMapping("/user_list_1")
    public List<User> user_list_1() {
        List<User> users = UserService.findUserAll();
        return users;
    }
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
