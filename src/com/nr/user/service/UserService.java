package com.nr.user.service;

import com.nr.user.User;
import com.nr.user.UserTO;

public interface UserService {
	
	public UserTO verifyUser(String un,String pwd,String role);

	public boolean addUser(UserTO uto);
	
	public User verifyName(String un);
	
	public UserTO verifyUsername(UserTO uto);
	
	public UserTO verifyemail(UserTO uto); 
	
	public UserTO forgpwd(UserTO uto);
	
	//public int verifyUName(String un);
}
