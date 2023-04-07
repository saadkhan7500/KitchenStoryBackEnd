package com.kitchenStoryBackEnd.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User 
{
	@Id
	private String email;
	private String name;
	private String dob;
	private String gender;
	private String pno;
	private String password;
	
	private User() {
		super();
		// TODO Auto-generated constructor stub
	}

	private User(String email, String name, String dob, String gender, String pno, String password) {
		super();
		this.email = email;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.pno = pno;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", pno=" + pno
				+ ", password=" + password + "]";
	}
	
	
	
	
	
	

}
