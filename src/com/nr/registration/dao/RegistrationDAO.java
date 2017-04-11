package com.nr.registration.dao;

import java.util.List;

import com.nr.registration.Registration;
import com.nr.registration.RegistrationTo;

public interface RegistrationDAO {
	public String addRegistration(RegistrationTo reg);
	
	
	 public List<RegistrationTo> showRegistration();
	
	public RegistrationTo showRegistrationById(String id);
	
	public void editRegistration(RegistrationTo registrationTo); 
}
