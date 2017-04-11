package com.nr.user.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nr.user.User;
import com.nr.user.UserTO;
import com.nr.user.dao.UserDAO;

public class UserServiceForm implements UserService{
	
	@Autowired
	UserDAO udao;
	@Override
	public UserTO verifyUser(String un, String pwd,String role) {
	
		return udao.verifyUser(un, pwd,role);
	}

	
	@Override
	public boolean addUser(UserTO uto) {
	 
		  return udao.addUser(uto);
	}
	
	
	 @Override
	public User verifyName(String un) {
	 
		return udao.verifyName(un);
	}
	 
	 @Override
	public UserTO verifyemail(UserTO uto) {
		// TODO Auto-generated method stub
		return udao.verifyemail(uto);
	}
	 
	 @Override
	public UserTO verifyUsername(UserTO uto) {
	 
		return udao. verifyUsername(uto);
	}
	 
	 
	 public UserTO forgpwd(UserTO uto){
		 return udao.forgpwd(uto);
	 }
	 
	/* @Override
	public int verifyUName(String un) {
	 
		return udao.verifyUName(un);
	}*/
	 
}
