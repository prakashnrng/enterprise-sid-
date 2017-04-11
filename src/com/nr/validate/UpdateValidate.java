package com.nr.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nr.enquiry.EnquiryForm;

public class UpdateValidate implements Validator{

	@Override
	public boolean supports(Class obj) {
	 
		return  EnquiryForm.class.equals(obj);
	}
	
public void validate(Object obj, Errors er) {
		
		EnquiryForm ef=(EnquiryForm)obj;
		String s=ef.getName();
		String dob=ef.getDob();
		String mmbl=ef.getMblno();
		String em=ef.getEmail();
		String quali=ef.getQuali();
		 String sta=ef.getState();
		 String address=ef.getAddress();
		 String collegeName=ef.getCollegeName();
		 String semester=ef.getSemester();
		 
		 
		 
		 
		 
		 
		if(ef.getDob()==null||ef.getDob().length()==0){
			er.rejectValue("dob", "errors.dob.required", new Object[]{}, "dob is required");
		}else if(dob!=null){
						
			try{
			 String date="^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
			 Pattern p=Pattern.compile(date);
			 Matcher m=p.matcher(dob);
			 if(!(m.matches())){
				 er.rejectValue("dob", "errors.dob.required", new Object[]{}, "dob not in pattern");
			 }
			 			 
			 	}catch (Exception e) {
			 		e.printStackTrace();
				}
			
		}		
		if(mmbl.length()==0|mmbl==null){
						er.rejectValue("mblno", "errors.mblno.required",new Object[]{},"Moblno is required");
					}else  if(mmbl.length()>=11){
						er.rejectValue("mblno", "errors.mblno.required",new Object[]{},"enter only 10 digit no");
					}else if(mmbl!=null&&mmbl.length()==10){

						 try{
							 /*int phh=mmbl.indexOf(0);
							  Pattern pt=Pattern.compile(String.valueOf(phh));
							  String reg="^\\"
							  Matcher mm1=Pattern.compile(regex)
							 int  phh2=mmbl.indexOf(1, mmbl.length()-1);
							 String phh3=String.valueOf(phh+phh2);*/
						String phn="[7-9]{1}?[0-9]{9}";
						Pattern p=Pattern.compile(phn);
						Matcher m=p.matcher(mmbl);
						if(!(m.matches())){
							er.rejectValue("mblno", "errors.mblno.required",new Object[]{},"not in pattern");
						} 
						 }catch (Exception e) {
							 e.printStackTrace();
						}
					}
		
		 
		
		if(quali==null||quali.length()==0){
			er.rejectValue("quali", "errors.quali.required",new Object[]{},"quali is required");
					}else if(quali!=null&&quali.length()<=6){
						
						String exp="[a-zA-Z]+";
						Pattern p=Pattern.compile(exp);
						Matcher m=p.matcher(quali);
						if(!(m.matches())){
							er.rejectValue("quali", "errors.quali.required",new Object[]{},"not in a paater or up to 6 char");
						}
					}else if(quali.length()>=6){
						er.rejectValue("quali", "errors.quali.required",new Object[]{},"enter up to  or <=6");
					}
		
		
		
		if(sta==null||sta.length()==0||sta.equals("---select state---")){
			er.rejectValue("state", "errors.state.required",new Object[]{},"state is required");
					}
		 
		
		if(semester==null||semester.length()==0){
			 er.rejectValue("semester", "errors.semester.required", new Object[]{}, "semester is required");
		 }
		 
		 if(collegeName==null||collegeName.length()==0){
			 er.rejectValue("collegeName", "errors.collegeName.required", new Object[]{}, "college name is required");
		 }		 
		 	 
		 
		 if(address==null||address.length()==0){
			 er.rejectValue("address", "errors.address.required",new Object[]{}, "address is required");
		 }
		
	}
	
}