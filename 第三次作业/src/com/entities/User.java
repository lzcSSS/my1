package com.entities;

public class User {
	private Integer uid;
	public User() {
		super();
	}
	private String userName;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + "]";
	}
	public User(String userName) {
		super();
		this.userName = userName;
	}
	
	
}
