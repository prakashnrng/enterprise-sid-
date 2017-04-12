package com.nr.spring;

 
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Hibernate;
import org.hibernate.lob.SerializableBlob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

 
import com.nr.admin.Adminform;
import com.nr.ceo.Ceo;
import com.nr.enquiry.EnquiryForm;
import com.nr.enquiry.EnquiryFormTo;
import com.nr.enquiry.EnquiryMail;
import com.nr.enquiry.service.EnquiryFormService;
import com.nr.enquiry.service.EnquiryService;
import com.nr.excel.ExcelBuilder;
import com.nr.registration.RCourse;
import com.nr.registration.Education;
import com.nr.registration.Office;
import com.nr.registration.Registration;
import com.nr.registration.RegistrationTo;
import com.nr.registration.RegistrationValidate;
import com.nr.registration.dao.RegistrationDAO;
import com.nr.registration.service.RegistrationService;
import com.nr.staff.SAddress;
import com.nr.staff.Staff;
import com.nr.staff.StaffTo;
import com.nr.staff.dao.StaffDao;
import com.nr.staff.service.StaffService;
import com.nr.staff.validator.StaffValidator;
import com.nr.user.User;
import com.nr.user.UserTO;
import com.nr.user.UserValidate;
import com.nr.user.UserforgotMail;
import com.nr.user.service.UserService;
import com.nr.validate.EnquiryValidate;
import com.nr.validate.SearchValidate;
import com.nr.validate.UpdateValidate;
import com.sun.mail.iap.Response;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
 import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialBlob;

import jxl.write.WritableSheet;

