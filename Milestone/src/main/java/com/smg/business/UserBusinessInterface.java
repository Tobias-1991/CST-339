package com.smg.business;

import java.util.List;

import com.smg.model.UserModel;

public interface UserBusinessInterface {
	public void test();
	
	public List<UserModel> getUsers();
	
	public void deleteUser();
	
	public void updateUser();

}
