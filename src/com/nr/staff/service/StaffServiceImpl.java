package com.nr.staff.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nr.staff.StaffTo;
import com.nr.staff.dao.StaffDao;

public class StaffServiceImpl implements StaffService{
	
	@Autowired
	StaffDao sdao;
	
	@Override
	public void addStaffService(StaffTo sto) {
	 
		sdao.addStaffService(sto);
	}
	
	@Override
	public StaffTo searchStaffService(int id) {
	 
		return  sdao.searchStaffService(id);
	}

	
	@Override
	public void updateStaff(StaffTo sto) {
	 
		sdao.updateStaff(sto);
	}
	
}
