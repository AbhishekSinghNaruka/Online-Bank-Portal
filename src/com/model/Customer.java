package com.model;

public class Customer {
	public AccountDetails acc;
	private String name;
	private String uname;
	private String loginPass;
	
	public Customer(){
		acc=new AccountDetails();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getLoginPass() {
		return loginPass;
	}
	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}
	public void chnagePass() {
		
	}
	public void withdrawl(float amount) {
		
	}
	public void deposit(float amount) {
		
	}
	
}
