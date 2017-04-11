package com.nr.user.roles;

import java.util.Set;

import com.nr.user.User;

public class Role {

	private int id;
	private String uname;
 
	private Set<User> users;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	 
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	
	/*public Role(int id, String uname, String pwd) {
		super();
		this.id = id;
		this.uname = uname;
		this.pwd = pwd;
	}



	public Role(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
*/	
	

	
	
	
}
