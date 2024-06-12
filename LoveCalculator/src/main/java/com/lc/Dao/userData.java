package com.lc.Dao;

import org.springframework.stereotype.Component;

@Component
public class userData {

	int     USER_ID;
	String 	USER_NAME;
	String  USER_CRUSH;
	int     USER_AGE;
	String  USER_EMAIL;
	String  USER_RESULT;
	
	
	
	public int getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getUSER_CRUSH() {
		return USER_CRUSH;
	}
	public void setUSER_CRUSH(String uSER_CRUSH) {
		USER_CRUSH = uSER_CRUSH;
	}
	public int getUSER_AGE() {
		return USER_AGE;
	}
	public void setUSER_AGE(int uSER_AGE) {
		USER_AGE = uSER_AGE;
	}
	public String getUSER_EMAIL() {
		return USER_EMAIL;
	}
	public void setUSER_EMAIL(String uSER_EMAIL) {
		USER_EMAIL = uSER_EMAIL;
	}
	public String getUSER_RESULT() {
		return USER_RESULT;
	}
	public void setUSER_RESULT(String uSER_RESULT) {
		USER_RESULT = uSER_RESULT;
	}
	@Override
	public String toString() {
		return "userData [USER_ID=" + USER_ID + ", USER_NAME=" + USER_NAME + ", USER_CRUSH=" + USER_CRUSH
				+ ", USER_AGE=" + USER_AGE + ", USER_EMAIL=" + USER_EMAIL + ", USER_RESULT=" + USER_RESULT + "]";
	}
	
	
}
