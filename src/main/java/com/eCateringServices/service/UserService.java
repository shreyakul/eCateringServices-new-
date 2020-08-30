package com.eCateringServices.service;

import java.util.List;

import com.eCateringServices.dto.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);
	UserDto getUser(String email);
	UserDto getUserByUserId(String userId);
	UserDto updateUser(String userId, UserDto user);
	void deleteUser(String userId);
	List<UserDto> getUsers();
}
