package com.nr.admin;

public class Adminform {

	String admin;
	String pwd;
	
	public Adminform() {
	System.out.println("adminform->D.C");
	}
	
	public Adminform(String admin, String pwd) {
		super();
		this.admin = admin;
		this.pwd = pwd;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}
