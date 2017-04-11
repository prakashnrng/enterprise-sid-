 
	package com.nr.user;

	public class  UserTO{
	
	 

		private int uid;
		private String uname;
		private String pwd;
		private String rpwd;
		private String uemail;
		private String umbl;
		private String role;
		
		
		public UserTO() {
			System.out.println("User->D.C");
		}
		
		
		
		public UserTO(int uid, String uname, String pwd) {
			super();
			this.uid = uid;
			this.uname = uname;
			this.pwd = pwd;
		}



		public UserTO(String uname, String pwd,String role) {
			super();
			this.uname = uname;
			this.pwd = pwd;
			this.role=role;
		}



		public UserTO(int uid,String uname, String pwd,String role) {
			super();
			this.uid=uid;
			this.uname = uname;
			this.pwd = pwd;
			this.role=role;
		}
		
		
		
		
		
		public UserTO(int uid, String uname, String pwd, String rpwd, String uemail,
				String umbl, String role) {
			super();
			this.uid = uid;
			this.uname = uname;
			this.pwd = pwd;
			this.rpwd = rpwd;
			this.uemail = uemail;
			this.umbl = umbl;
			this.role = role;
		}
		
		

		public UserTO(String uname, String pwd, String rpwd, String uemail,
				String umbl, String role) {
			super();
			this.uname = uname;
			this.pwd = pwd;
			this.rpwd = rpwd;
			this.uemail = uemail;
			this.umbl = umbl;
			this.role = role;
		}



		public int getUid() {
			return uid;
		}



		public void setUid(int uid) {
			this.uid = uid;
		}



		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		
		
		
		public String getRole() {
			return role;
		}



		public void setRole(String role) {
			this.role = role;
		}

		

		public String getRpwd() {
			return rpwd;
		}



		public void setRpwd(String rpwd) {
			this.rpwd = rpwd;
		}



		public String getUemail() {
			return uemail;
		}



		public void setUemail(String uemail) {
			this.uemail = uemail;
		}



		public String getUmbl() {
			return umbl;
		}



		public void setUmbl(String umbl) {
			this.umbl = umbl;
		}



		@Override
		public String toString() {
			return "UserTO [uid=" + uid + ", uname=" + uname + ", pwd=" + pwd
					+ ", rpwd=" + rpwd + ", uemail=" + uemail + ", umbl="
					+ umbl + ", role=" + role + "]";
		}



		 
		 
		
		
		
	}

 
