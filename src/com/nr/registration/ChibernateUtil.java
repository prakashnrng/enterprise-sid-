package com.nr.registration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ChibernateUtil {

	static SessionFactory sf=null;
	
	static{
		Configuration cfg=new Configuration();
		cfg=cfg.configure();
		sf=cfg.buildSessionFactory();
	}
	
	
	public static SessionFactory getSessionFactory(){
		return sf;
	}
}
