package com.brs.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.brs.entity.User;
import com.brs.exceptions.UserNotFoundException;
import com.brs.service.IUserService;


@RestController
public class UserController {
	@Autowired
	private IUserService userservice;
	@PostMapping("addUser")
	public ResponseEntity<User> addUser(@RequestBody User user){
		User addeduser=userservice.addUser(user);
	     return new ResponseEntity<User>(userservice.addUser(user),HttpStatus.OK);
	}	
	
	@PutMapping("updatebus")
	public ResponseEntity<User> updateuser(@RequestBody User user) throws UserNotFoundException {
		return new ResponseEntity<User>(userservice.updateUser(user), HttpStatus.OK);
	}
	
	@DeleteMapping("deletebus/{busid}")
	public ResponseEntity<User> deleteUser(@PathVariable long userId) throws UserNotFoundException{
		return new ResponseEntity<User>(userservice.deleteUser(userId),HttpStatus.OK);
		
	}
	
	@GetMapping("view/{busid}")
	public ResponseEntity<User> getUserById(@PathVariable("id") long userId) throws UserNotFoundException{
		return new ResponseEntity<User>(userservice.viewUser(userId) , HttpStatus.OK);
	}
	
	@GetMapping("alluser")
	public ResponseEntity <List<User>>getAllUser(){
		return new ResponseEntity<List<User>>(userservice.viewAllUser(), HttpStatus.OK);
	}
}
