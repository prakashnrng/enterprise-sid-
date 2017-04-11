package com.nr.staff.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.nr.staff.SAddress;
import com.nr.staff.Staff;
import com.nr.staff.StaffTo;

public class StaffHibernatDao implements StaffDao{
	
	@Autowired
	HibernateTemplate htmp;
	
	@Override
	public void addStaffService(StaffTo sto) {
	 
	System.out.println("StaffHibernate->addStaffservice");
	
	//Staff s=new Staff(sto.getSfname(),sto.getSlname(),sto.getSmbl(),sto.getSquali(),sto.getSemail(),sto.getSadd(),sto.getSlastworkd(),sto.getImage());
	
	
	SAddress sa=new SAddress(sto.getSadd().getCity(), sto.getSadd().getState(),sto.getSadd().getTown(),sto.getSadd().getDoorno(),sto.getSadd().getPincode(),sto.getSadd().getSaloc());
	System.out.println("sthdao->"+sa);
	htmp.save(sa);
	
	Staff s=new Staff(sto.getSfname(),sto.getSlname(),sto.getSmbl(),sto.getSquali(),sto.getSemail(),sto.getSlastworkd(),sto.getImage(),sto.getContenttype());
	s.setSadd(sa);
	htmp.save(s);
	
	System.out.println("--------------------------------------------");
	System.out.println(s);
	System.out.println(s.getSadd().getSiad());
	
	
	System.out.println("successfully saved");
	
	}
	

	public StaffTo searchStaffService(int id){
		System.out.println("StaffHibernate->searchStaffService");
		
		
		
		String query="from Staff sf where stafid=?";
		List li=htmp.find(query,id);
		StaffTo sto=null; 
		for(Object o:li){
			Staff st=(Staff)o;
		sto=new StaffTo(st.getStafid(), st.getSfname(),st.getSlname(),st.getSmbl() ,st.getSquali() , st.getSemail(),st.getSlastworkd() ,st.getImage(),st.getContenttype());
		 //sto=new StaffTo(st.getStafid(),st.getSfname(),st.getSlname(),st.getSmbl() ,st.getSquali(),st.getSemail() ,st.getSadd(),st.getSlastworkd(),st.getImage());
		 
		 
		sto.setSadd(st.getSadd());
		System.out.println(sto);
		System.out.println("------------------------------");
		System.out.println(sto.getSadd());
		
		
		}
		return sto;
			
		
	}
	
	
	@Override
	public void updateStaff(StaffTo st) {
	 System.out.println("StaffHibernate->updateStaff");
	 
	 SAddress sa=new SAddress(st.getSadd().getSiad(),st.getSadd().getCity(), st.getSadd().getState(),st.getSadd().getTown(),st.getSadd().getDoorno(),st.getSadd().getPincode(),st.getSadd().getSaloc());
		System.out.println("sthdao->"+sa);
		htmp.update(sa);
		System.out.println("StaffHibernateDAO->SADDRESS()->successfully updated");
	 
	 
	 Staff staff=null;
		staff=new Staff(st.getStafid(), st.getSfname(),st.getSlname(),st.getSmbl() ,st.getSquali() , st.getSemail(),st.getSlastworkd() ,st.getImage(),st.getContenttype());
		staff.setSadd(sa);
		htmp.update(staff);
		System.out.println("StaffHibernateDAO->Staff()->successfully updated");
		
		
		
	}
	

}
