package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.controller.UserRegistrationDto;
import com.example.demo.entity.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
