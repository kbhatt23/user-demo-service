package com.learning.userdemoservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.userdemoservice.bean.User;
import com.learning.userdemoservice.service.UserDaoService;

@RestController
public class UserController {
	
	@Autowired
	private UserDaoService userDaoService;
	
	@GetMapping("/users")
	public List<User> fetchAllUsers(){
		return userDaoService.fetAllUsers();
	}
	
	@GetMapping("/users/{name}")
	public User fetchUser(@PathVariable("name") String userName){
		return userDaoService.fetchUser(userName);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User userCreated = userDaoService.save(user);
		return new ResponseEntity<User>(userCreated, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/users")
	public  ResponseEntity<User> updateUSer(@RequestBody User user){
		User userUpdated = userDaoService.save(user);
		return new ResponseEntity<User>(userUpdated, HttpStatus.OK);
	}
	
}
