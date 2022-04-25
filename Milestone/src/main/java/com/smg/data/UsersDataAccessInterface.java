package com.smg.data;

public interface UsersDataAccessInterface<T> {
	
	public T findByUsername(String username);

}
