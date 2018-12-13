package com.joey.springboot.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.joey.springboot.model.Book;

@Mapper
public interface BookMapper {
   public List<Book> getAllBooks();
   public Map getBookById(int id);
}
