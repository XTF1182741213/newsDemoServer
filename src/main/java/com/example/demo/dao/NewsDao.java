package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.News;

public interface NewsDao {
	News getNews(int id);
	List<News> getAllNews();

}
