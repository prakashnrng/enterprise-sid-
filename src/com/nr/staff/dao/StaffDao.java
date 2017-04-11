package com.nr.staff.dao;

import com.nr.staff.StaffTo;

public interface StaffDao {

	public void addStaffService(StaffTo sto);
	
	public StaffTo searchStaffService(int id);
	
	
	public void updateStaff(StaffTo sto);
}
