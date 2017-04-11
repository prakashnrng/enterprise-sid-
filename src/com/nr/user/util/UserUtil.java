package com.nr.user.util;

import com.nr.user.User;
import com.nr.user.UserTO;

public class UserUtil {

	public static UserTO getUserToFrom(User u){
		UserTO to=new UserTO();
		to.setUname(u.getUname());
		to.setPwd(u.getPwd());
		return to;
	}
	
}
