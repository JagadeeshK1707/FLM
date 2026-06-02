package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Users {
	@Value("${id}")
	private int userId;
	@Value("${name}")
	private String value;
	private List<String> skills;
	
	@Autowired
	private Adress adress;
	
	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public Users() {
		
	}
	
	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Users(int userId, String value, List<String> skills, Adress adress) {
		super();
		this.userId = userId;
		this.value = value;
		this.skills = skills;
		this.adress = adress;
	}

	public Users(int userId, String value) {
		super();
		this.userId = userId;
		this.value = value;
	}

	public Users(int userId, String value, List<String> skills) {
		super();
		this.userId = userId;
		this.value = value;
		this.skills = skills;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", value=" + value + ", skills=" + skills + ", adress=" + adress + "]";
	}
	
	
}
