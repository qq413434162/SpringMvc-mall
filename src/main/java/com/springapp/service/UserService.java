package com.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapp.command.UserCommand;
import com.springapp.dao.UserDao;
import com.springapp.domain.User;

@Service
public class UserService {    
	@Autowired
	private UserDao userDao;
	
	public User getUserInfo(UserCommand userCommand) {
		if (userCommand.getUserId() > 0) {
			return getUserInfoByUserId(userCommand.getUserId());
		} else if (userCommand.getUserName().length() > 0) {
			return getUserInfoByUserName(userCommand.getUserName());
		}
		
		return new User();
	}
	
	public User getUserInfoByUserName(String userName) {
		return userDao.getUserInfoByUserName(userName);
	}
	
	public User getUserInfoByUserId(Integer userId) {
		return userDao.getUserInfoByUserId(userId);
	}
}
