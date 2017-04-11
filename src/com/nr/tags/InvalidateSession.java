package com.nr.tags;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class InvalidateSession extends TagSupport {
	
	
	private String info;
	
	public void setInfo(String info){
		this.info=info;
		
	}

	
	public int doEndTag()throws JspException{
		HttpSession ses=pageContext.getSession();
	ses.removeAttribute(info);
	return super.doEndTag();
		}
	
}
