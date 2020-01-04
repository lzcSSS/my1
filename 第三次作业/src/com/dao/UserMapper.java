package com.dao;

import java.util.List;

import com.entities.User;

public interface UserMapper {
	List<User> getUsers(User user);
	User getUserById(Integer uid);
	int deleteUser(Integer uid);
	int updateUser(User user);
	int addUser(User user);
}
