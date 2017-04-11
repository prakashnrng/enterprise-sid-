package com.nr.enquiry.contact;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.nr.enquiry.EnquiryForm;
import com.nr.enquiry.EnquiryFormTo;

public class EnquiryHibernateContact implements EnquiryContact{
	
	@Autowired
	HibernateTemplate htmp;
	
	@Autowired 
	SessionFactory sf;
	
	
	/*@Autowired
	 Criterion cri;
	
	 
	Session ses;
 Query q;
	Criteria ct;*/
	
	@Override
	public int addcontactDAO(EnquiryFormTo ef) {
	
		String kn[]=ef.getKnow();
		String co[]=ef.getCourse();
		//EnquiryForm eft=new EnquiryForm(ef.getName(), ef.getDob(), ef.getMblno(), ef.getGender(), ef.getEmail(), ef.getQuali(), ef.getState(), kn,co,ef.getDate());
		//EnquiryForm eft=new EnquiryForm(ef.getName(), ef.getDob(), ef.getMblno(), ef.getGender(), ef.getEmail(), ef.getQuali(), ef.getState(), kn,co,ef.getAddress(),ef.getDate(),ef.getSemester());
		EnquiryForm eft=new EnquiryForm(ef.getName(),ef.getDob(),ef.getMblno(),ef.getGender(),ef.getEmail(),ef.getQuali(),ef.getState(),ef.getKnow(),ef.getCourse(),ef.getDate(),ef.getAddress(),ef.getCollegeName(),ef.getSemester());
		System.out.println(eft);
		Integer ii=(Integer)htmp.save(eft);
		System.out.println("successfully saved");
		int i=ii.intValue();
		System.out.println(i);
		return i;
	}
	
	
	
	public List<EnquiryFormTo> search(){
		
		System.out.println("EnquiryHibernateContactsearch");
		String query="from EnquiryForm";
		List<EnquiryForm> l=htmp.find(query);
		List<EnquiryFormTo> lto=new ArrayList<EnquiryFormTo>();
		 for(EnquiryForm ef:l){
			 EnquiryFormTo eft=new EnquiryFormTo(ef.getName(),ef.getDob(),ef.getMblno(),ef.getGender(),ef.getEmail(),ef.getQuali(),ef.getState(),ef.getKnow(),ef.getCourse(),ef.getDate(),ef.getAddress(),ef.getCollegeName(),ef.getSemester());
			 //EnquiryFormTo eto=new EnquiryFormTo(o.getId(),o.getName(),o.getDob(),o.getMblno(),o.getGender(),o.getEmail(),o.getQuali(),o.getState(),o.getKnow(),o.getCourse(),o.getDate());
			  
			  lto.add(eft);
		} 
		return lto;
		
	}
	
	
	@Override
	public EnquiryForm searchById(int id) {
	 System.out.println("EnquiryHibernateContact->searchbyId");
	 EnquiryForm e=null;
			 String query="from EnquiryForm ef where ef.id=?";
			    List l=(List)htmp.find(query,id);
			    for(Object eef:l){
			    	  e=(EnquiryForm)eef;
			    	  System.out.println("-----------------------------------------");
			    	  System.out.println(e);
			    	  System.out.println("-----------------------------------------");
			    }
				return e;
	}
	
	
	@Override
	public void updateEnquiryForm(EnquiryFormTo ef) {
	 System.out.println("EnquiryHibernateContact->updateENquiryForm");
	 EnquiryForm eef=new EnquiryForm(ef.getId(),ef.getName(),ef.getDob(),ef.getMblno(),ef.getGender(),ef.getEmail(),ef.getQuali(),ef.getState(),ef.getKnow(),ef.getCourse(),ef.getDate(),ef.getAddress(),ef.getCollegeName(),ef.getSemester());
	// EnquiryForm eef=new EnquiryForm(to.getId(),to.getName(),to.getDob(),to.getMblno(),to.getGender(),to.getEmail(),to.getQuali(),to.getState(),to.getKnow(),to.getCourse(),to.getDate());
	 htmp.update(eef);
	 System.out.println("successfully updated");
			 
			 
		
	}
	
	
	public int getnofrecords(String date){
		
		System.out.println("EnquiryHibernateContact->getnof records");
		
		String query="from EnquiryForm where date=?";
		List<EnquiryForm> i=htmp.find(query,date);
		System.out.println("ENquiryHibernateContactDAO->getNooFRecord(date)"+i.size());
		return i.size();
			
		
		
	}
	 
	 
	
	
	
	
	 public  List<EnquiryFormTo> searchByDateform(String date,int start,int tor){
		 System.out.println("EnquiryHibernateContact->searchByDate");
		 
	//EnquiryForm ef=new EnquiryForm(date);
		 
		 System.out.println("the enquirty hibernate dao "+date);
		 System.out.println("Enquiry HibernaeContactDAO=>(start,tor)"+start+"\t"+tor);
		  String query="from EnquiryForm eq where eq.date=? ";
		  
		 // sf.openSession().createCriteria(EnquiryForm.class);
		  
		  
		//List<EnquiryForm> li=htmp.find(query,date,start,tor);
	
		 
		  List<EnquiryForm> li=sf.openSession().createCriteria(EnquiryForm.class).add(Expression.eq("date", date)).setFirstResult(start).setMaxResults(tor).list();
		   //List<EnquiryForm> li=sf.openSession().createCrite ria(EnquiryForm.class).add(Expression.eq("date", date)).setFirstResult(start).setMaxResults(tor).list();
		  
		  
		  //("date", date));
		  /*ct=ses.createCriteria(EnquiryForm.class);
		  ct=ct.add(Expression.
		  ct=ct.setFirstResult(start);
		  ct=ct.setFirstResult(tor);*/
		  
		 /* q=ses.createQuery(query);
		  q=q.setString(0, date);
		  q=q.setFirstResult(start);
		  q=q.setMaxResults(tor);
		  */
		//  List<EnquiryForm> li=q.list();
		  
		  
		  
		  
		  
		 List<EnquiryFormTo> lto=new ArrayList<EnquiryFormTo>();
		for(EnquiryForm ef:li){
			EnquiryFormTo eft=new EnquiryFormTo(ef.getId(),ef.getName(),ef.getDob(),ef.getMblno(),ef.getGender(),ef.getEmail(),ef.getQuali(),ef.getState(),ef.getKnow(),ef.getCourse(),ef.getDate(),ef.getAddress(),ef.getCollegeName(),ef.getSemester());
			//EnquiryFormTo eeff=new EnquiryFormTo(ef.getId(),ef.getName(),ef.getDob(),ef.getMblno(),ef.getGender(),ef.getEmail(),ef.getQuali(),ef.getState(),ef.getKnow(),ef.getCourse(),ef.getDate());
		lto.add(eft);
		}
		 return lto;
		 
	 }


	 
}
