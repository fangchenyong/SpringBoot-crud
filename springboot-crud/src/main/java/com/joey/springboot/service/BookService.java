package com.joey.springboot.service;

import java.util.List;
import java.util.Map;

import com.joey.springboot.model.Book;


public interface BookService {
	public List<Book> getAllBooks();
	public Map getBooksById(int id);
}
