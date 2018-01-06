package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.example.demo.entity.News;

public class NewsDaoImp implements NewsDao {

	@Override
	public News getNews(int id) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("demo-1");
		EntityManager em=factory.createEntityManager();
		return em.find(News.class, id);
	}

	@Override
	public List<News> getAllNews() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("demo-1");
		EntityManager em=factory.createEntityManager();
		Query query=em.createNamedQuery("News.findAll");
		return query.getResultList();
	}
}
