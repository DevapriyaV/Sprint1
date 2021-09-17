package com.brs.service;

import java.util.List;

import com.brs.entity.User;
import com.brs.exceptions.UserNotFoundException;

public interface IUserService {
	public User addUser(User user);
	public User updateUser(User user);
	public List<User> viewAllUser();
	User viewUser(Long userId) throws UserNotFoundException;
	User deleteUser(long userId);

}
