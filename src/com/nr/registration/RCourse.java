package com.nr.registration;

public class RCourse {

	int couid;
	String cnm;
	double cfee;
	double ctotal;
	Registration creg;
	
	
	public RCourse() {
	 System.out.println("course->D.C");
	}


	public RCourse(int couid, String cnm, double cfee, double ctotal) {
		super();
		this.couid = couid;
		this.cnm = cnm;
		this.cfee = cfee;
		this.ctotal = ctotal;
	 
	}


	public RCourse(String cnm, double cfee, double ctotal) {
		super();
		this.cnm = cnm;
		this.cfee = cfee;
		this.ctotal = ctotal;
		 
	}


	public int getCouid() {
		return couid;
	}


	public void setCouid(int couid) {
		this.couid = couid;
	}


	public String getCnm() {
		return cnm;
	}


	public void setCnm(String cnm) {
		this.cnm = cnm;
	}


	public double getCfee() {
		return cfee;
	}


	public void setCfee(double cfee) {
		this.cfee = cfee;
	}


	public double getCtotal() {
		return ctotal;
	}


	public void setCtotal(double ctotal) {
		this.ctotal = ctotal;
	}


	public Registration getCreg() {
		return creg;
	}


	public void setCreg(Registration creg) {
		this.creg = creg;
	}


	@Override
	public String toString() {
		return "Course [couid=" + couid + ", cnm=" + cnm + ", cfee=" + cfee
				+ ", ctotal=" + ctotal + "]";
	}

	

 
	
}
