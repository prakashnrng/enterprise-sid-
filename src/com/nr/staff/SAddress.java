package com.nr.staff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


public class SAddress {

	
	int siad;
	
	String city;
	
	String state;
	
	String town;

	String doorno;
	
	long pincode;
	
	String saloc;
	 
	 
	Staff staff;
	 
	public SAddress() {
	System.out.println("D.C");
	}
	public SAddress(int siad, String city, String state, String town,
			String doorno, long pincode,String saloc) {
		super();
		this.siad = siad;
		this.city = city;
		this.state = state;
		this.town = town;
		this.doorno = doorno;
		this.pincode = pincode;
		this.saloc=saloc;
	}
	
	public SAddress(String city, String state, String town, String doorno,
			long pincode,String saloc) {
		super();
		this.city = city;
		this.state = state;
		this.town = town;
		this.doorno = doorno;
		this.pincode = pincode;
		this.saloc=saloc;
	}
	
	
	public int getSiad() {
		return siad;
	}
	public void setSiad(int siad) {
		this.siad = siad;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	
	
	public String getSaloc() {
		return saloc;
	}
	public void setSaloc(String saloc) {
		this.saloc = saloc;
	}
	
	
	
	
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	@Override
	public String toString() {
		return "SAddress [siad=" + siad + ", city=" + city + ", state=" + state
				+ ", town=" + town + ", doorno=" + doorno + ", pincode="
				+ pincode + ", saloc=" + saloc + "]";
	}
	 
	
	
	
	
	
	
}
