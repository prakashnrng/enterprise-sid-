package com.nr.registration.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.nr.registration.RCourse;
import com.nr.registration.Education;
import com.nr.registration.Office;
import com.nr.registration.Registration;
import com.nr.registration.RegistrationTo;

public class RegistrationHibernateDAO implements RegistrationDAO{
	
	@Autowired
	HibernateTemplate htemp;
	
	@Override
	public String addRegistration(RegistrationTo registrationto) {
	 
		System.out.println("RegistrationHibernateDAO->addRegistration");
		
		Registration registration=new Registration(registrationto.getRasname(),registrationto.getRdob(),registrationto.getRgender(),registrationto.getRbg(),registrationto.getRmbl(),registrationto.getRemial(),registrationto.getRquali(),registrationto.getRstate(),registrationto.getRfname(),registrationto.getRfoc(),registrationto.getRmname(),registrationto.getRmoc() ,registrationto.getRpmad(),registrationto.getRpcnno() ,registrationto.getRpaddr(),registrationto.getRdate());
		
		
		
		Education education=new Education(registrationto.getRedu().getGrade(),registrationto.getRedu().getClgnme(),registrationto.getRedu().getYop(),registrationto.getRedu().getPc());
		htemp.save(education);
		
		Office office=new Office(registrationto.getOrf().getOcouncil(),registrationto.getOrf().getOinstal(),registrationto.getOrf().getOspoffr() ,registrationto.getOrf().getoBatcno() ,registrationto.getOrf().getOstarDate(),registrationto.getOrf().getOtiming());
		htemp.save(office);
		
		RCourse course=new RCourse(registrationto.getCurs().getCnm(),registrationto.getCurs().getCfee(),registrationto.getCurs().getCtotal());
		htemp.save(course);
		
		 
		
		 
		registration.setRedu(education);
		 registration.setOrf(office);
		registration.setCurs(course); 
		Serializable i=htemp.save(registration);
		 
		System.out.println("successfully saved");
		 String value=(String)i;
		return value;
		
	}

	 @Override
	public List<RegistrationTo> showRegistration() {
		 System.out.println("RegistrationHibernateDAO->showRegistration()");
		 
		 String query="from Registration r";
		 List<Registration>li=htemp.find(query);
		 RegistrationTo rto=null;
		 List<RegistrationTo> registrationTos=new ArrayList<RegistrationTo>();
		 for(Registration r:li){
			 rto=new RegistrationTo(r.getId(), r.getRasname(),r.getRdob(),r.getRgender(),r.getRbg(),r.getRmbl(),r.getRemial(),r.getRquali() ,r.getRstate(),r.getRfname(),r.getRfoc(),r.getRmname(),r.getRmoc(),r.getRpmad(),r.getRpcnno(),r.getRpaddr() ,r.getRdate());
			 registrationTos.add(rto);
		 }
		 
		return registrationTos;
	}
	
	
	
	@Override
	public RegistrationTo showRegistrationById(String id) {
 System.out.println("RegistrationHibernateDAO->showRegistration()");
		 
		 String query="from Registration r where r.id=?";
		 
		 List<Registration>li=htemp.find(query,id);
		 RegistrationTo rto=null;
		 //List<RegistrationTo> registrationTos=new ArrayList<RegistrationTo>();
		 for(Registration r:li){
			 rto=new RegistrationTo(r.getId(), r.getRasname(),r.getRdob(),r.getRgender(),r.getRbg(),r.getRmbl(),r.getRemial(),r.getRquali() ,r.getRstate(),r.getRfname(),r.getRfoc(),r.getRmname(),r.getRmoc(),r.getRpmad(),r.getRpcnno(),r.getRpaddr() ,r.getRdate());
			 
			// Education education=new Education(r.getRedu().getEduid(),r.getRedu().getGrade(),r.getRedu().getClgnme(),r.getRedu().getYop(),r.getRedu().getPc());
			 
			 rto.setRedu(r.getRedu());
			 rto.setOrf(r.getOrf());
			 rto.setCurs(r.getCurs());
			 //registrationTos.add(rto);
		 }
		 
		return rto;
	}
	
	@Override
	public void editRegistration(RegistrationTo registrationTo) {
		 
		System.out.println("Registration Hibernate->editRegistration");
		
		String id=registrationTo.getId();
		Education education=new Education(registrationTo.getRedu().getEduid(),registrationTo.getRedu().getGrade(),registrationTo.getRedu().getClgnme(),registrationTo.getRedu().getYop(),registrationTo.getRedu().getPc());
		htemp.update(education);
		
		Office office=new Office(registrationTo.getOrf().getOfid(),registrationTo.getOrf().getOcouncil(),registrationTo.getOrf().getOinstal(),registrationTo.getOrf().getOspoffr() ,registrationTo.getOrf().getoBatcno() ,registrationTo.getOrf().getOstarDate(),registrationTo.getOrf().getOtiming());
		htemp.update(office);
		
		RCourse course=new RCourse(registrationTo.getCurs().getCouid(),registrationTo.getCurs().getCnm(),registrationTo.getCurs().getCfee(),registrationTo.getCurs().getCtotal());
		htemp.update(course);
		
		
		
		
		
		 Registration registration=new Registration(registrationTo.getId(),registrationTo.getRasname(),registrationTo.getRdob() , registrationTo.getRgender(),registrationTo.getRbg(),registrationTo.getRmbl(),registrationTo.getRemial() ,registrationTo.getRquali(),registrationTo.getRstate(),registrationTo.getRfname(),registrationTo.getRfoc(),registrationTo.getRmname(),registrationTo.getRmoc() ,registrationTo.getRpmad(),registrationTo.getRpcnno(),registrationTo.getRpaddr(),registrationTo.getRdate());
		 registration.setRedu(education);
		 registration.setOrf(office);
		 registration.setCurs(course);
		 htemp.update(registration);
		System.out.println("Registration Hibernate->upadate");
		
	} 
	
	
}
