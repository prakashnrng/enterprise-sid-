package com.nr.staff;

import java.sql.Blob;

public class StaffTo {
	private int stafid;

	private String sfname;
	private String slname;
	private String smbl;
	private String squali;
	private String semail;
	private SAddress sadd;
	
/*	private String spraddr;
	private String spaddr;
*/	//private String simage;
	private String slastworkd;
	private Blob image;
	String contenttype;
	
	public StaffTo() {
	System.out.println("staff->D.C");
	}
	
	
	
	public StaffTo(int stafid, String sfname, String slname, String smbl,
			String squali, String semail, String slastworkd,Blob image,String contenttype) {
		super();
		this.stafid = stafid;
		this.sfname = sfname;
		this.slname = slname;
		this.smbl = smbl;
		this.squali = squali;
		this.semail = semail;
		 this.image=image;
		 this.contenttype=contenttype;
		this.slastworkd = slastworkd;
	}


	public StaffTo(String sfname, String slname, String smbl, String squali,
			String semail, String slastworkd,Blob image,String contenttype) {
		super();
		this.sfname = sfname;
		this.slname = slname;
		this.smbl = smbl;
		this.squali = squali;
		this.semail = semail;
		 
		this.slastworkd = slastworkd;
		this.image=image;
		this.contenttype=contenttype;
	}


	
	
	
	
/*	public Staff(String sfname, String slname, String smbl, String squali,
			String spraddr, String spaddr, String simage, String slastworkd) {
		super();
		this.sfname = sfname;
		this.slname = slname;
		this.smbl = smbl;
		this.squali = squali;
		this.spraddr = spraddr;
		this.spaddr = spaddr;
		this.simage = simage;
		this.slastworkd = slastworkd;
	}
*/
	
	
	
	public StaffTo(String sfname, String slname, String smbl, String squali,
			String semail, SAddress sadd, String slastworkd, Blob image,String contenttype) {
		super();
		this.sfname = sfname;
		this.slname = slname;
		this.smbl = smbl;
		this.squali = squali;
		this.semail = semail;
		this.sadd = sadd;
		this.slastworkd = slastworkd;
		this.image = image;
		this.contenttype=contenttype;
	}

	
	
	
	
	

	public StaffTo(int stafid, String sfname, String slname, String smbl,
			String squali, String semail, SAddress sadd, String slastworkd,
			Blob image,String contenttype) {
		super();
		this.stafid = stafid;
		this.sfname = sfname;
		this.slname = slname;
		this.smbl = smbl;
		this.squali = squali;
		this.semail = semail;
		this.sadd = sadd;
		this.slastworkd = slastworkd;
		this.image = image;
		this.contenttype=contenttype;
	}



	public int getStafid() {
		return stafid;
	}

	
	public void setStafid(int stafid) {
		this.stafid = stafid;
	}

	public String getSfname() {
		return sfname;
	}

	public void setSfname(String sfname) {
		this.sfname = sfname;
	}

	public String getSlname() {
		return slname;
	}

	public void setSlname(String slname) {
		this.slname = slname;
	}

	public String getSmbl() {
		return smbl;
	}

	public void setSmbl(String smbl) {
		this.smbl = smbl;
	}

	public String getSquali() {
		return squali;
	}

	public void setSquali(String squali) {
		this.squali = squali;
	}
	
	
	
	

/*	public String getSpraddr() {
		return spraddr;
	}

	public void setSpraddr(String spraddr) {
		this.spraddr = spraddr;
	}

	public String getSpaddr() {
		return spaddr;
	}

	public void setSpaddr(String spaddr) {
		this.spaddr = spaddr;
	}
*/
	
	
	
	
	public void setSemail(String semail) {
		this.semail = semail;
	}



	public String getSemail() {
		return semail;
	}



	public void setEmail(String semail) {
		this.semail = semail;
	}



	public SAddress getSadd() {
		return sadd;
	}



	public void setSadd(SAddress sadd) {
		this.sadd = sadd;
	}



	/*public String getSimage() {
		return simage;
	}

	public void setSimage(String simage) {
		this.simage = simage;
	}
*/
	public String getSlastworkd() {
		return slastworkd;
	}

	public void setSlastworkd(String slastworkd) {
		this.slastworkd = slastworkd;
	}

		public Blob getImage() {
		return image;
	}



	public void setImage(Blob image) {
		this.image = image;
	}


	
	
	

	public String getContenttype() {
		return contenttype;
	}



	public void setContenttype(String contenttype) {
		this.contenttype = contenttype;
	}



	@Override
	public String toString() {
		return "Staff [stafid=" + stafid + ", sfname=" + sfname + ", slname="
				+ slname + ", smbl=" + smbl + ", squali=" + squali + ", email="
				+ semail + ", sadd=" + sadd + ", slastworkd=" + slastworkd + "]";
	}

	 
	
	
	
	
	
}
