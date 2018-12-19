	package com.niit.model;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.OneToOne;
	import javax.persistence.Table;

	@Entity
	@Table(name="Product")
	public class Product 
	{
		@Id
		int Pid;
		String Pname;
		float quantity;
		int price;
		@OneToOne
		private Supplier supplier;
		public void product()
		{
			
		}
		public Product(String Pname,int price)
		{
			this.Pname=Pname;
			this.price=price;
		}
		
		public Supplier getSupplier()
	{
		return supplier;
	}
		public void setSupplier(Supplier supplier)
		{
			this.supplier=supplier;
		}
		
		
		public int getPid() {
			return Pid;
		}
		public void setPid(int Pid) {
			this.Pid = Pid;
		}
		public String getPname() {
			return Pname;
		}
		public void setPname(String Pname) {
			this.Pname = Pname;
		}
		public int getprice() {
			return price;
		}
		public void setprice(int price) {
			this.price = price;
		}
		public float getquantity() {
			return quantity;
		}
		public void setquantity(float quantity) {
			this.quantity = quantity;
		}	
		}
				



