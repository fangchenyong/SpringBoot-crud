package com.joey.springboot.service.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.joey.springboot.mapper.BookMapper;
import com.joey.springboot.mapper.UserMapper;
import com.joey.springboot.model.Book;
import com.joey.springboot.model.User;
import com.joey.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 〈用户登录〉
 *
 * @author Joey
 * @create 2018-12-12
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer getUserByNameAndPass(Map map){
        System.out.println("进入service层");
        return userMapper.getUserByNameAndPass(map);
    }

}
