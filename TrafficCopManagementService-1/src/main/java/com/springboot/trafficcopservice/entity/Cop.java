package com.springboot.trafficcopservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "cop_credentials")
public class Cop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int copId;
	
	private String name;
	
	private String username;
	
	private String password;
	
	private String role;
	
	public Cop() {
		// TODO Auto-generated constructor stub
	}

	public Cop(String name, String username, String password, String role) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public int getCopId() {
		return copId;
	}

	public void setCopId(int copId) {
		this.copId = copId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Cop [copId=" + copId + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", role=" + role + "]";
	}
	

}
