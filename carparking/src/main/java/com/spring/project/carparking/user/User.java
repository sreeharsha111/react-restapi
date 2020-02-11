package com.spring.project.carparking.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class User {

	@Id
	

	private String username;
	private String emailid;
	private String password;
	private long id;
	
	public User() {
		super();
	}

	public User(long id,String username,String emailid,String password) {
		super();

		this.username=username;
		this.emailid=emailid;
		this.password=password;
		this.id=id;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
