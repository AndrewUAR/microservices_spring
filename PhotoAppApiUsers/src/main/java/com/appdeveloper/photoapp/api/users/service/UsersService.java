package com.appdeveloper.photoapp.api.users.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appdeveloper.photoapp.api.users.shared.UserDto;

public interface UsersService extends UserDetailsService {
	UserDto create(UserDto userDetails);
	UserDto getUserDetailsByEmail(String email);
}
