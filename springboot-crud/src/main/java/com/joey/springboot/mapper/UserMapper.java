package com.joey.springboot.mapper;

import com.joey.springboot.model.Book;
import com.joey.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
   public Integer getUserByNameAndPass(Map map);

}
