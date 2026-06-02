package com;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id;
	private String dept;
	private String email;
	private String name;
	private int percentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
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
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public Student(int id, String dept, String email, String name, int percentage) {
		super();
		this.id = id;
		this.dept = dept;
		this.email = email;
		this.name = name;
		this.percentage = percentage;
	}
	public Student() {
		
	}
	@Override
	public String toString() {
		return "Stident [id=" + id + ", dept=" + dept + ", email=" + email + ", name=" + name + ", percentage="
				+ percentage + "]";
	}
	
	
	
}
