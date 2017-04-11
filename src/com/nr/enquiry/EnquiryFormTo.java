package com.nr.enquiry;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

public class EnquiryFormTo {

	int id;
	String name;
	String dob;
	String mblno;
	String gender;
	String email;
	
	String quali;
	//String dist;
	String state;
	String know[];
	  String course[];
	  String date;
	  
	  
	  String address;
	  String collegeName;
	  String semester;
	  
	  
	/*
	  String cds;
	String corej;
	String advj;
	String spring;
	String Hibernate;
	String ocjpcls;
	String projects;
	String Completj;
	 
	String mtimings[];
	String etimings[];
	
	*/
	
	
	public EnquiryFormTo() {
	 System.out.println("Enquiry form D.C");
	}

	
	
 


	public EnquiryFormTo(int id, String name, String dob, String mblno,
			String gender, String email, String quali, String state,
			String know[], String course[],String date) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.mblno = mblno;
		this.gender = gender;
		this.email = email;
		this.quali = quali;
		this.state = state;
		this.know = know;
		this.course = course;
		this.date=date;
	}

	public EnquiryFormTo(int id, String name, String dob, String mblno,
			String gender, String email, String quali, String state,
			String[] know, String[] course, String date, String address,
			String collegeName, String semester) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.mblno = mblno;
		this.gender = gender;
		this.email = email;
		this.quali = quali;
		this.state = state;
		this.know = know;
		this.course = course;
		this.date = date;
		this.address = address;
		this.collegeName = collegeName;
		this.semester = semester;
	}


	public EnquiryFormTo(String name, String dob, String mblno,
			String gender, String email, String quali, String state,
			String[] know, String[] course, String date, String address,
			String collegeName, String semester) {
		super();
		this.name = name;
		this.dob = dob;
		this.mblno = mblno;
		this.gender = gender;
		this.email = email;
		this.quali = quali;
		this.state = state;
		this.know = know;
		this.course = course;
		this.date = date;
		this.address = address;
		this.collegeName = collegeName;
		this.semester = semester;
	}








	public EnquiryFormTo(String name, String dob, String mblno, String gender,
			String email, String quali, String state, String []know,
			String []course,String date) {
		super();
		this.name = name;
		this.dob = dob;
		this.mblno = mblno;
		this.gender = gender;
		this.email = email;
		this.quali = quali;
		this.state = state;
		this.know = know;
		this.course = course;
		this.date=date;
	}






	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getMblno() {
		return mblno;
	}


	public void setMblno(String mblno) {
		this.mblno = mblno;
	}


	public String  getGender() {
		return gender;
	}


	public void setGender(String  gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getQuali() {
		return quali;
	}


	public void setQuali(String quali) {
		this.quali = quali;
	}


	/*public String getDist() {
		return dist;
	}


	public void setDist(String dist) {
		this.dist = dist;
	}
*/

	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}






	public String[] getKnow() {
		return know;
	}






	public void setKnow(String[] know) {
		this.know = know;
	}






	public String[] getCourse() {
		return course;
	}






	public void setCourse(String[] course) {
		this.course = course;
	}



	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}




	public String getAddress() {
		return address;
	}






	public void setAddress(String address) {
		this.address = address;
	}






	public String getCollegeName() {
		return collegeName;
	}






	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}






	public String getSemester() {
		return semester;
	}






	public void setSemester(String semester) {
		this.semester = semester;
	}






	@Override
	public String toString() {
		return "EnquiryFormTo [id=" + id + ", name=" + name + ", dob=" + dob
				+ ", mblno=" + mblno + ", gender=" + gender + ", email="
				+ email + ", quali=" + quali + ", state=" + state + ", know="
				+ Arrays.toString(know) + ", course=" + Arrays.toString(course)
				+ ", date=" + date + ", address=" + address + ", collegeName="
				+ collegeName + ", semester=" + semester + "]";
	}




	

 	
	
}
