package com.nr.registration;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class RegistrationValidate implements Validator{
	
@Override
public boolean supports(Class<?> obj) {
  
	 
	
	return Registration.class.equals(obj);
}


@Override
	public void validate(Object obj, Errors er) {
 
	
	if(obj!=null){
		Registration registration=(Registration)obj;
		
		 
	 
	 String associatName=registration.getRasname();
	 
	 if(associatName==null||associatName.length()==0){
		 er.rejectValue("rasname", "errors.associatename.required", new Object[]{"rasname"}, "enter the associate name");
	 }else if(associatName!=null){
		 Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
		  
		 Matcher m=p.matcher(associatName);
		 if(!m.matches()){
			 System.out.println("associate Name not matches");
			 er.rejectValue("rasname", "errors.associatename.required", new Object[]{"rasname"}, "enter the cahacter not digits");
		 }
	 }
	 
	 
	 
	 String dob=registration.getRdob();
	 if(dob==null||dob.length()==0){
			System.out.println("validate error in dob");
			er.rejectValue("rdob", "errors.dateofbirth.required", new Object[]{}, "dob is required");
		}else if(dob!=null){
						
			try{
			 String date="^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
			 Pattern p=Pattern.compile(date);
			 Matcher m=p.matcher(dob);
			 if(!(m.matches())){
				 System.out.println("validate error in dob not in pattern");
				 er.rejectValue("rdob", "errors.dateofbirth.required", new Object[]{}, "dob not in pattern");
			 }
			 			 
			 	}catch (Exception e) {
			 		e.printStackTrace();
				}
			
		}		
	 
	 
	 String gender=registration.getRgender();
	 if(gender==null||gender.length()==0){
		 System.out.println("Registration validate->error in gender column");
		 er.rejectValue("rgender", "errors.gender.required", new Object[]{}, "select ur gender");
	 }
	 
		String bloodGroup=registration.getRbg();
		 if(bloodGroup==null||bloodGroup.length()==0){
			 System.out.println("Registration validate->error in blood group column");
			 er.rejectValue("rbg", "errors.bloodGroup.required", new Object[]{}, "select ur blood group");
		 }
		 
		String mobileno=registration.getRmbl();
		if(mobileno==null||mobileno.length()==0){
			System.out.println("Registration validate->error in moblie no  column");
			 
			er.rejectValue("rmbl", "errors.mobileno.required",new Object[]{},"Moblno is required");
		}else  if(mobileno.length()>=11){
			System.out.println("validate error in enter only 10 digit no");
			er.rejectValue("rmbl", "errors.mobileno.required",new Object[]{},"enter only 10 digit no");
		}else if(mobileno!=null&&mobileno.length()==10){

			 try{
				 /*int phh=mmbl.indexOf(0);
				  Pattern pt=Pattern.compile(String.valueOf(phh));
				  String reg="^\\"
				  Matcher mm1=Pattern.compile(regex)
				 int  phh2=mmbl.indexOf(1, mmbl.length()-1);
				 String phh3=String.valueOf(phh+phh2);*/
			String phn="[7-9]?[0-9]{9}";
			Pattern p=Pattern.compile(phn);
			Matcher m=p.matcher(mobileno);
			if(!(m.matches())){
				System.out.println("validate error in mbl not in pattern ");
				er.rejectValue("rmbl", "errors.mobileno.required",new Object[]{},"starting digit should be 7|8|9");
			} 
			 }catch (Exception e) {
				 e.printStackTrace();
			}
		}
		
		
		String email=registration.getRemial();
		
		if(email==null||email.length()==0){
			System.out.println("validate error in email is required ");
			er.rejectValue("remial", "errors.email.required",new Object[]{},"email is required");
		}else if(email!=null){
			  String exp="\\b[a-zA-Z0-9._%-]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}\\b";
			  Pattern p=Pattern.compile(exp);
			  Matcher m=p.matcher(email);
			  if(!(m.matches())){
				  System.out.println("validate error in email is not in a pattern  ");
			er.rejectValue("remial", "errors.email.required",new Object[]{},"[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z] not in this pattern");
					}
		}
		
		
		String qualification=registration.getRquali();
		if(qualification==null||qualification.length()==0){
			er.rejectValue("rquali", "errors.qualification .required",new Object[]{},"qualification is required");
			
		}else if(qualification!=null){
			 Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
			  
			 Matcher m=p.matcher(qualification);
			 if(!m.matches()){
				 System.out.println("qualification pattern not matches");
				 er.rejectValue("rquali", "errors.qualification.required", new Object[]{}, "enter the cahacter not digits");
			 }
		 }
		
		
		String state=registration.getRstate();
		 if(state==null||state.length()==0){
			 er.rejectValue("rstate", "errors.state.required", new Object[]{}, "enter ur state");
		 }else if(state!=null){
			 Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
			  
			 Matcher m=p.matcher(state);
			 if(!m.matches()){
				 System.out.println("associate Name not matches");
				 er.rejectValue("rstate", "errors.state.required", new Object[]{}, "enter the caharacter not digits");
			 }
		 }
		
		
		String fathername=registration.getRfname();
		 if(fathername==null||fathername.length()==0){
			 er.rejectValue("rfname", "errors.fathername.required", new Object[]{}, "provide father name");
		 }else if(fathername!=null){
			 Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
			  
			 Matcher m=p.matcher(fathername);
			 if(!m.matches()){
				 System.out.println("associate Name not matches");
				 er.rejectValue("rfname", "errors.fathername.required", new Object[]{}, "enter the caharacter not digits");
			 }
		 }
		
		String fatherOccupation=registration.getRfoc();
		if(fatherOccupation==null||fatherOccupation.length()==0){
			 er.rejectValue("rfoc", "errors.fatheroccupation.required", new Object[]{}, "pls enter father ocupation");
		 }else if(fatherOccupation!=null){
			 Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
			  
			 Matcher m=p.matcher(fatherOccupation);
			 if(!m.matches()){
				 System.out.println("associate Name not matches");
				 er.rejectValue("rfoc", "errors.fatheroccupation.required", new Object[]{}, "enter the caharacter not digits");
			 }
		 }
		
		
		String mothername=registration.getRmname();
		if(mothername==null||mothername.length()==0){
			 er.rejectValue("rmname", "errors.fatheroccupation.required", new Object[]{}, "pls enter mother name");
		 }else if(mothername!=null){
			 Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
			  
			 Matcher m=p.matcher(mothername);
			 if(!m.matches()){
				 System.out.println("mothername Name not matches");
				 er.rejectValue("rmname", "errors.fatheroccupation.required", new Object[]{}, "enter the caharacter not digits");
			 }
		 }
		
		String motherOccupation=registration.getRmoc();
		if(motherOccupation==null||motherOccupation.length()==0){
			 er.rejectValue("rmoc", "errors.motherOccupation.required", new Object[]{}, "pls enter motherOccupation");
		 }else if(motherOccupation!=null){
			 Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
			  
			 Matcher m=p.matcher(motherOccupation);
			 if(!m.matches()){
				 System.out.println("motherOccupation   not ina pattern");
				 er.rejectValue("rmoc", "errors.motherOccupation.required", new Object[]{}, "enter the caharacter not digits");
			 }
		 }
		
		
		String permanentaddress=registration.getRpmad();
		if(permanentaddress==null||permanentaddress.length()==0){
			 er.rejectValue("rpmad", "errors.permanentaddress.required", new Object[]{}, "pls enter permanent address");
		 }
		
		
		String parentContactNo=registration.getRpcnno();
		if(parentContactNo==null||parentContactNo.length()==0){
			 er.rejectValue("rpcnno", "errors.parentContactNo.required", new Object[]{}, "pls enter parent contact no");
		 }else  if(parentContactNo.length()>=11){
				System.out.println("validate error in enter only 10 digit no");
				er.rejectValue("rpcnno", "errors.mobileno.required",new Object[]{},"enter only 10 digit no");
			}else if(parentContactNo!=null&&parentContactNo.length()==10){

				 try{
					 /*int phh=mmbl.indexOf(0);
					  Pattern pt=Pattern.compile(String.valueOf(phh));
					  String reg="^\\"
					  Matcher mm1=Pattern.compile(regex)
					 int  phh2=mmbl.indexOf(1, mmbl.length()-1);
					 String phh3=String.valueOf(phh+phh2);*/
				String phn="[7-9]?[0-9]{9}";
				Pattern p=Pattern.compile(phn);
				Matcher m=p.matcher(parentContactNo);
				if(!(m.matches())){
					System.out.println("validate error in mbl not in pattern ");
					er.rejectValue("rpcnno", "errors.mobileno.required",new Object[]{},"starting digit should be 7|8|9");
				} 
				 }catch (Exception e) {
					 e.printStackTrace();
				}
			}
		
		
		//registration education start
	String grade=registration.getRedu().getGrade();
		
		if(grade==null||grade.length()==0){
			 er.rejectValue("redu.grade", "errors.grade.required", new Object[]{}, "pls enter ur grade");
		 }
		
		
		String collegeName=registration.getRedu().getClgnme();
		if(collegeName==null||collegeName.length()==0){
			 er.rejectValue("redu.clgnme", "errors.grade.required", new Object[]{}, "pls enter ur college name");
		 }
		
		
		String yearofpassing=registration.getRedu().getYop();
		
		if(yearofpassing==null||yearofpassing.length()==0){
			 er.rejectValue("redu.yop", "errors.yearofpassing.required", new Object[]{}, "enter year of passing ");
		 }
		
		String percentage=registration.getRedu().getPc();
		
		if(percentage==null||percentage.length()==0){
			 er.rejectValue("redu.pc", "errors.percentage.required", new Object[]{}, "enter ur percentage ");
		 }
		
		
		
		
		//registration education end
		
		
		String presentAddress=registration.getRpaddr();
		
		if(presentAddress==null||presentAddress.length()==0){
			 er.rejectValue("rpaddr", "errors.presentAddress.required", new Object[]{}, "enter ur present address ");
		 }
		
		 
		 
		
		String registrationDate=registration.getRdate();
		if(registrationDate==null||registrationDate.length()==0){
			 er.rejectValue("rdate", "errors.registrationDate.required", new Object[]{}, "enter registration date ");
		 }
		
		
		
		
		// registration office details
		
		String councellor=registration.getOrf().getOcouncil();
		
		if(councellor==null||councellor.length()==0){
			 er.rejectValue("orf.ocouncil", "errors.registrationDate.required", new Object[]{}, "enter registration date ");
		 }else if(councellor!=null){
			 Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
			  
			 Matcher m=p.matcher(councellor);
			 if(!m.matches()){
				 System.out.println("councellor   not ina pattern");
				 er.rejectValue("orf.ocouncil", "errors.councellor.required", new Object[]{}, "enter the caharacter not digits");
			 }
		 }
		
		
		String installment=registration.getOrf().getOinstal();
		
		if(installment==null||installment.length()==0){
			 er.rejectValue("orf.oinstal", "errors.installment.required", new Object[]{}, "enter installment date ");
		 }
		
		String specialoffer=registration.getOrf().getOspoffr();
		if(specialoffer==null||specialoffer.length()==0){
			 er.rejectValue("orf.ospoffr", "errors.specialoffer.required", new Object[]{}, "enter specialoffer date ");
		 }
				
		
		String batchno=registration.getOrf().getoBatcno();
		if(batchno==null||batchno.length()==0){
			 er.rejectValue("orf.oBatcno", "errors.batchno.required", new Object[]{}, "enter btach no ");
		 }
		
		
		String starDate=registration.getOrf().getOstarDate();
		if(starDate==null||starDate.length()==0){
			 er.rejectValue("orf.ostarDate", "errors.starDate.required", new Object[]{}, "enter ostarDate   ");
		 }
		
		String timings=registration.getOrf().getOtiming();
		
		if(timings==null||timings.length()==0){
			 er.rejectValue("orf.otiming", "errors.timings.required", new Object[]{}, "enter timings  ");
		 }
		
		
		//registration course detials
		
		String coursename=registration.getCurs().getCnm();
		if(coursename==null||coursename.length()==0){
			 er.rejectValue("curs.cnm", "errors.coursename.required", new Object[]{}, "enter coursename ");
		 }
		
		
		double coursefee=registration.getCurs().getCfee();
		if(coursefee==0){
			 er.rejectValue("curs.cfee", "errors.coursefee.required", new Object[]{}, "enter coursefee  ");
		 }
		
		double total=registration.getCurs().getCtotal();
		
		if(total==0){
			 er.rejectValue("curs.ctotal", "errors.total.required", new Object[]{}, "enter total  ");
		 }
		
		
		
		
		
		
	}
	}
}
