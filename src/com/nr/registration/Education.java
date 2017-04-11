package com.nr.registration;

import java.util.List;

public class Education {
	
	int eduid;
 String grade;
String clgnme;
String yop;
String pc;
Registration registration;

public Education() {
 System.out.println("educ->D.C");
}

public Education(int eduid,String grade, String clgnme, String yop, String pc) {
	super();
	this.eduid = eduid;
	this.grade=grade;
	//this.educ = educ;
	this.clgnme = clgnme;
	this.yop = yop;
	this.pc = pc;
}


public Education(String grade, String clgnme, String yop, String pc) {
	super();
	//this.educ = educ;
	this.grade=grade;
	this.clgnme = clgnme;
	this.yop = yop;
	this.pc = pc;
}







public int getEduid() {
	return eduid;
}


public void setEduid(int eduid) {
	this.eduid = eduid;
}


 

 

public  String getGrade() {
	return grade;
}

public String getClgnme() {
	return clgnme;
}


public void setClgnme(String clgnme) {
	this.clgnme = clgnme;
}


public String getYop() {
	return yop;
}


public void setYop(String yop) {
	this.yop = yop;
}


public String getPc() {
	return pc;
}


public void setPc(String pc) {
	this.pc = pc;
}






public void setGrade(String grade) {
	this.grade = grade;
}

public Registration getRegistration() {
	return registration;
}

public void setRegistration(Registration registration) {
	this.registration = registration;
}

@Override
public String toString() {
	return "Education [eduid=" + eduid +"[grade]"+grade+  ", clgnme="
			+ clgnme + ", yop=" + yop + ", pc=" + pc + "]";
}






}
