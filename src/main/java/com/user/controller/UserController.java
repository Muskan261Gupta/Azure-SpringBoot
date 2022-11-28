package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.UserEntity;
import com.user.repo.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/")
	public UserEntity addUser(@RequestBody UserEntity user) {
		return userRepository.save(user);
	}
	
	@GetMapping("/all")
	public List<UserEntity> getallUsers(){
		return userRepository.findAll();
	}
	
	
	
	
	
}
