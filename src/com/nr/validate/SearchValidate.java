package com.nr.validate;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nr.enquiry.EnquiryForm;

public class SearchValidate implements Validator{

	@Override
	public boolean supports(Class<?> obj) {
		 
		return EnquiryForm.class.equals(obj);
	}

	@Override
	public void validate(Object obj, Errors er) {
 
		EnquiryForm ef=(EnquiryForm)obj;
		
		if(ef.getId()==0){
			 er.rejectValue("id", "errors.id.required", new Object[]{"id"}, null);
		}
		
		 
		
	}

	
	 
	
}
