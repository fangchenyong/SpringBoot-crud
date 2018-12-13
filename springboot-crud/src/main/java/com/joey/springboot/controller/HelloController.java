package com.joey.springboot.controller;

import java.util.List;
import java.util.Map;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.joey.springboot.mapper.UserMapper;
import com.joey.springboot.model.Config;
import org.apache.ibatis.javassist.ClassPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.joey.springboot.model.Book;
import com.joey.springboot.service.BookService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
//读取外部配置文件,配置多个文件 忽略没有找到的配置文件
@PropertySource(value={"jdbc.proprites","1","1"},ignoreResourceNotFound = true)


public class HelloController {

	@Autowired
	private BookService bookService;

	@Autowired
	private Config config;

	//@Value("${sql.select}")
	//private  String str;

	@Value("${spring.mvc.view.prefix}")
	private String port;

	@RequestMapping("/index")
	public String index(){
		//System.out.println(str);
		return "js/index1";

	}

	@RequestMapping("/login")
	@ResponseBody
	public String login(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("UserName:"+username);
		System.out.println("PassWord:"+password);


		return "UserName:"+username +"PassWord:"+password;

	}



	@RequestMapping("/say")
	@ResponseBody
	public List<Book> hello() {
		List<Book> books = bookService.getAllBooks();
		return books;
	}

	@RequestMapping("/get")
	@ResponseBody
	public String get(@RequestParam("id") int id) {
		Map book = bookService.getBooksById(id);
		book.get("id");
		book.get("price");
		String title = (String)book.get("title");
		return title;
	}

	//获取配置文件参数
	@ResponseBody
	@RequestMapping("/weixin")
	public String weixin(){
		System.out.print(config.getPort());
		return port;
	}
}

