	package com.niit.model;

	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class User 
	{
		@Id
		int uid;
		String uname;
		String pwd;
		String emailid;
		String mobno;
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
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public String getMobno() {
			return mobno;
		}
		public void setMobno(String mobno) {
			this.mobno = mobno;
		}
		

	}


