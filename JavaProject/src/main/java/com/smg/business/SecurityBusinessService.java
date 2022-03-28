package com.smg.business;

import org.springframework.stereotype.Service;

@Service
public class SecurityBusinessService {

	public boolean authenticateUser(String username, String password) {
		System.out.println("This is a test message from the authenticateUser method");
		return true;
	}
	public boolean authenticateAdminUser(String username, String password) {
		System.out.println("This is a test message from the authenticateAdminUser method");
		return true;
	}
}
