package com.smg.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smg.data.entity.UserEntity;



public interface UsersRepository extends MongoRepository<UserEntity, String> {
	
	UserEntity findByUsername(String username);
	Boolean existsByUsername(String username);
}
