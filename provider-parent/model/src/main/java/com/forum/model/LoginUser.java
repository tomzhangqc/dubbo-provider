package com.forum.model;

public class LoginUser {
	String userName;
	String loginTime;
	Integer logNum;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public Integer getLogNum() {
		return logNum;
	}
	public void setLogNum(Integer logNum) {
		this.logNum = logNum;
	}
}
