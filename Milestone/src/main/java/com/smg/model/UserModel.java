package com.smg.model;

public class UserModel {
	
	private long id;
	private String username;
	private String password;
	private String passwordVerify;
	
	
	
	
	public UserModel(long id, String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	public UserModel(long id, String username) {
		super();
		this.id = id;
		this.username = username;
	}
	public UserModel() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordVerify() {
		return passwordVerify;
	}
	public void setPasswordVerify(String passwordVerify) {
		this.passwordVerify = passwordVerify;
	}
	
}
