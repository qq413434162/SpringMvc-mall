package com.springapp.mapper;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GetSqlSessionFactory {
	private static SqlSessionFactory sessionFactory = null;
	public SqlSessionFactory getSession() {
		
		if (sessionFactory == null) {
			String resource = "configuration.xml";
			try {
				sessionFactory = new SqlSessionFactoryBuilder()
						.build(Resources
								.getResourceAsReader(resource));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
