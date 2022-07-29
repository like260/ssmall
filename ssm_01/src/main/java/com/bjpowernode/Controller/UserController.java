package com.bjpowernode.Controller;

import com.bjpowernode.pojo.User;
import com.bjpowernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/showAll")
    @ResponseBody
    public Object showList(HttpServletRequest request){
        List<User> list = userService.searchAll();
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++++++++++++++");
        request.setAttribute("list",list);
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_Service.xml");
//        UserService userService = (UserService) ac.getBean("userServiceImpl");
//        List<User> list = userService.searchAll();

        /*List<User> list = new ArrayList<>();
        list.add(new User(12,"aaa" ,"aaaa"));
        list.add(new User(13,"bbb","bbbb"));
        list.add(new User(14,"ccc","cccc"));
        list.add(new User(15,"ddd","dddd"));
        list.add(new User(16,"eee","eeee"));
        list.add(new User(17,"fff","ffff"));*/
        return list;
    }


}
