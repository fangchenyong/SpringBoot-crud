package com.joey.springboot.service;

import com.joey.springboot.model.User;

import java.util.Map;

/**
 * 〈用户登录接口〉
 *
 * @author Joey
 * @create 2018-12-12
 * @since 1.0.0
 */
public interface UserService {
    public Integer getUserByNameAndPass(Map map);
}
