package com.example.demo.dao;

public class DaoFactory {
	
	public static NewsDaoImp getNewsDao() {
		return new NewsDaoImp();
	}

}
