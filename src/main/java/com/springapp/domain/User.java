package com.springapp.domain;

import java.io.Serializable;

/**
 * �û���
 * 
 * @author db2admin
 * 
 */
public class User implements Serializable{
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public User() {
	}
}