package com.springapp.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springapp.domain.User;
import com.springapp.mapper.GetSqlSessionFactory;
import com.springapp.mapper.UserMapper;

@Repository
public class UserDao extends GetSqlSessionFactory{
	
	public String getName(String name) {
		SqlSession sqlSession = getSession().openSession();
		UserMapper userMapper = sqlSession
				.getMapper(UserMapper.class);

		// test select
		User user = userMapper
				.findByName(name);
		return user
				.getName();
	}
	
	public User getUserInfoByUserName(String userName) {
		SqlSession sqlSession = getSession().openSession();
		UserMapper userMapper = sqlSession
				.getMapper(UserMapper.class);
System.out.println(userName);
		// test select
		User user = userMapper
				.findByName(userName);
		return user;
	}
	
	public User getUserInfoByUserId(Integer userId) {
		SqlSession sqlSession = getSession().openSession();
		UserMapper userMapper = sqlSession
				.getMapper(UserMapper.class);
System.out.println(userId);
		// test select
		User user = userMapper
				.findById(userId);
		return user;
	}

}
