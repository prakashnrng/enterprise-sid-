package com.nr.enquiry;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import com.nr.enquiry.EnquiryFormTo;
import com.nr.enquiry.service.EnquiryFormService;
import com.nr.enquiry.service.EnquiryService;
import com.nr.staff.Staff;

public class ExcelServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		try{
			/*EnquiryService es=new EnquiryFormService();
			 List<EnquiryFormTo> eeto=es.search();
			*/
			  List<EnquiryFormTo> eeto=(List<EnquiryFormTo>)req.getSession().getAttribute("LIST"); 
			 FileInputStream file = new FileInputStream(new      
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
			
			/*
		            if(scc.startsWith(null)){
		            	scc.trim();
		            }*/
		            
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
		       	/* System.out.println(count1); 
		       	  
		            count1++; */
		            System.out.println(count1); 
		            
		            aRow1.createCell(count1).setCellValue(eto1.getDate());
		            
				
				}
				//res.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
			    res.setHeader("Content-Disposition",
			            "attachment; filename=excel.xlsx");
				
			    ByteArrayOutputStream outByteStream = new ByteArrayOutputStream();
			    wb.write(outByteStream);
			    byte [] outArray = outByteStream.toByteArray();
			    res.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
			  // res.setContentType("application/ms-excel");
			    res.setContentLength(outArray.length);
			    res.setHeader("Expires:", "0"); // eliminates browser caching
			    res.setHeader("Content-Disposition",
			            "attachment; filename=excel.xlsx");
			    //res.setHeader("Content-Disposition", "attachment; filename=testxls.xls");
			        
			    OutputStream outStream = res.getOutputStream();
			    outStream.write(outArray);
			    outStream.flush(); 
				
				FileOutputStream fos=new FileOutputStream("D:\\prakash\\siddb1\\siddhransnew\\WebRoot\\WEB-INF\\pages\\excel.xlsx");
				wb.write(fos);
				
				 
				
				
				
				
				 fos.close();
					file.close();
					
				/*File xls = new File("D:\\prakash\\siddb1\\siddhransnew\\WebRoot\\WEB-INF\\pages\\excel.xlsx"); // or whatever your file is
				FileInputStream in = new FileInputStream(xls);
				OutputStream out = res.getOutputStream();

				byte[] buffer= new byte[8192]; // use bigger if you want
				int length = 0;

				while ((length = in.read(buffer)) > 0){
				     out.write(buffer, 0, length);
				}
				in.close();
				out.close();
				res.setHeader("Content-disposition","attachment; filename=" + "excel");
				
				*/
		       
				/*Files file = this.filesService.find(id);

		        response.setContentType(file.getType());
		        response.setContentLength(file.getFile().length);
		        response.setHeader("Content-Disposition","attachment; filename=\"" + file.getFilename() +"\"");

		        FileCopyUtils.copy(file.getFile(), response.getOutputStream());

				
				
				*/
				
				 		 
		 	
		}catch (Exception e) {
 e.printStackTrace();
		}
		 
	}

}
