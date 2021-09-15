package com.brs.service;

import java.util.List;

import com.brs.entity.User;

public interface IUserService {
	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(int userid);
	public User viewUser(int userid);
	public List<User> viewAllUser();

}
