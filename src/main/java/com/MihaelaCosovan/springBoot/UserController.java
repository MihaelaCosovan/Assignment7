package com.MihaelaCosovan.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService US;
	
	@RequestMapping("/")
	@ResponseBody
	public Iterable<User> getAll(){
		System.out.println("UserController.getAll()");
		return US.findAllUsers();
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email, @RequestParam String pswd) {
		User u = new User();
		u.setFirstName(firstName);
		u.setLastName(lastName);
		u.setEmail(email);
		u.setPswd(pswd);
		US.addUser(u);
		return "added";
	}
	
	@RequestMapping("/read")
	@ResponseBody
	public String read(@RequestParam long id) {
		US.getUser(id);
		return "read";
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String updateEmail(@RequestParam long id, @RequestParam String email) {
		User u =US.getUser(id);
		u.setEmail(email);
		US.addUser(u);
		return "updated";
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(@RequestParam long id) {
		US.deleteUser(id);
		return "deleted";
	}
	
	
	
}
