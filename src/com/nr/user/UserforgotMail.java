package com.nr.user;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class UserforgotMail {
	 
	@Autowired
	    JavaMailSender mail;
	   
	public void sendMail(String from,String to, String subject, String msg) {  
        //creating message  
        SimpleMailMessage message = new SimpleMailMessage();  
        
        MimeMessage ms=mail.createMimeMessage();
        
        try{
        	
        	MimeMessageHelper helper=new MimeMessageHelper(ms,true);
        	helper.setFrom(from);
        	helper.setTo(to);
        	helper.setSubject(subject);
        	helper.setText(msg,true);
        	
        	
        }catch (Exception e) {
 e.printStackTrace();
		}
        
        mail.send(ms);
        /*
        //message.setFrom(from);  
        message.setTo(to);  
        message.setSubject(subject);  
        message.setText(msg);  
        //sending message  
        mail.send(message);*/     
    }  
	
	  
}
