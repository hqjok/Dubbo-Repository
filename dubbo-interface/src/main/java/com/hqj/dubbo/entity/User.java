package com.hqj.dubbo.entity;

import java.io.Serializable;

/**
 * User实体类
 * @author hqj
 *
 */
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public int id;
	public String name;
	public String sex;
	public String email;

	public User(int id, String name, String sex, String email) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
