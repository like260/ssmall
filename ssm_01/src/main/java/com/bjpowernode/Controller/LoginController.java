package com.bjpowernode.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String doLogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if("张三".equals(username) && "123".equals(password)){
            request.getSession().setAttribute("flag",username);
            return "/main";
        }else
        return "/login";
    }
}
