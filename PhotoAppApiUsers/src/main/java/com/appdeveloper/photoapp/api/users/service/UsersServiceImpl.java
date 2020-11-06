package com.appdeveloper.photoapp.api.users.service;

import java.util.UUID;

import com.appdeveloper.photoapp.api.users.shared.UserDto;

public class UsersServiceImpl implements UsersService {

	@Override
	public UserDto create(UserDto userDetails) {
		userDetails.setUserId(UUID.randomUUID().toString());
		return null;
	}
	
}
