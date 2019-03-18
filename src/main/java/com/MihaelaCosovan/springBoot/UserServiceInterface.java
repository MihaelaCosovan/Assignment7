package com.MihaelaCosovan.springBoot;

public interface UserServiceInterface {
	
	public Iterable<User> findAllUsers();
	public void deleteUser(long id);
	public void addUser(User u);
	public User getUser(long id);
}
