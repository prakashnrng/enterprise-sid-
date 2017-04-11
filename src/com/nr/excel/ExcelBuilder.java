package com.nr.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.nr.enquiry.EnquiryFormTo;

 

public class ExcelBuilder extends AbstractExcelView {

	@Autowired
	ExcelName en;
	 
	public  void  buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook hwrk, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		  
		 
		 
	 List<EnquiryFormTo> list  = (List<EnquiryFormTo>) model.get("EF");
	 
	 
	 FileInputStream file = new FileInputStream(new      
			    File("D:\\prakash\\siddb1\\siddhransnew\\WebRoot\\WEB-INF\\pages\\excel.xlsx"));
	 XSSFWorkbook wb=new XSSFWorkbook(file);
	 //HSSFWorkbook wb=new HSSFWorkbook(file);
	 XSSFSheet sht=wb.getSheetAt(0);
	 XSSFRow h=sht.createRow(0);
	 XSSFCellStyle style1=wb.createCellStyle();
	 style1.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
	 //CellStyle style1 = hwrk.createCellStyle();
	 h.createCell(0).setCellValue(en.getExeid());
		 h.getCell(0).setCellStyle(style1);
		h.createCell(1).setCellValue(en.getExname());
		 h.getCell(1).setCellStyle(style1);
		 sht.setColumnWidth(1, 10000);
		h.createCell(2).setCellValue(en.getExmbl());
		h.getCell(2).setCellStyle(style1);
		sht.setColumnWidth(2, 10000);
		h.createCell(3).setCellValue(en.getExgender());
		h.getCell(3).setCellStyle(style1);
		 
		h.createCell(4).setCellValue(en.getExemail());
		h.getCell(4).setCellStyle(style1);
		sht.setColumnWidth(4, 10000);
		h.createCell(5).setCellValue(en.getExquali());
		h.getCell(5).setCellStyle(style1);
		h.createCell(6).setCellValue(en.getExstate());
		h.getCell(6).setCellStyle(style1);
		sht.setColumnWidth(6, 10000);
		h.createCell(7).setCellValue(en.getExknow());
		h.getCell(7).setCellStyle(style1);	
		sht.setColumnWidth(7, 10000);
		h.createCell(8).setCellValue(en.getExcourse());
    	h.getCell(8).setCellStyle(style1);
    	sht.setColumnWidth(8, 10000);
    	h.createCell(9).setCellValue(en.getExdate());
    	h.getCell(9).setCellStyle(style1);
       
		 int rowCount1 = 1;
         int c1=0;
		
		
		for (EnquiryFormTo eto1 : list) {
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
		
		FileOutputStream fos=new FileOutputStream("D:\\prakash\\siddb1\\siddhransnew\\WebRoot\\WEB-INF\\pages\\excel.xlsx");
		wb.write(fos);
		
		
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
        fos.close();
		file.close();
		
		/*Files file = this.filesService.find(id);

        response.setContentType(file.getType());
        response.setContentLength(file.getFile().length);
        response.setHeader("Content-Disposition","attachment; filename=\"" + file.getFilename() +"\"");

        FileCopyUtils.copy(file.getFile(), response.getOutputStream());

		
		
		*/
		
	/*	
	 
		// EnquiryFormTo list=(EnquiryFormTo)model.get("eeto");
	 HSSFSheet sheet=hwrk.createSheet("excel");
	 sheet.setDefaultColumnWidth(3000);
	 CellStyle style = hwrk.createCellStyle();
     Font font = hwrk.createFont();
     font.setFontName("Arial");
     style.setFillForegroundColor(HSSFColor.BLUE.index);
     style.setFillPattern(CellStyle.SOLID_FOREGROUND);
     font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
     font.setColor(HSSFColor.WHITE.index);
     style.setFont(font);
      
        // create a new Excel sheet
		 HSSFRow header = sheet.createRow(0);
			header.createCell(0).setCellValue("ID");
			header.getCell(0).setCellStyle(style);
			header.createCell(1).setCellValue("NAME");
			header.getCell(1).setCellStyle(style);
			header.createCell(2).setCellValue("MBLNO");
			header.getCell(2).setCellStyle(style);
			header.createCell(3).setCellValue("GENDER");
			header.getCell(3).setCellStyle(style);
			 
			header.createCell(4).setCellValue("EMAIL");
			header.getCell(4).setCellStyle(style);
			header.createCell(5).setCellValue("QUALI");
			header.getCell(5).setCellStyle(style);
			header.createCell(6).setCellValue("state");
			header.getCell(6).setCellStyle(style);
					header.createCell(7).setCellValue("KNOW");
					header.getCell(7).setCellStyle(style);
			header.createCell(8).setCellValue("course");
			header.getCell(8).setCellStyle(style);
			header.createCell(9).setCellValue("date");
			header.getCell(9).setCellStyle(style);
			
			int rowNum = 1;
			 
		 
		  
		 
      
	        // create a new Excel sheet
	          sheet = hwrk.createSheet("Java Books");
	        sheet.setDefaultColumnWidth(30);
	         
	        // create style for header cells
	       
	       
	        
	        // create data rows
	        int rowCount = 1;
	         int c=0;
	         
	        for (EnquiryFormTo eto : list) {
	            HSSFRow aRow = sheet.createRow(rowCount++);
	            aRow.createCell(0).setCellValue(eto.getId());
	            aRow.createCell(1).setCellValue(eto.getName() );
	            aRow.createCell(2).setCellValue(eto.getMblno());
	           aRow.createCell(3).setCellValue(eto.getGender());
	            aRow.createCell(4).setCellValue(eto.getEmail());
	            aRow.createCell(5).setCellValue(eto.getQuali());
	            aRow.createCell(6).setCellValue(eto.getState()); 
	            String str[]=eto.getKnow();
	            int count=7;
	            for(String s:str){
	            
	            	aRow.createCell(count).setCellValue(s);
	            
	           // count++;
	            }
	            count++;
	            String sc[]=eto.getCourse();
	            for(String s:sc){
	            	 aRow.createCell(count).setCellValue(s);
	            }
	            count++;
	            aRow.createCell(count).setCellValue(eto.getDate());
	            
	*/
	        
	}

}

