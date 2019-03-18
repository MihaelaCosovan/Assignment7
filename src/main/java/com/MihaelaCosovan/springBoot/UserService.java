package com.MihaelaCosovan.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserServiceInterface {
	
	@Autowired
	private UserRepository UR;
	
	@Override
	public Iterable<User> findAllUsers(){
		return UR.findAll();
	}
	
	@Override
	public void addUser(User u){
		UR.save(u);
	}
	
	@Override
	public void deleteUser(long id) {
		UR.deleteById(id);
	}
	
	@Override
	public User getUser(long id) {
		User temp = null;
		try {
			temp = UR.findById(id).get();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return temp;
	}

}
