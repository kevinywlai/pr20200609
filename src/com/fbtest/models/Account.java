package com.fbtest.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fbtest.validators.UserEmail;

@UserEmail(message="Same email")
public class Account {
	@NotEmpty(message="uid is required")
	private String uid;
	private String pwd;
	@NotNull
	private String username;
	
	@NotEmpty(message="email is required")
	private String email;
	private String manager;
	private String deportment;
	
	private String title;
	private String extno;
	private String logintime;
	private String logouttime;
	
	public String getUid() {
		return uid;
	}
	public String getPwd() {
		return pwd;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getManager() {
		return manager;
	}
	public String getDeportment() {
		return deportment;
	}
	public String getTitle() {
		return title;
	}
	public String getExtno() {
		return extno;
	}
	public String getLogintime() {
		return logintime;
	}
	public String getLogouttime() {
		return logouttime;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public void setDeportment(String deportment) {
		this.deportment = deportment;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setExtno(String extno) {
		this.extno = extno;
	}
	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}
	public void setLogouttime(String logouttime) {
		this.logouttime = logouttime;
	}
	@Override
	public String toString() {
		return "Account [uid=" + uid + ", pwd=" + pwd + ", username=" + username + ", email=" + email + ", manager="
				+ manager + ", deportment=" + deportment + ", title=" + title + ", extno=" + extno + ", logintime="
				+ logintime + ", logouttime=" + logouttime + "]";
	}
	
}
