package com.shop.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/index")
    public String toIndex(Model model){
        //从shiro中得到主体对象
        Subject subject = SecurityUtils.getSubject();
        //从主体对象当中得到用户身份信息，这里就用户名
        String userName = (String) subject.getPrincipal();
        model.addAttribute("username",userName);
        return "index";
    }
}
