package com.nr.staff.validator;

import java.io.File;
import java.sql.Blob;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nr.staff.SAddress;
import com.nr.staff.Staff;

public class StaffValidator implements Validator {

	
	@Override
	public boolean supports(Class<?> obj) {
	 
		return Staff.class.equals(obj);
	}
	
	
	 
	@SuppressWarnings("unused")
	public void validate(Object o, Errors err) {
		
		Staff st=(Staff)o;
		SAddress ad=st.getSadd();
		if(st!=null){
		int id=st.getStafid();
		String fnm=st.getSfname();
		String lnm=st.getSlname();
		String mbl=st.getSmbl();
		String em=st.getSemail();
		
		int aid=ad.getSiad();
		String city=ad.getCity();
		String state=ad.getState();
		String town=ad.getTown();
		String doorno=ad.getDoorno();
		long pincode=ad.getPincode();
		String loc=ad.getSaloc();
		//String contenttype=st.getContenttype();
		String lastins=st.getSlastworkd();
		 Blob im=st.getImage();
			String ctyp=st.getContenttype();
		
		if(st.getSadd()!=null){
		  ad=st.getSadd();
		}
		
		 if(lastins==null||lastins.length()==0){
			 System.out.println("lastins is required");
			 err.rejectValue("slastworkd", "errors.required", new Object[]{"slastworkd"}, "slastworkd required");
			 
		 }else if(lastins!=null){
			 System.out.println("lastins patern matching");
			 Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
			   Matcher m=p.matcher(lastins);
			   if(!m.matches()){
				   System.out.println("should contain only character not digit");
				   err.rejectValue("slastworkd", "errors.required", new Object[]{"lastins"}, "should contain only character");
					}	
			 
		 }
		if(im==null){
			
			System.out.println("image is required");
			err.rejectValue("file","errors.requied",new Object[]{"file"},"upload ur image");
			
		}
		 
		if(fnm==null||fnm.length()==0){
			System.out.println("first name is required");
			err.rejectValue("sfname", "errors.required", new Object[]{"fname"}, "sfname is required");
		}else if(fnm!=null){
			 System.out.println("lastins patern matching");
			 Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
			   Matcher m=p.matcher(fnm);
			   if(!m.matches()){
				   System.out.println("should contain only character not digit");
				   err.rejectValue("sfname", "errors.required", new Object[]{"sfname"}, "should contain only character");
					}	
			 
		 }
		 
		if(lnm==null||lnm.length()==0){
			System.out.println("laast name is required");
			err.rejectValue("slname", "errors.required", new Object[]{"lname"}, "lname is required");
		}else if(lnm!=null){
			 System.out.println("last ins patern matching");
			 Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
			   Matcher m=p.matcher(lnm);
			   if(!m.matches()){
				   System.out.println("should contain only character not digit");
				   err.rejectValue("slname", "errors.required", new Object[]{"slname"}, "should contain only character");
					}	
			 
		 }
		
		if(mbl.length()<10||mbl==null){
			System.out.println("mbl is required");
			err.rejectValue("smbl", "errors.required", new Object[]{"smbl"}, "enter mbl");
		}else if(mbl!=null && mbl.length()>10){
			 
			System.out.println("smbl should containt only 10 digit");
			 err.rejectValue("smbl", "errors.required", new Object[]{"smbl"}, "> than 10 digit");
			}/*else if(mbl.length()<10 && mbl!=null){
				System.out.println("smbl should containt only < 10 digit");
				 err.rejectValue("smbl", "errors.required", new Object[]{"smbl"}, "< than 10 digit");
			}	*/	else if(mbl!=null && mbl.length()==10){
					 
		  Pattern p=Pattern.compile("[7-9]?[0-9]{9}");
		  Matcher m=p.matcher(mbl);
				
				
		 if(!(m.matches())){
			 err.rejectValue("smbl", "errors.required", new Object[]{"smbl"}, "should contain only digit"); 
		 }
		 
		}else if((mbl!=null) && (mbl.length()==10)){
			System.out.println("start of smbl contians only digi");
			Pattern p=Pattern.compile("[7-9]?[0-9]{9}");
			Matcher m=p.matcher(mbl);
			if(!(m.matches())){
			err.rejectValue("smbl", "errors.required", new Object[]{"smbl"}, "1st digit should [7|8|9]");
		} }
		
		
		
		if(em.length()==0||em==null){
			System.out.println("email is required");
			err.rejectValue("semail", "errors.required", new Object[]{"semail"}, "email is required");
		}else if(em!=null){
			String exp="\\b[a-zA-Z0-9._%-]+@[a-zA-Z]+\\.[a-zA-Z]{2,4}\\b";
			System.out.println("email not in a patern");
			Pattern p=Pattern.compile(exp);
			Matcher m=p.matcher(em);
			if(!(m.matches())){
				err.rejectValue("semail", "errors.required", new Object[]{"semail"}, "not in a pattern{[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]}");
			}
		}
		
		
		
		/*if(aid==0){
			System.out.println();
			err.rejectValue("siad", "errors.required", new Object[]{"email"}, null);
		}*/
		
		if(city==null||city.length()==0){
			System.out.println("city is required");
			err.rejectValue("sadd.city", "errors.required", new Object[]{"sadd.city"}, "city is required");
		}else if(city!=null){
			Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
			Matcher m=p.matcher(city);
			if(!m.matches()){
				System.out.println("city not in a pattern");
				err.rejectValue("sadd.city", "errors.required", new Object[]{"sadd.city"}, "enter only char");
			}
		}
		/*if(state==null||state.length()==0){
			System.out.println("state is required");
		 
			err.rejectValue("sadd.state", "errors.required", new Object[]{"state"}, "state is required");
		}*/
		
		if(town==null||town.length()==0){
			System.out.println("town is required");
			err.rejectValue("sadd.town", "errors.required", new Object[]{"town"}, "town is required");
		}else if(town!=null){
			Pattern p=Pattern.compile("^[a-zA-Z][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
			Matcher m=p.matcher(town);
			if(!m.matches()){
				System.out.println("town not in a pattern");
				err.rejectValue("sadd.town", "errors.required", new Object[]{"town"}, "enter only char");
			}
		}
			if(doorno==null||doorno.length()==0){
				System.out.println("doorno is required");
				err.rejectValue("sadd.doorno", "errors.required", new Object[]{"doorno"}, "doorno is required");
			}else if(doorno!=null){
				Pattern p=Pattern.compile("^[a-zA-Z0-9][0-9a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
				Matcher m=p.matcher(doorno);
				if(!m.matches()){
					System.out.println("doorno not in a pattern");
					err.rejectValue("sadd.doorno", "errors.required", new Object[]{"doorno"}, "doorno can containt num & dig");
				}
			}
			
			if(pincode==0){
				System.out.println("pincode is required");
				err.rejectValue("sadd.pincode", "errors.required", new Object[]{"sadd.pincode"}, "pincode is required");
			} 
			
			
			
			if(loc==null||loc.length()==0){
				System.out.println("loc is required");
				err.rejectValue("sadd.saloc", "errors.required", new Object[]{"sadd.saloc"}, "loc is required");
			}else if(loc!=null){
				Pattern p=Pattern.compile("^[a-zA-Z0-9][a-zA-Z $&+,:;=?@#|'<>.^*()%!-]*");
				Matcher m=p.matcher(loc);
				if(!m.matches()){
					System.out.println("loc not in a pattern");
					err.rejectValue("sadd.saloc", "errors.required", new Object[]{"sadd.saloc"}, "saloc can containt num & dig");
				}
			}
			
			/*if(contenttype.length()==0||contenttype==null){
				System.out.println("content type is required");
				err.rejectValue("contenttype", "errors.required", new Object[]{"contenttype"}, "content typ is required");
			 
			}*/
		
		}
		
		
		}
	}
	
	
 
