package com.nr.tags;

import java.io.Writer;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class SessionValidate extends TagSupport {

	 
	
	@Override
	public int doEndTag() throws JspException {
	 HttpSession ses=pageContext.getSession();
	 if(ses==null){
		 try{
			 HttpServletResponse res=(HttpServletResponse)pageContext.getResponse();
			 Writer out=res.getWriter();
			 out.write("<script");
		 }catch (Exception e) {
			// TODO: handle exception
		}
	 }
		return super.doEndTag();
	}
}
