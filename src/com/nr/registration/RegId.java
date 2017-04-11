package com.nr.registration;

import java.io.Serializable;
import java.util.List;

 

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class RegId implements IdentifierGenerator{
	
	 @Autowired
	 HibernateTemplate htemp;
	 
	 @Autowired
	 SessionFactory sf;
	 
	 public Serializable   generate(SessionImplementor si,Object obj)throws HibernateException{
		 
		 String sid="SIDD-B001";
			try{
				Configuration cfg=new Configuration().configure();
				SessionFactory sf=cfg.buildSessionFactory();
				Session ses=sf.openSession();
				Transaction tx=ses.beginTransaction();
				
				  			 
				 
		 
		  
			 
		  
				
				Query q=ses.createQuery("from Registration");
				int size=q.list().size();
				 
				
				//String query="from Registration";
				//List li=htemp.find(query);
				//q1.list().size();
				//int size=li.size();
				System.out.println(size);
				if(size!=0){
					//String query1="select max(reg.id) from Registration reg";
							//List<Registration> list=htemp.find(query1);
					Query query=ses.createQuery("select max(reg.id) from Registration reg");
					List list=query.list();
					System.out.println(list.size());
					Object o=list.get(0);
					System.out.println(o);
					String id="";
					id=o.toString();
					String p2=id.substring(7);
					int x=Integer.parseInt(p2);
					x=x+1;
					if(x<=9){
						sid="SIDD-B00"+x;
					}else if(x<=99){
						sid="SIDD-B0"+x;
					}else if(x<=999){
						sid="SIDD-B"+x;
					}
					}
				
				
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
			return sid;
		} 
	 	 
		 

}
