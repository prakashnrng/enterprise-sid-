package com.nr.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nr.user.service.UserService;

public class UserValidate implements Validator{
	
	@Autowired
	UserService usr;
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return clazz.equals(User.class);
	}
	
	
	   
	@Override
	public void validate(Object obj, Errors errors) {
		
		User u=(User)obj;
		
		String un=u.getUname();
		String pw=u.getPwd();
		String cpw=u.getRpwd();
		String ro=u.getRole();
		String em=u.getUemail();
		String mbl=u.getUmbl();
		
		
		
		
		if(un==null||un.length()==0){
			System.out.println("un empty");
			errors.rejectValue("uname", "errors.uname.required", new Object[]{}, "uname is required");
			
		} else if(un!=null){		
			 
			 Pattern p=Pattern.compile("[a-zA-Z]*");
			Matcher m=p.matcher(un);
			if(!m.matches()){
				System.out.println("un not equal");
				errors.rejectValue("uname","errors.uname.required", new Object[]{}, "enter only char");
			} 
		}
		
		if(pw==null||pw.length()==0){
			System.out.println("pw empty");
			errors.rejectValue("pwd", "errors.pwd.required", new Object[]{}, "enter pwd");
		}else if(pw.length()>16){
			System.out.println("pw legth greater than 8");
			errors.rejectValue("pwd", "errors.pwd.required", new Object[]{}, "password length should be 8");
		}else if(pw!=null){
			//((?=.*/d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})
			//String exp="^([a-zA-Z+]+[0-9+]+[&@!#+]+)$";
			System.out.println("pw must be mixed with special casechar and digit and alphabet");
			Pattern p=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
			Matcher m=p.matcher(pw);
			if(!m.matches()){
				errors.rejectValue("pwd","errors.pwd.required",new Object[]{},"enter digit and small and upper case and @#$%");
			}
		}
			
		
		if(cpw==null||cpw.length()==0){
			System.out.println("confrim pw empty");
			errors.rejectValue("rpwd", "errors.pwd.required", new Object[]{}, "enter pwd");
		}else if(cpw.length()>16){
			System.out.println(" confirm pw legth greater than 8");
			errors.rejectValue("rpwd", "errors.pwd.required", new Object[]{}, "password length should be 8");
		}else if(cpw!=null){
			
			System.out.println("confirm pw must be mixed with special casechar and digit and alphabet");
			
			Pattern p=Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
			Matcher m=p.matcher(pw);
			if(!m.matches()){
				errors.rejectValue("rpwd","errors.pwd.required",new Object[]{},"enter digit and small and upper case and @#$%");
			} 
			}
			
		   
		 
		
		
		if(ro==null||ro.length()==0){
			System.out.println("confrim pw empty");
			errors.rejectValue("role", "errors.role.required", new Object[]{}, "select the role");
		}
		
		if(em==null||em.length()==0){
			System.out.println("enter email");
			errors.rejectValue("uemail", "errors.email.required", new Object[]{}, "enter the email");
		}else if(em!=null){
			System.out.println("email should be in a pttern");
			if(em!=null){
				  String exp="\\b[a-zA-Z0-9._%-]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}\\b";
				  Pattern p=Pattern.compile(exp);
				  Matcher m=p.matcher(em);
				  if(!(m.matches())){
					  System.out.println("validate error in email is not in a pattern  ");
				errors.rejectValue("email", "errors.email.required",new Object[]{},"not in a pattern");
						}
			}
			
		}
		
		if(mbl.length()<10||mbl==null){
			System.out.println("mbl is required");
			errors.rejectValue("umbl", "errors.required", new Object[]{"smbl"}, "enter mbl");
		}else if(mbl!=null && mbl.length()>10){
			 
			System.out.println("smbl should containt only 10 digit");
			errors.rejectValue("umbl", "errors.required", new Object[]{"smbl"}, "> than 10 digit");
			}
		 	else if(mbl!=null && mbl.length()==10){
					 
		  Pattern p=Pattern.compile("[7-9]?[0-9]{9}");
		  Matcher m=p.matcher(mbl);
				
				
		 if(!(m.matches())){
			 errors.rejectValue("umbl", "errors.required", new Object[]{"smbl"}, "starting no should be 7|8|9"); 
		 }
		 
		}/*else if((mbl!=null) && (mbl.length()==10)){
			System.out.println("start of smbl contians only digi");
			Pattern p=Pattern.compile("[7-9]?[0-9]{9}");
			Matcher m=p.matcher(mbl);
			if(!(m.matches())){
				errors.rejectValue("umbl", "errors.required", new Object[]{"smbl"}, "1st digit should [7|8|9]");
		} }
		*/
		
		
		
		
		
		/* else if(un!=null && pw!=null){
			
			UserTO uto=usr.verifyUser(un, pw, "manager");
			if(!((uto.getUname().equals(un))&&(uto.getPwd().equals(pw)))){
				errors.rejectValue("uname", "errors.uname.required", new Object[]{}, "not a valid user");
				errors.rejectValue("pw", "errors.pwd.required", new Object[]{}, "not a valid pwd");
			}
			System.out.println("un ");
			
		}*/
			
		}
		
		
	}
 
		

	 
	
	

