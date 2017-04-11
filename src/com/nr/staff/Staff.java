package com.nr.staff;

import java.sql.Blob;

 

 

public class Staff {

	//performing commit using github and this is my second commit
	
	
	//private SIDGenerator stafid;
	private int stafid;

	private String sfname;
	private String slname;
	private String smbl;
	private String squali;
	private String semail;
	
	private SAddress sadd;
	 
	//private Blob img;
	
/*	private String spraddr;
	private String spaddr;
*/	//private String simage;
	private String slastworkd;
	private Blob image;
	private String contenttype;
	
	
	public Staff() {
	System.out.println("staff->D.C");
	}
	
	
	
	public Staff(int stafid, String sfname, String slname, String smbl,
			String squali, String email,String slastworkd,Blob image,String contenttype) {
		super();
		this.stafid = stafid;
		this.sfname = sfname;
		this.slname = slname;
		this.smbl = smbl;
		this.squali = squali;
		this.semail = email;
		//this.add = sadd;
		this.slastworkd = slastworkd;
		this.image=image;
		this.contenttype=contenttype;
	}


	public Staff(String sfname, String slname, String smbl, String squali,
			String email,String slastworkd,Blob image,String contentype) {
		super();
		this.sfname = sfname;
		this.slname = slname;
		this.smbl = smbl;
		this.squali = squali;
		this.semail = email;
		 
		this.slastworkd = slastworkd;
		this.image=image;
		this.contenttype=contentype;
		
	}


	
	
	
	
 	public Staff(String sfname, String slname, String smbl, String squali,
			String semail, SAddress sadd, String slastworkd,String contenttype) {
		super();
		this.sfname = sfname;
		this.slname = slname;
		this.smbl = smbl;
		this.squali = squali;
		this.semail = semail;
		this.sadd = sadd;
		 this.slastworkd = slastworkd;
		this.contenttype=contenttype;
	}
 	
 	public Staff(int stafid, String sfname, String slname, String smbl,
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



	public Staff(String sfname, String slname, String smbl, String squali,
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
	
	
	
	
	public String getSEmail() {
		return semail;
	}



	public void setSemail(String semail) {
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


	
	

	public String getSemail() {
		return semail;
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
