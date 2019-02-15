package com.homebudget.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.homebudget.user.dto.UserDTO;
import com.homebudget.user.entity.User;
import com.homebudget.user.service.UserRepository;
import com.homebudget.user.service.UserService;

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
	public UserDTO findUserByNick(@RequestParam(value="nick") String nick) {
		User user = userService.findUserByNick(nick);
		UserDTO uDTO = new UserDTO(user);	
		return uDTO;
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
