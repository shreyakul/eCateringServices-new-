package com.eCateringServices.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eCateringServices.entities.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long>{
	
	UserEntity findByUserId(String userId);
	
	UserEntity findByEmail(String email);

}
