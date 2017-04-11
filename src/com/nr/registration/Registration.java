package com.nr.registration;

import java.util.List;

public class Registration {

	private String id;
	private String rasname;
	private String rdob;
	private String rgender;
	private String rbg;
	private String rmbl;
	private String remial;
	private String rquali;
	private String rstate;
	private String rfname;
	private String rfoc;
	private String rmname;
	private String rmoc;
	private String rpmad;
	private String rpcnno;
	private Education redu;
	private String rpaddr;
	/*private String rgnm;
	private String rgcno;*/
	private String rdate;
 private Office orf;
	 private RCourse curs;
	 
	public Registration() {
	 System.out.println("registration->D.C");
	}


	/* public Registration(String id, String rasname, String rdob, String rgender,
			String rbg, String rmbl, String remial, String rquali,
			String rstate, String rfname, String rfoc, String rmname,
			String rmoc, String rpmad, String rpcnno, 
			String rpaddr, String rdate) {
		super();
		this.id = id;
		this.rasname = rasname;
		this.rdob = rdob;
		this.rgender = rgender;
		this.rbg = rbg;
		this.rmbl = rmbl;
		this.remial = remial;
		this.rquali = rquali;
		this.rstate = rstate;
		this.rfname = rfname;
		this.rfoc = rfoc;
		this.rmname = rmname;
		this.rmoc = rmoc;
		this.rpmad = rpmad;
		this.rpcnno = rpcnno;
		 
		this.rpaddr = rpaddr;
		 
		this.rdate = rdate;
		 
	} */

	
	
	

	public Registration(String rasname, String rdob, String rgender,
			String rbg, String rmbl, String remial, String rquali,
			String rstate, String rfname, String rfoc, String rmname,
			String rmoc, String rpmad, String rpcnno, 
			String rpaddr,  String rdate) {
		super();
		this.rasname = rasname;
		this.rdob = rdob;
		this.rgender = rgender;
		this.rbg = rbg;
		this.rmbl = rmbl;
		this.remial = remial;
		this.rquali = rquali;
		this.rstate = rstate;
		this.rfname = rfname;
		this.rfoc = rfoc;
		this.rmname = rmname;
		this.rmoc = rmoc;
		this.rpmad = rpmad;
		this.rpcnno = rpcnno;
		 
		this.rpaddr = rpaddr;
	 
		this.rdate = rdate;
		 	}

	
	public Registration(String id, String rasname, String rdob, String rgender,
			String rbg, String rmbl, String remial, String rquali,
			String rstate, String rfname, String rfoc, String rmname,
			String rmoc, String rpmad, String rpcnno, String rpaddr,
			String rdate) {
		super();
		this.id = id;
		this.rasname = rasname;
		this.rdob = rdob;
		this.rgender = rgender;
		this.rbg = rbg;
		this.rmbl = rmbl;
		this.remial = remial;
		this.rquali = rquali;
		this.rstate = rstate;
		this.rfname = rfname;
		this.rfoc = rfoc;
		this.rmname = rmname;
		this.rmoc = rmoc;
		this.rpmad = rpmad;
		this.rpcnno = rpcnno;
		this.rpaddr = rpaddr;
		this.rdate = rdate;
	}


	 

	/*public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}*/


	
	
	
	

	public String getRasname() {
		return rasname;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setRasname(String rasname) {
		this.rasname = rasname;
	}


	public String getRdob() {
		return rdob;
	}


	public void setRdob(String rdob) {
		this.rdob = rdob;
	}


	public String getRgender() {
		return rgender;
	}


	public void setRgender(String rgender) {
		this.rgender = rgender;
	}


	public String getRbg() {
		return rbg;
	}


	public void setRbg(String rbg) {
		this.rbg = rbg;
	}


	public String getRmbl() {
		return rmbl;
	}


	public void setRmbl(String rmbl) {
		this.rmbl = rmbl;
	}


	public String getRemial() {
		return remial;
	}


	public void setRemial(String remial) {
		this.remial = remial;
	}


	public String getRquali() {
		return rquali;
	}


	public void setRquali(String rquali) {
		this.rquali = rquali;
	}


	public String getRstate() {
		return rstate;
	}


	public void setRstate(String rstate) {
		this.rstate = rstate;
	}


	public String getRfname() {
		return rfname;
	}


	public void setRfname(String rfname) {
		this.rfname = rfname;
	}


	public String getRfoc() {
		return rfoc;
	}


	public void setRfoc(String rfoc) {
		this.rfoc = rfoc;
	}


	public String getRmname() {
		return rmname;
	}


	public void setRmname(String rmname) {
		this.rmname = rmname;
	}


	public String getRmoc() {
		return rmoc;
	}


	public void setRmoc(String rmoc) {
		this.rmoc = rmoc;
	}


	public String getRpmad() {
		return rpmad;
	}


	public void setRpmad(String rpmad) {
		this.rpmad = rpmad;
	}


	public String getRpcnno() {
		return rpcnno;
	}


	public void setRpcnno(String rpcnno) {
		this.rpcnno = rpcnno;
	}


	public Education getRedu() {
		return redu;
	}


	public void setRedu(Education redu) {
		this.redu = redu;
	}


	public String getRpaddr() {
		return rpaddr;
	}


	public void setRpaddr(String rpaddr) {
		this.rpaddr = rpaddr;
	}


	/*public String getRgnm() {
		return rgnm;
	}


	public void setRgnm(String rgnm) {
		this.rgnm = rgnm;
	}


	public String getRgcno() {
		return rgcno;
	}


	public void setRgcno(String rgcno) {
		this.rgcno = rgcno;
	}
*/

	public String getRdate() {
		return rdate;
	}


	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

 
	 public Office getOrf() {
		return orf;
	}


	public void setOrf(Office orf) {
		this.orf = orf;
	}

	
	
	

	public RCourse getCurs() {
		return curs;
	}


	public void setCurs(RCourse curs) {
		this.curs = curs;
	} 
 

	@Override
	public String toString() {
		return "Registration [id=" + id + ", rasname=" + rasname + ", rdob="
				+ rdob + ", rgender=" + rgender + ", rbg=" + rbg + ", rmbl="
				+ rmbl + ", remial=" + remial + ", rquali=" + rquali
				+ ", rstate=" + rstate + ", rfname=" + rfname + ", rfoc="
				+ rfoc + ", rmname=" + rmname + ", rmoc=" + rmoc + ", rpmad="
				+ rpmad + ", rpcnno=" + rpcnno + ", redu=" +redu+ ", rpaddr="
				+ rpaddr + ", rgnm=" +  ", rdate="
				+ rdate + ", orf=" +orf + ",curs"+curs+"]";
		  
	}
	
	
	
	
	
	
}
