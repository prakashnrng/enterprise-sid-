package com.nr.staff.service;

import com.nr.staff.StaffTo;

public interface StaffService {
	
	public void addStaffService(StaffTo sto);	
	
	public StaffTo searchStaffService(int id);
	
	public void updateStaff(StaffTo sto);
}
