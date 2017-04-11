package com.nr.registration;

public class Office {
	
	int ofid;
	String ocouncil;
	String oinstal;
	String ospoffr;
	String oBatcno; 
	String ostarDate;
	String otiming;
	Registration oreg;
	
	public Office() {
	 System.out.println("office->D.C");
	}

	public Office(int ofid, String ocouncil, String oinstal, String ospoffr,
			String oBatcno, String ostarDate, String otiming) {
		super();
		this.ofid = ofid;
		this.ocouncil = ocouncil;
		this.oinstal = oinstal;
		this.ospoffr = ospoffr;
		this.oBatcno = oBatcno;
		this.ostarDate = ostarDate;
		this.otiming = otiming;
	}

	public Office(String ocouncil, String oinstal, String ospoffr,
			String oBatcno, String ostarDate, String otiming) {
		super();
		this.ocouncil = ocouncil;
		this.oinstal = oinstal;
		this.ospoffr = ospoffr;
		this.oBatcno = oBatcno;
		this.ostarDate = ostarDate;
		this.otiming = otiming;
	}

	public int getOfid() {
		return ofid;
	}

	public void setOfid(int ofid) {
		this.ofid = ofid;
	}

	public String getOcouncil() {
		return ocouncil;
	}

	public void setOcouncil(String ocouncil) {
		this.ocouncil = ocouncil;
	}

	public String getOinstal() {
		return oinstal;
	}

	public void setOinstal(String oinstal) {
		this.oinstal = oinstal;
	}

	public String getOspoffr() {
		return ospoffr;
	}

	public void setOspoffr(String ospoffr) {
		this.ospoffr = ospoffr;
	}

	public String getoBatcno() {
		return oBatcno;
	}

	public void setoBatcno(String oBatcno) {
		this.oBatcno = oBatcno;
	}

	public String getOstarDate() {
		return ostarDate;
	}

	public void setOstarDate(String ostarDate) {
		this.ostarDate = ostarDate;
	}

	public String getOtiming() {
		return otiming;
	}

	public void setOtiming(String otiming) {
		this.otiming = otiming;
	}
	
	
	
	

	public Registration getOreg() {
		return oreg;
	}

	public void setOreg(Registration oreg) {
		this.oreg = oreg;
	}

	@Override
	public String toString() {
		return "Office [ofid=" + ofid + ", ocouncil=" + ocouncil + ", oinstal="
				+ oinstal + ", ospoffr=" + ospoffr + ", oBatcno=" + oBatcno
				+ ", ostarDate=" + ostarDate + ", otiming=" + otiming
				 + "]";
	}

	 
	 
	
	

}
