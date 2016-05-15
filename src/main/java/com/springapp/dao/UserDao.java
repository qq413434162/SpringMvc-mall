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
		
/*
		User user1 = new User();
		user1.setName("xl");
		user1.setAge(22);
		userMapper.insertUser(user1);
		sqlSession.commit();
		*/
		return user
				.getName();
	}

}
