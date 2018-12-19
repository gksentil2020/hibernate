
	package com.niit.dao;

	import java.util.List;

	import com.niit.model.User;

	public interface UserDao 
	{
	public void addUser(User user);
	public List<User> getUser();
	public List<User> findAllUser();
	public User findUserById(int UserId);
	public User findUserByName(String name);
	public boolean updateUser(User user);
	public boolean deleteUser(int Uid);
	

	}
