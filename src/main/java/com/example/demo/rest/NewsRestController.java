package com.example.demo.rest;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DaoFactory;
import com.example.demo.entity.News;

@RestController
public class NewsRestController {
	
	
	@RequestMapping("/getallnews")
	List<News> getAllNews(HttpServletRequest request,HttpServletResponse response){
		return DaoFactory.getNewsDao().getAllNews();
	}
	

}
