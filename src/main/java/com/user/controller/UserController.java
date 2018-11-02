package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.dto.UserDTO;
import com.user.entity.User;
import com.user.service.UserRepository;
import com.user.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	UserRepository userRepository;	

	@Autowired
	UserService userService;

	@GetMapping("/add")
	public User addUser() {
		User user = new User();
		user.setNick("bkokos3");
		user.setEmail("kokos4@skokos.pl");
		user.setPassword("kokospass");
		return userRepository.save(user);
	}
	
	@GetMapping("/delete")
	public void deleteAll() {
		userRepository.deleteAll();
	}
	
	@GetMapping("/nick")
	public User findUserByNick(@RequestParam(value="nick") String nick) {
		return userService.findUserByNick(nick);
	}
	
	@PutMapping("/user")
	public User saveUser(@RequestBody UserDTO user) {
		User u = new User();
		u.setNick(user.getNick());
		u.setEmail(user.getEmail());
		u.setPassword(user.getPassword());
		return userRepository.save(u);
	}
	
}
