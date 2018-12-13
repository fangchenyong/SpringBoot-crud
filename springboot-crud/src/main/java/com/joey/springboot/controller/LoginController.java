package com.joey.springboot.controller;

import com.joey.springboot.mapper.UserMapper;
import com.joey.springboot.model.User;
import com.joey.springboot.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 〈登录跳转控制器〉
 *
 * @author Joey
 * @create 2018-12-12
 * @since 1.0.0
 */

@Controller
@RequestMapping("/joey")
public class LoginController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request, RedirectAttributesModelMap redirect, HttpSession session){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("UserName:" + username);
        System.out.println("password:" + password);
        Map parMap = new HashMap();
        parMap.put("username",username);
        parMap.put("password",password);
        System.out.println(parMap);
        //Map map =  userMapper.getUserByNameAndPass(parMap);
        //System.out.println(map);
        int user = userService.getUserByNameAndPass(parMap);
        System.out.println(user);
        if(user==0){
            System.out.println("index");
            session.setAttribute("message","用户名不存在或密码错误！");
            redirect.addAttribute("msg","用户名不存在或密码错误！");
            return "redirect:";
        }else {
            System.out.println("js/index");
            return "redirect:/public/index.html";
        }
    }
}
