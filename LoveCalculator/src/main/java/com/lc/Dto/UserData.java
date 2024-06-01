package com.lc.Dto;

import com.lc.CustomValidation.Age;
import com.lc.CustomValidation.Name;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserData {

	@Name
	private String userName;
	@Name
	private String crushName;
	@NotBlank
	@Email
	private String emailAddress;

	@Age
	private Integer userAge;



	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		
		
		
		this.userName = userName;
	}

	public String getCrushName() {
		
		return crushName;
	}

	public void setCrushName(String crushName) {
		
		
		this.crushName = crushName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	



}
