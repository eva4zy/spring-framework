package com.ye.demo.domain;

public class User {
	private int age;
	private String fullname;
	private boolean employed;
	private String gender;
	
	public User() {
		
	}
	
	public User(int age, String fullname, boolean employed, String gender) {
		super();
		this.age = age;
		this.fullname = fullname;
		this.employed = employed;
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public boolean isEmployed() {
		return employed;
	}
	public void setEmployed(boolean employed) {
		this.employed = employed;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
