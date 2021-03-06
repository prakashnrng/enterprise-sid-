package com.nr.enquiry.service;

import java.util.List;

import com.nr.enquiry.EnquiryForm;
import com.nr.enquiry.EnquiryFormTo;

public interface EnquiryService {

	public int addcontactDAO(EnquiryFormTo ef);
	
	public EnquiryForm searchById(int id);
	
	 public void updateEnquiryForm(EnquiryFormTo to);
	 public int getnofrecords(String date);
	 
	 public  List<EnquiryFormTo> searchByDateform(String date,int start,int tor);
	 
	 public List<EnquiryFormTo> search();
}
