	package com.niit.model;

	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Category 
	{
		@Id
		int Cid;
		String Cname;
		String type;
		
		public int getCid() {
			return Cid;
		}
		public void setCid(int Cid) {
			this.Cid = Cid;
		}
		public String getCname() {
			return Cname;
		}
		public void setCname(String Cname) {
			this.Cname = Cname;
		}
		public String gettype() {
			return type;
		}
		public void settype(String type) {
			this.type = type;
		}
	}


