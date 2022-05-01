package com.smg.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smg.data.entity.UserEntity;
import com.smg.data.repository.UsersRepository;

@Service
public class UserDataService implements UsersDataAccessInterface<UserEntity>, DataAccessInterface<UserEntity> {

	@Autowired
	UsersRepository usersRepository;

	@Override
	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserEntity findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(UserEntity user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(UserEntity user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(UserEntity user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserEntity findByUsername(String username) {
		// TODO Auto-generated method stub
		return usersRepository.findByUsername(username);
	}
	


	
}
