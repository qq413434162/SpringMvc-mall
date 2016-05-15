package com.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.dao.UserDao;

@Service
public class UserService {    
	@Autowired
	private UserDao userDao;
	
	public String getName(String name) {
		return userDao.getName(name);
	}
}
