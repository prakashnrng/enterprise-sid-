package com.nr.user.dao;

import com.nr.user.User;
import com.nr.user.UserTO;


public interface UserDAO {
	
	public UserTO verifyUser(String un, String pwd,String role);

	public boolean addUser(UserTO to);
	
	public User verifyName(String un);
	
public UserTO verifyUsername(UserTO uto);
	
	public UserTO verifyemail(UserTO uto);
	
	public UserTO forgpwd(UserTO uto);
	
//	public int verifyUName(String un);

}
