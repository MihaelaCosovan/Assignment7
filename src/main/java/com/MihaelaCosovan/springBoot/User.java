package com.MihaelaCosovan.springBoot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String pswd;

	public void setID(long id) { this.id = id; }
	public long getID() { return this.id; }
	
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public String getFirstName() { return firstName; }
	
	public void setLastName(String lastName) { this.lastName = lastName; }
	public String getLastName() { return lastName; }
	
	public void setEmail(String email) { this.email=email; }
	public String getEmail() { return this.email; }
	
	public void setPswd(String pswd) { this.pswd=pswd; }
	public String getPswd() { return this.pswd; }
	
}
