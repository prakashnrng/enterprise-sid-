package com.nr.user.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.nr.user.User;
import com.nr.user.UserTO;
import com.nr.user.util.UserUtil;

public class UserHibernateDAO implements UserDAO {
	@Autowired
	 HibernateTemplate htemp;
	
	@Override
	public UserTO verifyUser(String un, String pwd,String role) {
	 System.out.println("UserHibernateDAO->verifyUser");
	 System.out.println("user informatin"+un+"\t"+pwd+"\t"+role);
	  String query="from User u where u.uname=? and u.pwd=? and u.role=?";
	  UserTO u=null;
	 List<User> l=htemp.find(query,un,pwd,role);
		if(l!=null){
			for(User uu:l){
			  
				  u=new UserTO(uu.getUid(),uu.getUname(),uu.getPwd(),uu.getRole());
					return u;
			}
		}
			//return UserUtil.getUserToFrom(l.get(0));
		
		 
		
		return null;
	}
@Override
public User verifyName(String un) {
 System.out.println("UserHibernateDAO->verifyName");
 System.out.println("UserHibernateDAO->verifyName(un)"+un);
 String query="from User u where u.uname=?";
 
	List<User> li=htemp.find(query,un);
	User uu=null;
	for(User u:li){
		  uu=new User(u.getUid(),u.getUname(),u.getRole());
		/*uu.setUid(u.getUid());
		uu.setUname(u.getUname());
		uu.setRole(u.getRole());*/
	 
	}
	System.out.println(uu);
	return uu;
	
}
	
	@Override
	public boolean addUser(UserTO uto) {
	 System.out.println("UserHibernateDAO->addUser");
	// User u=new User(uto.getUname(),uto.getPwd(),uto.getRole());
	 User u=new User(uto.getUname(),uto.getPwd(),uto.getRpwd(),uto.getUemail(),uto.getUmbl(),uto.getRole());
	 
	/* String query="from User u where u.uname=? and u.uemail=?";
	// String query1="from User u where u.pwd=? and u.rpwd=?";
	 String un=u.getUname();
	 String em=u.getUemail();
	 String pw=u.getPwd();
	 String pwd=u.getRpwd();
	 System.out.println("pw and pwd"+pw+"\t"+pwd);
	 if(!pw.equals(pwd)){
	    	
			return false; 	 
			 } 
	 
	 System.out.println(em);
	  UserTO uto1=null;
	  UserTO uto2=null;
	 List<User> li=htemp.find(query,un,em);
	// List<User> li1=htemp.find(query1,pw,pwd);
	 for(User uu:li1){
		 uto2=new UserTO(uu.getUid(),uu.getUname(),uu.getPwd(),uu.getRpwd(),uu.getUemail(),uu.getUmbl(),uu.getRole());
	 }
	 for(User uu:li){
		 uto1=new UserTO(uu.getUid(),uu.getUname(),uu.getPwd(),uu.getRpwd(),uu.getUemail(),uu.getUmbl(),uu.getRole());
	 }
	 System.out.println(uto1.getUname()+"/t"+un);
    if(!un.equals(uto1.getUname())&&!em.equals(uto1.getUemail())){*/
		 htemp.save(u);
		 System.out.println("successfully->saved");
		 return true;
	 
	}
	
