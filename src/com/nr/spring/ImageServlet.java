package com.nr.spring;

import java.io.BufferedOutputStream;
import java.sql.Blob;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nr.staff.Staff;

public class ImageServlet extends HttpServlet{
	public ImageServlet() {
		 
	}

	public void doGet(HttpServletRequest req,HttpServletResponse res){
		try{
		Staff sf=(Staff)req.getSession().getAttribute("STAFF");
		Blob b=(Blob)sf.getImage();
		res.setContentType(sf.getContenttype());
		BufferedOutputStream bos=new BufferedOutputStream(res.getOutputStream());
		bos.write(b.getBytes(1,(int)b.length()));
		bos.flush();
		bos.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
