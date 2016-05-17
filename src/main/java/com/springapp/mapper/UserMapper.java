package com.springapp.mapper;
import  com.springapp.domain.User;
public interface UserMapper {  
    public User findByName(String name);  
    public void insertUser(User user);
	public User findById(Integer userId);  
}  