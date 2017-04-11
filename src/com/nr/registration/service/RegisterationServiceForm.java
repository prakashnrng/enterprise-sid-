package com.nr.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nr.registration.Registration;
import com.nr.registration.RegistrationTo;
import com.nr.registration.dao.RegistrationDAO;

public class RegisterationServiceForm implements RegistrationService{
	 
	@Autowired
	RegistrationDAO registrationDAO;
	
	public String addRegistration(RegistrationTo reg) {
	 
		return registrationDAO.addRegistration(reg);
		
	}
	
	  public RegistrationTo showRegistrationById(String id) {
		
		return registrationDAO.showRegistrationById(id);
	}
	public List<RegistrationTo> showRegistration(){
		return registrationDAO.showRegistration();
	}
	
	
	@Override
	public void editRegistration(RegistrationTo registrationTo) {
	 registrationDAO.editRegistration(registrationTo);
		
	}
 
}
