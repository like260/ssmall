package com.bjpowernode.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getSession().getAttribute("flag") == null){
            request.setAttribute("msg","请先登录！！");
            request.getRequestDispatcher("/WEB-INF/admin/login.jsp").forward(request,response);
            return false;
        }
        return true;
    }
}
