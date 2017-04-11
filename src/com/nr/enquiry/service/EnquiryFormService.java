package com.nr.enquiry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nr.enquiry.EnquiryForm;
import com.nr.enquiry.EnquiryFormTo;
import com.nr.enquiry.contact.EnquiryContact;

public class EnquiryFormService implements EnquiryService {

	@Autowired
	EnquiryContact ec;
	
 	
	@Override
	public int addcontactDAO(EnquiryFormTo ef) {
	 return ec.addcontactDAO(ef);
		
	}
	
	
	@Override
	public EnquiryForm searchById(int id) {
	 		
		return ec.searchById(id);
	}
	
	@Override
	public void updateEnquiryForm(EnquiryFormTo to) {
	 
		ec.updateEnquiryForm(to);
		
		
	}
	
	public int getnofrecords(String date){
		return ec.getnofrecords(date);
	}
	 
	
	
	 public  List<EnquiryFormTo> searchByDateform(String date,int start,int tor){
		 
		 return ec.searchByDateform(date,start,tor);
		 
	 }
	
	 @Override
	public List<EnquiryFormTo> search() {
	 
		return ec.search();
	}
}