	public UserTO verifyUsername(UserTO uto) {
		System.out.println("user hibernate dao=>verifyUser");
		
		// User u=new User(uto.getUname(),uto.getPwd(),uto.getRole());
		 User u=new User(uto.getUname(),uto.getPwd(),uto.getRpwd(),uto.getUemail(),uto.getUmbl(),uto.getRole());
		 
		 String query="from User u where u.uname=?";
		// String query1="from User u where u.pwd=? and u.rpwd=?";
		 String un=u.getUname();
		 String em=u.getUemail();
		 System.out.println(un+"\t"+em);
		 List<User> li=htemp.find(query,un);
		 for(User uu:li){
			  UserTO uto1=new UserTO(uu.getUid(),uu.getUname(),uu.getPwd(),uu.getRpwd(),uu.getUemail(),uu.getUmbl(),uu.getRole());
			  return uto1;
		 }
		 return null;
		 
		 /* if(li!=null){
			  for(User uu:li){
				  UserTO uto1=new UserTO(uu.getUid(),uu.getUname(),uu.getPwd(),uu.getRpwd(),uu.getUemail(),uu.getUmbl(),uu.getRole());
				  String nm=uto1.getUname();
				  System.out.println("UserhibernateDAO->verifyUsernaem"+nm);
				  if(!un.equals(nm)){
					  System.out.println("true");
					  return true;				  
				  }else{
					  System.out.println("false");
					  return false;
				  }
			  }
		  }else{
			  return          false;
		  }
		 return false;*/
		  
		 
		  
		 /*UserTO uto1=null;
		 if(li!=null){
		 for(User uu:li){
			 uto1=new UserTO(uu.getUid(),uu.getUname(),uu.getPwd(),uu.getRpwd(),uu.getUemail(),uu.getUmbl(),uu.getRole());
			 System.out.println("===========================");
			 System.out.println(uto1);
			 System.out.println("===========================");
		 }
		 System.out.println(uto1);
		 if(!un.equals(uto1.getUname())){
			 htemp.save(u);
			 System.out.println("successfully->saved");
			 return false;
		 }else{
			 return true;
		 }
		 
		 } 
		 return false;*/
	}
	
	
	public UserTO verifyemail(UserTO uto) {
		System.out.println("user hibernate dao=>verifyemail");
		
		// User u=new User(uto.getUname(),uto.getPwd(),uto.getRole());
		 User u=new User(uto.getUname(),uto.getPwd(),uto.getRpwd(),uto.getUemail(),uto.getUmbl(),uto.getRole());
		 
		 String query="from User u where u.uemail=?";
		// String query1="from User u where u.pwd=? and u.rpwd=?";
		 
		 String em=u.getUemail();
		 System.out.println(em);
		 List<User> li=htemp.find(query,em);
		 
		 UserTO uto1=null;
		 if(li!=null){
		 for(User uu:li){
			 uto1=new UserTO(uu.getUid(),uu.getUname(),uu.getPwd(),uu.getRpwd(),uu.getUemail(),uu.getUmbl(),uu.getRole());
			 System.out.println("===========================");
			 System.out.println(uto1);
			 System.out.println("===========================");
			 return uto1;
		 }
		 /*System.out.println(uto1);
		 if(!em.equals(uto1.getUemail())){
			 htemp.save(u);
			 System.out.println("successfully->saved");
			 return false;
		 }else{
			 return true;
		 }
		 }
	*/	
		
	}else{
		return null;
	}
	 return null;
	}
	

	
public UserTO forgpwd(UserTO uto){
	System.out.println("UserHibernateDAO->forgorPwd");
	String query="from User u where u.uemail=? and u.umbl=?";
	String email=uto.getUemail();
	String mbl=uto.getUmbl();
	List<User>li=htemp.find(query,email,mbl);
	
	UserTO ut=null;
	if(li!=null){
	for(User u:li){
		 ut=new UserTO(u.getUid(), u.getUname(),u.getPwd(),u.getRpwd() ,u.getUemail(),u.getUmbl(),u.getRole());
		 	}
	
	return ut;
	}
		
	return null;
	
}

}

	/*public boolean verifypassword(UserTO uto) {
		System.out.println("user hibernate dao=>verifyUser");
		
		// User u=new User(uto.getUname(),uto.getPwd(),uto.getRole());
		 User u=new User(uto.getUname(),uto.getPwd(),uto.getRpwd(),uto.getUemail(),uto.getUmbl(),uto.getRole());
		 
		 String query="from User u where u.uname=? and u.uemail=?";
		// String query1="from User u where u.pwd=? and u.rpwd=?";
		 String un=u.getUname();
		 String em=u.getUemail();
		 List<User> li=htemp.find(query,un,em);
		 
		 UserTO uto1=null;
		 
		 for(User uu:li){
			 uto1=new UserTO(uu.getUid(),uu.getUname(),uu.getPwd(),uu.getRpwd(),uu.getUemail(),uu.getUmbl(),uu.getRole());
		 }
		 
		 if(!un.equals(uto1.getUname())&&!em.equals(uto1.getUemail())){
			 htemp.save(u);
			 System.out.println("successfully->saved");
			 return true;
		 }	    
		
		return false;
	}
	*/
	
	
	
	
	/*@Override
	public int verifyUName(String un) {
	 System.out.println("userHibernateDAO=>verifyUname");
	 String qury="form User u where u.uname=?";
	 int i=htemp.find(qury);
		return 0;
	}*/
	
 