@Controller
 public class LoginController {

	@Autowired
	ServletContext context;
	
	@Autowired
	EnquiryMail email;
	
	@Autowired
	UserTO uto;
	
	@Autowired
	SAddress add;
	
	@Autowired
	User user;
	
@Autowired
	EnquiryValidate ev;

@Autowired
UpdateValidate uv;

@Autowired
UserService usrserv;

	@Autowired
	 EnquiryService es;
	
	@Autowired
	SearchValidate sv;
 @Autowired
 Staff stf;
 
 @Autowired
 Staff stfto;

 @Autowired
 StaffService sfr;
 
 @Autowired
 StaffDao stfda;

 @Autowired
 StaffValidator stffv;
 
 @Autowired
 ExcelBuilder eb;
 
 @Autowired
 UserValidate usrv;
 
 
 @Autowired
 UserforgotMail ufm;
 
 
 @Autowired
 Registration rfm;
 
 @Autowired
 RegistrationTo registrationTo;
 
 @Autowired
 RegistrationValidate registrationValidate;
  
  
 
 @Autowired
 RegistrationService registrationService;
 
  
 
 int start=0,tnor=0,end=0,tor=5;
 
 
 HSSFSheet sheet;
 HSSFWorkbook hwrk;
 File file;
 
 //staff deatils
 
	@RequestMapping(value="/staff.nr")
	public String staffform(Map<String,Object> map){
		System.out.println("LoginContoller->staffform");
		Staff s=new Staff();
		map.put("STAF", s);
		return "STF";
	}
	
	/*
	@RequestMapping(value="/upload.nr",method=RequestMethod.POST)
	public String uploadFile(@RequestParam("file")MultipartFile file){
		String msg="";
		if(file.isEmpty()){
			msg="selected file is empty";
			
		}else{
			try{
				byte data[]=file.getBytes();
				File dir=new File("D:/fileimage");
				if(!dir.exists())dir.mkdir();
				File f=new File(dir,file.getOriginalFilename());
				BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream(f));
				stream.write(data);
				stream.close();
				msg="File uploaded successfully"+f.getAbsolutePath();
			}catch (Exception e) {
				e.printStackTrace();
				msg="Error in uploading file";
			}
		}
		return msg;
	}
	*/
	@RequestMapping(value="/sdetails.nr")
	 
	public String staffDeailsform(@RequestParam("file")MultipartFile file,@ModelAttribute("STAF")Staff stf,Errors e,HttpServletRequest req)throws Exception{
		System.out.println("LoginController->staffDeaitls");
		
		byte data[]=file.getBytes();
		String cont=file.getContentType();			
		System.out.println("image content type"+"\t"+cont);
		Blob blob= Hibernate.createBlob(data);

		stf.setImage(blob);

		/* if(file==null){
			 e.rejectValue("file", null, new Object[]{"file"}, "please upload ur image");
		 }
		*/
		 stffv.validate(stf,e);
		if(e.hasErrors()){
			return "STF";
		}else{
		
//		StaffTo ss=new StaffTo(stf.getSfname(),stf.getSlname(),stf.getSmbl(),stf.getSquali(),stf.getSEmail(),);
		 
		 
	 
	 
		/*try{
			//
	
			String msg="";
			if(file!=null){
				msg="selected file is empty";
				
			}else{
				try{
					byte data[]=file.getBytes();
					File dir=new File("D:/fileimage");
					if(!dir.exists())dir.mkdir();
					File f=new File(dir,file.getOriginalFilename());
					BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream(f));
					stream.write(data);
					stream.close();
					msg="File uploaded successfully"+f.getAbsolutePath();
		*/
			
			
			 
			//MultipartFile file=stf.getImage();
			 
		try{
		
				 
		
		SAddress addr=stf.getSadd();
		
		StaffTo ss=new StaffTo(stf.getSfname(),stf.getSlname(),stf.getSmbl(),stf.getSquali(),stf.getSemail(),stf.getSadd(),stf.getSlastworkd(),stf.getImage(),cont);
		
//		StaffTo ss=new StaffTo(stf.getSfname(),stf.getSlname(),stf.getSmbl(),stf.getSquali(),stf.getSemail(),stf.getSlastworkd(),blob);
		System.out.println(ss);
//		ss.setSadd(stf.getSadd());
		System.out.println(stf.getSadd().toString());
		sfr.addStaffService(ss);
		return "STSUCC";
		 
		}catch (Exception ee) {
			ee.printStackTrace();
		}
		/*}catch (Exception ee) {
			ee.printStackTrace();
		}
			}
		
		*/
		}
		return "EMPTY";
	}
	
	
	
	 
	@RequestMapping(value="/searstaff.nr")
	public String searchStaff(Map<String,Object> m){
		System.out.println("LoginController->searchStaff");
		Staff sf=new Staff();
		m.put("STF",sf);
		
		//ses.setAttribute("EDIT", "false");
		return "SEARSTAFF1";
		
	}
	
	/*@RequestMapping(value="/searstaffrm.nr")
	public String searchimageStaffForm(@ModelAttribute("STF")Staff stf,Errors e,ModelMap m,HttpServletResponse res){
		System.out.println("LoginCOnt->searchstaffform");
		StaffTo sf=sfr.searchStaffService(stf.getStafid());
		//sf.setSadd(stf.getSadd());
		if(sf!=null){
			
		Staff st=new Staff(sf.getStafid(),sf.getSfname(),sf.getSlname(),sf.getSmbl(),sf.getSquali(),sf.getSemail(),sf.getSlastworkd(),sf.getImage(),sf.getContenttype());
		System.out.println(st);
		 
		res.setContentType("image/jpeg,image/jpg,image/png,image/gif");
		res.getOutputStream().write(sf.getImage());
		
		
		 

 		SAddress sa=sf.getSadd();
		
		System.out.println(sa);
 		
		 
		   try{
 
 
  OutputStream out=res.getOutputStream();
		res.setContentType(st.getContenttype());
		IOUtils.copy(sf.getImage().getBinaryStream(), out);
		out.flush();
		out.close();
  
		 }catch (Exception ee) {
ee.printStackTrace();
		}  
		  		return "SEARSFORM";
		}else{
			return "SEARERROR";
		}
		
	}
*/		
	
	
	 
	@RequestMapping(value="/searstaffrm.nr")
	public String searchStaffForm(@ModelAttribute("STF")Staff stf,Errors e,ModelMap m,HttpSession ses,HttpServletResponse res){
		System.out.println("LoginCOnt->searchstaffform");
		StaffTo sf=sfr.searchStaffService(stf.getStafid());
		//sf.setSadd(stf.getSadd());
		if(sf!=null){
			
		Staff st=new Staff(sf.getStafid(),sf.getSfname(),sf.getSlname(),sf.getSmbl(),sf.getSquali(),sf.getSemail(),sf.getSlastworkd(),sf.getImage(),sf.getContenttype());
		System.out.println(st);
		 
		/*res.setContentType("image/jpeg,image/jpg,image/png,image/gif");
		res.getOutputStream().write(sf.getImage());
		
		*/
		 

 		SAddress sa=sf.getSadd();
		
		System.out.println(sa);
		ses.setAttribute("STAFF", st);
		ses.setAttribute("ADD", sa);
		ses.setAttribute("EDIT", "false");
		 
		/*   try{
 
		 Blob imageBlob=sf.getImage();
		 byte[] blobArr=imageBlob.getBytes(0, (int)imageBlob.length());
		 BufferedImage image=ImageIO.read(new ByteArrayInputStream(blobArr));
		 ImageIO.write(image, sf.getContenttype(), "");
   
		res.setContentType(st.getContenttype());
	 IOUtils.copy(sf.getImage().getBinaryStream(), out);
		out.flush();
		out.close();
   
		 }catch (Exception ee) {
ee.printStackTrace();
		}  */
		  		return "SEARSFORM";
		}else{
			return "SEARERROR";
		}
		
	}
	
	@RequestMapping(value="/staffedit.nr")
	public String editStaffdetails(Map m,HttpSession ses){
		System.out.println("LoginController->editStaffDetails()");
		ses.setAttribute("EDIT", "true");
		Staff st=new Staff();
		m.put("staff", st);
		//ses.setAttribute("staff", staff);
		 return "SEARSFORM";
	}
	
	@RequestMapping(value="/staffeditdetails.nr")
	public String editStaffDetailsForm(@RequestParam("file")MultipartFile file,@ModelAttribute("staff")Staff stf,HttpSession ses) throws IOException{
		System.out.println("LoginController->editStaffDetailsForm()");
		
		byte data[]=file.getBytes();
		String cont=file.getContentType();					
		Blob blob= Hibernate.createBlob(data);

		stf.setImage(blob);

		
			 
		try{
		
				 
		
		SAddress addr=stf.getSadd();
		
		StaffTo ss=new StaffTo(stf.getStafid(),stf.getSfname(),stf.getSlname(),stf.getSmbl(),stf.getSquali(),stf.getSemail(),stf.getSadd(),stf.getSlastworkd(),blob,cont);
		
//		StaffTo ss=new StaffTo(stf.getSfname(),stf.getSlname(),stf.getSmbl(),stf.getSquali(),stf.getSemail(),stf.getSlastworkd(),blob);
		System.out.println(ss);
//		ss.setSadd(stf.getSadd());
		System.out.println(stf.getSadd().toString());

		sfr.updateStaff(ss);
		System.out.println("LoginController->successfully updated");
		return "SEARSFORM1";
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return "SEARERROR";
	}
	
	
	/*
	@RequestMapping(value="/stfsear.nr")
	public String searchStaffForm(@RequestParam("STF")Staff stf,Errors e,HttpSession ses){
		System.out.println("LoginContoller->searchStaffForm");
				
		StaffTo st=sfr.searchStaffService(stf.getStafid(),stf.getSmbl());
		ses.setAttribute("SIDSEA", st);
		return "SEARSFORM";
	}
	*/
	
	
	@RequestMapping(value="/enquiry.nr")
	public String enquiryForm(Map<String,Object> map){
		
	EnquiryForm ef=new EnquiryForm();
	map.put("EQF", ef);
	return "EQEF1";
		
	}
	
	
	@RequestMapping(value="/admlog.nr")
	public String adminForm(@ModelAttribute("ADF")Adminform ad,Errors e,HttpServletRequest req){
	
		System.out.println("LoginController->adminform");
		
		return "ADMEF";
	}
	
	
	@RequestMapping(value="/updateEnquiryForm.nr")
	public String adminEntry(@ModelAttribute("EEF")EnquiryForm ef,Errors e,HttpServletRequest req){
		System.out.println("LoginController->updateEntry");
		uv.validate(ef, e);
		if(e.hasErrors()){
			return "EREF"; 
		}else{ 
		
			//EnquiryFormTo eto=new EnquiryFormTo(ef.getId(), ef.getName(), ef.getDob(),ef.getMblno(), ef.getGender(), ef.getEmail(), ef.getQuali(), ef.getState(), ef.getKnow(), ef.getCourse(),ef.getDate());
			
			EnquiryFormTo eft=new EnquiryFormTo(ef.getId(),ef.getName(),ef.getDob(),ef.getMblno(),ef.getGender(),ef.getEmail(),ef.getQuali(),ef.getState(),ef.getKnow(),ef.getCourse(),ef.getDate(),ef.getAddress(),ef.getCollegeName(),ef.getSemester());
			es.updateEnquiryForm(eft);
			
			return "UPDTSUCCDEF";
		}
		}
		
		 				 
		
	 
		
	 
	
	@RequestMapping(value="/editform.nr")
	public String editForm1(Map<String,Object> m,HttpSession ses){
		System.out.println("loginController=>editform");
		 
		  	     
		  	      EnquiryForm eef=new EnquiryForm();
		  	      m.put("EEF", eef);
		  	     
		ses.setAttribute("EDIT", "TRUE");
		 	return "SUCCESSDEF";
	}
	/*
	@RequestMapping(value="/editform.nr")
	public String editForm(Map<String,Object> m){
		System.out.println("loginController=>adminform");
		
	}*/
	//)@DateTimeFormat(pattern="yyyy-MM-dd") @RequestParam("date")String dueDate
	
	@RequestMapping(value="/efp.nr") 
	public String eqForm(@ModelAttribute("EQF")EnquiryForm ad,Errors e,HttpServletRequest req){
		try{
			
			/*
			 * conversion of string to date
			 * String startDate="01-02-2013";
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yyyy");
			java.util.Date date = sdf1.parse(startDate);
			java.sql.Date sqlStartDate = new java.sql.Date(date.getTime()); 
			*/
			
/*	 System.out.println(ad);
		System.out.println("LoginController->adminform");
		
		 SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		 java.util.Date ud1=dt1.parse(dueDate);
		 Date sqld=new Date(ud1.getDate());
         //Date date =(Date)dt1.parse(dt1.format(dueDate));
                 
         ad.setDate(sqld);*/
         
        
	ev.validate(ad,e);
		if(e.hasErrors()){
			
		return "EQEF1";
	}
		 
		
		String kn[]=ad.getKnow();
		for(String k:kn){
			System.out.println(k);
		}
		String cou[]=ad.getCourse();
		for(String c:cou){
			System.out.println(c);
		}
		
		
		/*EnquiryFormTo eto=new EnquiryFormTo(0,ad.getName(),ad.getDob(),ad.getMblno(),ad.getGender(),
				ad.getEmail(),ad.getQuali(),ad.getState(),kn,cou,ad.getDate());
		*/
		EnquiryFormTo eto=new EnquiryFormTo(0,ad.getName(),ad.getDob(),ad.getMblno(),ad.getGender(),ad.getEmail(),ad.getQuali(),ad.getState(),ad.getKnow(),ad.getCourse(),ad.getDate(),ad.getAddress(),ad.getCollegeName(),ad.getSemester());
		
		
		String email1=ad.getEmail();
		String from="prakashnrng@gmail.com";
		email.sendMail(from,email1,"hi prakash nr", "this is my spring mail,hi nrp,hi guys");
		
		System.out.println("lc->eto");
	System.out.println(eto);
  int i=es.addcontactDAO(eto);
  return "SUCCESSDEF1";
  
		}catch (Exception ee) {
			ee.printStackTrace();
		}
	 
			return "EQEF1";
		
	}
	
	 
	
	
	@RequestMapping(value="/search.nr")
	public String searchidform(Map<String,Object> map){
		System.out.println("LoginController->searchidform");
		EnquiryForm ef=new EnquiryForm();
		map.put("EF", ef);
		return "SEARCHDEF";
		
	}
	
/*	@RequestMapping(value="/sendemail.nr")
	public String sendEmail(Map<String,Object> map){
		System.out.println("send email");
		EnquiryForm ef=new EnquiryForm();
		map.put("EF", ef);
		return "EMAILDEF";
		
	}
	
	@RequestMapping(value="/mailsend.nr")
	public String mailsend(@ModelAttribute("")EnquiryForm ef,Errors er,HttpServletRequest req){
	
		return null;
	}
	*/
	
	@RequestMapping(value="/searchBySid.nr")
	public String searchForm(@ModelAttribute("EF")EnquiryForm ef,Errors e,HttpServletRequest req){
		
		System.out.println("LoginController->searchForm");
		sv.validate(ef, e);
		if(e.hasErrors()){
			return "ERRORDEF";
		}
				
		EnquiryForm eef=es.searchById(ef.getId());
		String kw[]=eef.getKnow();
		String co[]=eef.getCourse();
				
		HttpSession ses=req.getSession();
		
		 
		 ses.setAttribute("EDIT",false);
		ses.setAttribute("ENQUIRYD", eef);
		ses.setAttribute("KW", kw);
		ses.setAttribute("CO", co);
		 return "SUCCESSDEF";
		
	}
	
	
	@RequestMapping(value="/downloadexcel.nr")
	public String downloadexcel(@ModelAttribute("EF")EnquiryForm ef,Errors er,HttpServletRequest req,HttpServletResponse res) throws IOException{
		 hwrk=new HSSFWorkbook();
		 sheet=hwrk.createSheet("enquiry");
		 int row=0;
		 int col=0; 
		 
		 HttpSession ses=req.getSession();
			System.out.println("LoginController->searchByDate()");
			 String date=ef.getDate();
			 System.out.println("LoginCOntroller-date"+date);
			   tnor=es.getnofrecords(date);
			 System.out.println("the no of records are"+ tnor);
			 //List<EnquiryFormTo> li=es.searchByDateform(date,start,tor);
			 List<EnquiryFormTo> eeto=es.search();
			 HttpSession ses1=req.getSession();
			 ses1.setAttribute("LIST", eeto);
			 System.out.println("-----------------------------------------");
			 System.out.println(eeto);
			 System.out.println("-----------------------------------------");
			 
			  Map<String,Object> m=new HashMap<String, Object>();
				m.put("EF", eeto);		
					try{
			eb.buildExcelDocument(m, hwrk, req, res);
			
							}catch (Exception e) {
						 e.printStackTrace();
					}
			 /*EnquiryFormTo efto=new EnquiryFormTo();
			  for(EnquiryFormTo eto:li){
				  efto.setId(eto.getId());
				  efto.setName(eto.getName());
				  efto.setDob(eto.getDob());
				  efto.setMblno(eto.getMblno());
				  efto.setGender(eto.getGender());
				  efto.setQuali(eto.getQuali());
				  efto.setState(eto.getState());
				  efto.setKnow(eto.getKnow());
				  efto.setCourse(eto.getCourse());
				  efto.setDate(eto.getDate());
			  }
			
*/			
			 /*FileInputStream file = new FileInputStream(new      
					    File("D:\\prakash\\siddb1\\siddhransnew\\WebRoot\\WEB-INF\\pages\\excel.xlsx"));
			 XSSFWorkbook wb=new XSSFWorkbook(file);
			 //HSSFWorkbook wb=new HSSFWorkbook(file);
			 XSSFSheet sht=wb.getSheetAt(0);
			 XSSFRow h=sht.createRow(0);
			 XSSFCellStyle style1=wb.createCellStyle();
			 //CellStyle style1 = hwrk.createCellStyle();
			 h.createCell(0).setCellValue("ID");
				 h.getCell(0).setCellStyle(style1);
				h.createCell(1).setCellValue("NAME");
				 h.getCell(1).setCellStyle(style1);
				 sht.setColumnWidth(1, 10000);
				h.createCell(2).setCellValue("MBLNO");
				h.getCell(2).setCellStyle(style1);
				sht.setColumnWidth(2, 10000);
				h.createCell(3).setCellValue("GENDER");
				h.getCell(3).setCellStyle(style1);
				 
				h.createCell(4).setCellValue("EMAIL");
				h.getCell(4).setCellStyle(style1);
				sht.setColumnWidth(4, 10000);
				h.createCell(5).setCellValue("QUALI");
				h.getCell(5).setCellStyle(style1);
				h.createCell(6).setCellValue("state");
				h.getCell(6).setCellStyle(style1);
				sht.setColumnWidth(6, 10000);
				h.createCell(7).setCellValue("KNOW");
				h.getCell(7).setCellStyle(style1);	
				sht.setColumnWidth(7, 10000);
				h.createCell(8).setCellValue("course");
		    	h.getCell(8).setCellStyle(style1);
		    	sht.setColumnWidth(8, 10000);
		    	h.createCell(9).setCellValue("date");
		    	h.getCell(9).setCellStyle(style1);
		       
				 int rowCount1 = 1;
		         int c1=0;
				
				
				for (EnquiryFormTo eto1 : eeto) {
		            XSSFRow aRow1 = sht.createRow(rowCount1++);
		            aRow1.createCell(0).setCellValue(eto1.getId());
		            aRow1.createCell(1).setCellValue(eto1.getName() );
		            aRow1.createCell(2).setCellValue(eto1.getMblno());
		           aRow1.createCell(3).setCellValue(eto1.getGender());
		            aRow1.createCell(4).setCellValue(eto1.getEmail());
		            aRow1.createCell(5).setCellValue(eto1.getQuali());
		            aRow1.createCell(6).setCellValue(eto1.getState()); 
		            String str1[]=eto1.getKnow();
		            int count1=7;
		            
			String scc="";
		            for(String s:str1){
		            	
		            	scc=scc+s+",";
		            	//
		            	 
		          
		            }
			
			
		            if(scc.startsWith(null)){
		            	scc.trim();
		            }
		            
		           // aRow1.createCell(count1, count1).setCellValue(scc);
		            aRow1.createCell(count1).setCellValue(scc);
		       	 count1++;
		       	 System.out.println(count1);
		        	
		        	
		             
		            String sc[]=eto1.getCourse();
		            String sccc="";
		            for(String s:sc){
		            	
		          sccc=sccc+s+",";  	 
		            	// h.createCell(count1);
		            	 
		            }
		            aRow1.createCell(count1).setCellValue(sccc);
		       	 count1++;
		       	 System.out.println(count1); 
		       	  
		            count1++; 
		            System.out.println(count1); 
		            
		            aRow1.createCell(count1).setCellValue(eto1.getDate());
		            
				
				}
				
				FileOutputStream fos=new FileOutputStream("D:\\prakash\\siddb1\\siddhransnew\\WebRoot\\WEB-INF\\pages\\excel.xlsx");
				wb.write(fos);
			 
			 
			 
	 
			 
			 
			 
			 
			 
			 
			 
			 
			
			 */
			 
			 return "SEARCDAT1";
			 
 //List<EnquiryFormTo> li=es.searchByDateform(date,start,tor);
		 
		 
		 
		 /*HSSFRow header = sheet.createRow(0);
			header.createCell(0).setCellValue("ID");
			header.createCell(1).setCellValue("NAME");
			header.createCell(2).setCellValue("MBLNO");
			header.createCell(3).setCellValue("GENDER");
			header.createCell(4).setCellValue("EMAIL");
			header.createCell(5).setCellValue("QUALI");
			header.createCell(6).setCellValue("state");
			header.createCell(7).setCellValue("KNOW");
			header.createCell(8).setCellValue("course");
			header.createCell(9).setCellValue("date");
			
			
			int rowNum = 1;
			 
		 
		  
		 
         
	        // create a new Excel sheet
	        HSSFSheet sheet = hwrk.createSheet("Java Books");
	        sheet.setDefaultColumnWidth(30);
	         
	        // create style for header cells
	        CellStyle style = hwrk.createCellStyle();
	        Font font = hwrk.createFont();
	        font.setFontName("Arial");
	        style.setFillForegroundColor(HSSFColor.BLUE.index);
	        style.setFillPattern(CellStyle.SOLID_FOREGROUND);
	        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
	        font.setColor(HSSFColor.WHITE.index);
	        style.setFont(font);
	         
	       
	        
	        // create data rows
	        int rowCount = 1;
	         int c=0;
	         
	        for (EnquiryFormTo eto : li) {
	            HSSFRow aRow = sheet.createRow(rowCount++);
	            aRow.createCell(c++).setCellValue(eto.getId());
	            aRow.createCell(c++).setCellValue(eto.getName() );
	            aRow.createCell(c++).setCellValue(eto.getMblno());
	            aRow.createCell(c++).setCellValue(eto.getGender());
	            aRow.createCell(c++).setCellValue(eto.getEmail());
	            aRow.createCell(c++).setCellValue(eto.getQuali());
	            aRow.createCell(c++).setCellValue(eto.getState());
	            String str[]=eto.getKnow();
	            int count=7;
	            for(String s:str){
	            
	            	aRow.createCell(c++).setCellValue(s);
	            
	            count++;
	            }
	            String sc[]=eto.getCourse();
	            for(String s:sc){
	            	 aRow.createCell(c++).setCellValue(s);
	            }
	            
	            aRow.createCell(c++).setCellValue(eto.getDate());
	            
	        }
	*/    
 
  
		 
	}
	
	
	@RequestMapping(value="/searcyByDate.nr")
	public String searchByDate(@ModelAttribute("EF")EnquiryForm ef,Errors er,HttpServletRequest req){
		hwrk=new HSSFWorkbook();
		 sheet=hwrk.createSheet("enquiry");
		 int row=0;
		 int col=0;
		 
		 
		
		HttpSession ses=req.getSession();
		System.out.println("LoginController->searchByDate()");
		 String date=ef.getDate();
		 System.out.println("LoginCOntroller-date"+date);
		   tnor=es.getnofrecords(date);
		    
		 System.out.println("the no of records are"+ tnor);
		 
		 List<EnquiryFormTo> li=es.searchByDateform(date,start,tor);
		 
		 
		 for(EnquiryFormTo et:li){
			 System.out.println(et);
		 }
		 
		 if(li!=null){

			    if(tnor<1){
				 req.setAttribute("NOT_FOUND", "not found");
			 }else{
				 end=tnor;
				  if(end>tor){
				end=tor;	  
				   
				 ses.setAttribute("LED", li);
				 ses.setAttribute("BEGIN", start+1);
				 ses.setAttribute("END", end);
				 ses.setAttribute("TNOR", tnor);
				 if(tnor>end){
					 req.setAttribute("SHOW_NEXT", "OK");
				 }
			 }
				  return "SEARCDAT";
			 }
			 
			 
		 }else{
			 req.setAttribute("EMPTY", "no records");
			 return "ERRORDEF";
		 }
		 
		 
		 return "ERRORDEF";
		  
		 
//		 req.setAttribute("LED", li);
		    
		
	}
	
	  @RequestMapping(value="/shownewdate.nr")
	  public String showNextDate(@ModelAttribute("EF")EnquiryForm ef,Errors e,HttpServletRequest req){
		  System.out.println("Login controller->showNextDate");
		  HttpSession ses=req.getSession();
		  String date=ef.getDate();
System.out.println("================================");
System.out.println("LoginCOntroller->showNextDate()"+date);
System.out.println("================================");
		  Integer i=(Integer)ses.getAttribute("END");
		  start=i.intValue();
		  System.out.println(start);
		  tnor=es.getnofrecords(date);
		  System.out.println("LoginController->showNextDate()"+tnor);
		  List<EnquiryFormTo> li= es.searchByDateform(date, start, tor);
		  if(tnor<1){
			  req.setAttribute("NOT_FOUND", "not found");
		  }else{
			  end=start+tor;
			  System.out.println("end value"+end);
			  if(end>tnor){
				  end=tnor;
			  }
			  ses.setAttribute("LED", li);
				 ses.setAttribute("BEGIN", start+1);
				 ses.setAttribute("END", end);
				 ses.setAttribute("TNOR", tnor);
				 setNextPrevious(req);
		  }
		  return "SEARCDAT";
	  }
	
	
	  
	  @RequestMapping(value="/showprevdate.nr")
	  public String showPrevDate(@ModelAttribute("EF")EnquiryForm ef,Errors er,HttpServletRequest req){
		  System.out.println("LoginController->showNextDate()");
		  HttpSession ses=req.getSession();
		  String date=ef.getDate();
		  Integer i=(Integer)ses.getAttribute("BEGIN");
		  start=i.intValue()-tor-1;
		  if(start<0){
			  req.setAttribute("NOT_FOUND", "not found");  
		  }
		  System.out.println("========================================================");
		  System.out.println("LoginController->show PrevDate()->start"+start);
		  System.out.println("========================================================");
		  tnor=es.getnofrecords(date);
		  System.out.println("========================================================");
		  System.out.println("LoginController->show PrevDate()->tnor"+tnor);
		  System.out.println("========================================================");
		  
		  List<EnquiryFormTo> li=es.searchByDateform(date, start, tor);
		  if(tnor<1){
			  req.setAttribute("NOT_FOUND", "not found");
		  }else{
			  System.out.println("========================================================");
			  System.out.println("LoginController->show PrevDate()->end"+end);
			  System.out.println("========================================================");
			  end=start+tor;
			  if(end>tnor){
				  end=tnor;
			  }
		  }
		  ses.setAttribute("LED", li);
			 ses.setAttribute("BEGIN", start+1);
			 ses.setAttribute("END", end);
			 ses.setAttribute("TNOR", tnor);
			 setNextPrevious(req);
		  
		  return "SEARCDAT";
	  }
	
	  
	  private void setNextPrevious(HttpServletRequest req){
		  if(start+1>5){
			  req.setAttribute("SHOW_PREVIOUS", "ok");
		  }
		  if(end<tnor){
			  req.setAttribute("SHOW_NEXT", "ok");
		  }
	  }
	  
	  
	@RequestMapping(value="/director/ceo.nr")
	public String secureCeohome(Map<String,Object> map){
		System.out.println("LoginController->secureStaffhome");
		Ceo c=new Ceo();
		map.put("CEE", c);
		return "CEODEF";
		
		
		
	}
	
	@RequestMapping(value="/login.nr")
	public String userlogin(Map<String,Object> m){
		System.out.println("loginController->userlogin");
		User u=new User();
		m.put("USR", u);
		return "USRDEF";
	}
	
	@RequestMapping(value="/logcheck.nr")
	public String userlogincheck(@ModelAttribute("USR")User u,Errors e,HttpSession ses){
		
		//usrv.validate(u, e);
		if(e.hasErrors()){
			return "USRDEF";
		}
		System.out.println("Logincont->userlogincheck");
		User us=usrserv.verifyName(u.getUname());
		if(us==null){
			return "ERRORDEF"; 	
		}
		
		
		System.out.println(us.getUname()+"\t"+us.getUid()+"\t"+us.getRole());
		ses.setAttribute("UNAME", us.getUname());
		 ses.setAttribute("UID", us.getUid());
		 ses.setAttribute("ROLE", us.getRole());
		ses.setAttribute("USRN", us.getUname());
		ses.setAttribute("RL", us.getRole());
		return "USRDEF2";
		
	}
	
	
	@RequestMapping(value="/forgotpass.nr")
	public String forgotpwd(Map m){
		System.out.println("forgot password");
		User u=new User();
		m.put("USR", u);
		return "USRDEF3";
		
		
	}
	
	@RequestMapping(value="/fortpwd.nr")
	public String forgotform(@ModelAttribute("USR")User u,Errors e,HttpServletRequest req){
		System.out.println("Login contoller=>forgot password");
		UserTO ut=new UserTO(u.getUname(),u.getPwd(),u.getRpwd(),u.getUemail(),u.getUmbl(),u.getRole());
		
		ut=usrserv.forgpwd(ut);
		if(ut!=null){
			String email=ut.getUemail();
			String pwd=ut.getPwd();
			String from="prakashnrng@gmail.com";
			ufm.sendMail(from,email,"hi prakash nr", "ur password is"+"\t"+pwd);
			
			return "USRDEF4";
		}else{
			return "USRDEF5";
		}
		
		
	}
	
	 @RequestMapping(value="/userform.nr")
	public String userloginform(@ModelAttribute("USR")User u,Errors e,HttpSession ses){
		 String nm=u.getUname();
		 String p=u.getPwd();
		//usrv.validate(u, e);
		
		
		
		if(e.hasErrors()){
			return "USRDEF";
		}
		System.out.println("logncontroler->usrlognform");
		System.out.println(u);
		UserTO uto;
		if(u.getUname()!=null&&u.getPwd()!=null&&u.getRole()!=null){
uto=usrserv.verifyUser(u.getUname(), u.getPwd(),u.getRole());
		}else{
			return "ERRORDEF"; 	
		}
System.out.println("================================"+uto);
if(uto==null){
	return "ERRORDEF"; 	
}
System.out.println("uto---verifyuser"+uto);
 if(uto!=null){
	String unm=uto.getUname();
	String pw=uto.getPwd();
	System.out.println(unm+"\t"+pw);
	
	if(!(nm.equals(unm))&&!(p.equals(pw))){
		
		return "ERRORDEF"; 
		}  
	 }	 	
if(uto!=null){
	ses.setAttribute("error","invalid user");
	ses.setAttribute("message","hi......");
	ses.setAttribute("UNAME", uto.getUname());
	 ses.setAttribute("UID", uto.getUid());
	 ses.setAttribute("ROLE", uto.getRole());
	 ses.setAttribute("LOGSESU", uto);
	 
	return "SUCDEF";
	} 
return "ERRORDEF";
	}
 
	  
	 @RequestMapping(value="/newuser.nr")
	 public String newuser(Map m,HttpSession ses){
		 
		 System.out.println("Login=>new user");
		  User u=new User();
		  m.put("US", u);
		  return "NEWUDEF";
	 }
	 
	 @RequestMapping(value="/newuform.nr")
	 public String newuserform(@ModelAttribute("US")User u,Errors er,HttpSession ses){
		 UserTO uto=null;
		 
		 System.out.println("logincontroler->newuserform");
		 //UserTO uto=new UserTO(u.getUname(), u.getPwd(),u.getRole());
		 
		 usrv.validate(u, er);
		 
		 

			String cpw=u.getRpwd();
			System.out.println("================"+cpw+"================");
			String pw1=u.getPwd();
			System.out.println("================"+pw1+"================");
			  if(!cpw.equals(pw1)&&cpw.length()==pw1.length()){
				System.out.println("confirm pasword not equal");
				ses.setAttribute("CPWD", "pwd not");
				   return "NEWUDEF";
				//er.rejectValue("rpwd","errors.pwd.required",new Object[]{},"confirm password not equal");
			} 
		 ses.setAttribute("CPWD", null);
		 
		 UserTO uut=new UserTO(u.getUname(),u.getPwd(),u.getRpwd(), u.getUemail(),u.getUmbl(),u.getRole());
		 String un=u.getUname();
		 boolean b=false;
		 System.out.println("Logincontroller->"+uut);
		  
		   uto=usrserv.verifyUsername(uut);
		   if(uto!=null){
		   String nm=uto.getUname();
		   if(un.equals(nm)){
				   
				  ses.setAttribute("UNR", "already registered");
				   return "NEWUDEF";
				   		  
			  }
		   ses.setAttribute("UNR", null);
		   /*if(ses!=null){
		   ses.invalidate();
		   }*/
		   ses.setAttribute("UNR", null);
		   }else{
				 
			   uto=usrserv.verifyemail(uut);
			   if(uto!=null){
			   String em=u.getUemail();
			   String em1=uto.getUemail();
			   if(em.equals(em1)){
				   ses.setAttribute("EML", "email registered");
				   return "NEWUDEF";
			   }
			   ses.setAttribute("EML", null);
			   /*if(ses!=null){
			   ses.invalidate();
			   }*/
			   }else{
				   b=usrserv.addUser(uut); 
				   return "NEWFDEF";	 
			   }
			   
			   /*if(ses!=null){
			   ses.invalidate();
			   }*/
		   }
			   return "NULLDEF";  
		   
			 //return "NULLDEF"; 
		  
		 //return "NULLDEF";  
			 
		/* if(b==true){
			 
		 } else{			 
			 ses.setAttribute("PWD", "not equal");
			 return "NEWUDEF";
		 }*/
		 
		    //return "NEWUDEF";
	  
	 
	 }
		   

	  
	 @RequestMapping(value="/logouses.nr")
	 public String logoutform(Map m,HttpServletRequest req){
		 System.out.println("logincontroller->logout");
		 HttpSession ses=req.getSession();
		  
		  User u=new User();
		  m.put("USR", u);
		 if(ses!=null){
			 
			 ses.invalidate();
		 }
		 req.setAttribute("message", "sucessfully logedout");
		 return "USRDEF1";
	 }
	
	 
	 @RequestMapping(value="/regform.nr")
	 public String registerform(Map m,HttpServletRequest req){
		 System.out.println("Login Controller->register form");
		 Registration r=new Registration();
		 m.put("RF", r);
		 return "RFMDEF1";
	 }
	 
	 
	 @RequestMapping(value="/regfrm.nr")
	 public String regform(@ModelAttribute("RF")Registration reg,Errors e,HttpServletRequest req){
		 System.out.println("Login COntroller->regform");
		 
		 registrationValidate.validate(reg, e);
		 if(e.hasErrors()){
			 return "RFMDEF1"; 
		 }else{
			 
		 
			 
			// Education ed=new Education(reg.getRedu().getGrade(),reg.getRedu().getClgnme(),reg.getRedu().getYop(),reg.getRedu().getPc());
			 
		 System.out.println(reg);
		 RegistrationTo registrationTo=new RegistrationTo(reg.getRasname(),reg.getRdob(),reg.getRgender(),reg.getRbg(),reg.getRmbl(),reg.getRemial(),reg.getRquali(),reg.getRstate(),reg.getRfname(),reg.getRfoc(),reg.getRmname(),reg.getRmoc(),reg.getRpmad(),reg.getRpcnno(),reg.getRpaddr(),reg.getRdate());
		 registrationTo.setRedu(reg.getRedu());
	  registrationTo.setCurs(reg.getCurs());
		 registrationTo.setOrf(reg.getOrf()); 
		 		System.out.println(registrationTo); 
		 String i=registrationService.addRegistration(registrationTo);
		 System.out.println("Login controller->successfully saved");
		 if(i!=null){
			 return "RFMDEF2";	 
		 }else{
			 return "ERRORDEF";
		 }
		 
		 }
	 }
	 
	 
  @RequestMapping(value="showregister.nr")
	 public String showRegister(Map m,HttpServletRequest req){
		 System.out.println("LoginController->showRegister");
		 Registration registration=new Registration();
		 m.put("REGF", registration);
		 HttpSession ses=req.getSession();
		  ses.setAttribute("EDIT", "false");
		// registrationService.addRegistration(reg)
		 return "RFMDEF3";
		 
	 } 
  
 @RequestMapping(value="showbyidregister.nr")
   public String showByIdRegisterForm(@ModelAttribute("REGF")Registration m,Errors e,HttpServletRequest req){
	  
	 String id=m.getId();
	  System.out.println("LoginController->showByIdRegisterForm");
	  
	  RegistrationTo rto=registrationService.showRegistrationById(id);
	  
	  if(rto!=null){
	  Education education=rto.getRedu();
	  System.out.println(education);
	  //List<String> grade=education.getGrade();
	  
	//  System.out.println(education);
	  Office office=rto.getOrf();
	  System.out.println(office);
	  RCourse rcourse=rto.getCurs();
	  System.out.println(rcourse);
//	  System.out.println(rto);
	  HttpSession ses=req.getSession();
	  
	  
	  ses.setAttribute("RFORM", rto);
	  ses.setAttribute("EDUCATION", education);
	   
	  ses.setAttribute("OFFICE", office);
	  ses.setAttribute("RCOURSE", rcourse);
	  
	  return "RFMDEF4";
	  }else{
		  return "ERRORDEF";  
	  }
  } 
  @RequestMapping(value="registeredit.nr")
  public String registerEdit(Map m,HttpServletRequest req){
	  System.out.println("LoginController->registerEdiform");
	  
	  Registration reg=new Registration();
	  m.put("REGF", reg);
	  
	  HttpSession ses=req.getSession();
	  ses.setAttribute("EDIT", "true");
	  return "RFMDEF4";
	  
	  
  }
	 
  
    @RequestMapping(value="registerformedit.nr")
  public String registerEditForm(@ModelAttribute()Registration reg,Errors e,HttpServletRequest req){
	  System.out.println("LoginCOntroller->registerEditForm");
	  RegistrationTo registrationTo=new RegistrationTo(reg.getId(),reg.getRasname(),reg.getRdob(),reg.getRgender(),reg.getRbg(),reg.getRmbl(),reg.getRemial(),reg.getRquali(),reg.getRstate(),reg.getRfname(),reg.getRfoc(),reg.getRmname(),reg.getRmoc(),reg.getRpmad(),reg.getRpcnno(),reg.getRpaddr(),reg.getRdate());
	  registrationTo.setRedu(reg.getRedu());
	  registrationTo.setCurs(reg.getCurs());
	  registrationTo.setOrf(reg.getOrf()); 
	  registrationService.editRegistration(registrationTo);
	  System.out.println("LoginController->registerEditForm(succesfulyy upated)");
	  return "RFMDEF5";
  } 
 
  //changes made by prakash in vishnu workspace
    
    //changes made again and again
    //changes made      aginag dlkfjsssssssssssssa
}

	
 

