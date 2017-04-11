package com.nr.staff;

import java.io.Serializable;
import java.util.List;

 

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class SIDGenerator  implements IdentifierGenerator{
	
	@Override
	public Serializable generate(SessionImplementor si, Object obj)
			throws HibernateException {
		System.out.println("SIDGEnerator");
			String sid="SIDT-001";
			try{
				Configuration cfg=new Configuration();
				cfg=cfg.configure("nrpra-servlet.xml");
				SessionFactory sf=cfg.buildSessionFactory();
				Session ses=sf.openSession();
				
				 Transaction tx=ses.beginTransaction();
				 Query q=ses.createQuery("from Staff sff");
				 int size=q.list().size();
				 System.out.println(size);
				 if(size!=0){
					 Query quy=ses.createQuery("select max(sf.stafid) from Staff sf");
					  List li=quy.list();
					  System.out.println("size:"+li.size());
					  Object o=li.get(0);
					  System.out.println(o);
					  String id="";
					  id=o.toString();
					  String p2=id.substring(2);
					  int x=Integer.parseInt(p2);
					  x=x+1;
					  if(x<=9){
						  sid="SIDT-00"+x;
						  
					  }else if(x<=99){
						  sid="SIDT-0"+x;
					  
							 
							 
				 }else if(x<=999){
					 sid="SIDT-"+x;
				 }}
			}catch (Exception e) {
 e.printStackTrace();
			}
		return sid;
	}

}
