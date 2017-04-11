package com.nr.validate;

 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
 
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nr.enquiry.EnquiryForm;

public class EnquiryValidate implements Validator {

	
	
	@Override
	public void validate(Object obj, Errors er) {
		
		EnquiryForm ef=(EnquiryForm)obj;
		String s=ef.getName();
		String dob=ef.getDob();
		String mmbl=ef.getMblno();
		String em=ef.getEmail();
		String quali=ef.getQuali();
		 String sta=ef.getState();
		 String da=ef.getDate();
		if(s==null||s.length()==0){
			System.out.println("validate error in sname");
			er.rejectValue("name", "errors.name.required", new Object[]{},"name is required");
		}else if(s!=null){
			Pattern p=Pattern.compile("^[0-9]{4,16}");
			   Matcher m=p.matcher(s);
			   if((m.matches())){
				   System.out.println("validate error in sname pattern");
					 er.rejectValue("name", "errors.name.required", new Object[]{},"not in a pattern");
					}	
		}
		
		if(ef.getDob()==null||ef.getDob().length()==0){
			System.out.println("validate error in dob");
			er.rejectValue("dob", "errors.dob.required", new Object[]{}, "dob is required");
		}else if(dob!=null){
						
			try{
			 String date="^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
			 Pattern p=Pattern.compile(date);
			 Matcher m=p.matcher(dob);
			 if(!(m.matches())){
				 System.out.println("validate error in dob not in pattern");
				 er.rejectValue("dob", "errors.dob.required", new Object[]{}, "dob not in pattern");
			 }
			 			 
			 	}catch (Exception e) {
			 		e.printStackTrace();
				}
			
		}		
		if(mmbl.length()==0|mmbl==null){
			 System.out.println("validate error in Moblno is required");
						er.rejectValue("mblno", "errors.mblno.required",new Object[]{},"Moblno is required");
					}else  if(mmbl.length()>=11){
						System.out.println("validate error in enter only 10 digit no");
						er.rejectValue("mblno", "errors.mblno.required",new Object[]{},"enter only 10 digit no");
					}else if(mmbl!=null&&mmbl.length()==10){

						 try{
							 /*int phh=mmbl.indexOf(0);
							  Pattern pt=Pattern.compile(String.valueOf(phh));
							  String reg="^\\"
							  Matcher mm1=Pattern.compile(regex)
							 int  phh2=mmbl.indexOf(1, mmbl.length()-1);
							 String phh3=String.valueOf(phh+phh2);*/
						String phn="[7-9]?[0-9]{9}";
						Pattern p=Pattern.compile(phn);
						Matcher m=p.matcher(mmbl);
						if(!(m.matches())){
							System.out.println("validate error in mbl not in pattern ");
							er.rejectValue("mblno", "errors.mblno.required",new Object[]{},"not in pattern");
						} 
						 }catch (Exception e) {
							 e.printStackTrace();
						}
					}
		
		if(ef.getGender()==null||ef.getGender().length()==0){
			System.out.println("validate error in gender is required ");
			er.rejectValue("gender", "errors.gender.required",new Object[]{},"gender is required");
					}
		
		if(em==null||em.length()==0){
			System.out.println("validate error in email is required ");
			er.rejectValue("email", "errors.email.required",new Object[]{},"email is required");
		}else if(em!=null){
			  String exp="\\b[a-zA-Z0-9._%-]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}\\b";
			  Pattern p=Pattern.compile(exp);
			  Matcher m=p.matcher(em);
			  if(!(m.matches())){
				  System.out.println("validate error in email is not in a pattern  ");
			er.rejectValue("email", "errors.email.required",new Object[]{},"not in a pattern");
					}
		}
		
		
		if(quali==null||quali.length()==0){
			System.out.println("validate error in quali is required  ");
			er.rejectValue("quali", "errors.quali.required",new Object[]{},"quali is required");
					}else if(quali!=null&&quali.length()<=6){
						
						String exp="[a-zA-Z]+";
						Pattern p=Pattern.compile(exp);
						Matcher m=p.matcher(quali);
						if(!(m.matches())){
							System.out.println("validate error in  not quali in a paater or up to 6 char  ");
							er.rejectValue("quali", "errors.quali.required",new Object[]{},"not in a paater or up to 6 char");
						}
					}else if(quali.length()>=6){
						System.out.println("validate error in  not quali enter up to  or <=6 ");
						er.rejectValue("quali", "errors.quali.required",new Object[]{},"enter up to  or <=6");
					}
		
		
		
		if(sta==null||sta.length()==0||sta.equals("---select state---")){
			System.out.println("validate error in   state is required  ");
			er.rejectValue("state", "errors.state.required",new Object[]{},"state is required");
					}
		
		if(ef.getKnow()==null||ef.getKnow().length==0){
			System.out.println("validate error in   know is required ");
			er.rejectValue("know", "errors.know.required",new Object[]{},"know is required");
					}
		
		
		
		if(ef.getCourse()==null||ef.getCourse().length==0){
			System.out.println("validate error in   course is required ");
			er.rejectValue("course", "errors.course.required",new Object[]{},"course is required");
					}
		
		
		if(ef.getDate()==null){
			System.out.println("validate error in   date  ");
			er.rejectValue("date", "errors.course.required",new Object[]{},"date is required");
		}
		
	}
	
	@Override
	public boolean supports(Class<?> obj) {
	  		return  EnquiryForm.class.equals(obj);
	}
}
