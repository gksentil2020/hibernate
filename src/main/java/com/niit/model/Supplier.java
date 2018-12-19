package com.niit.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier 
{

	@Id
	int Sid;
	String Sname;
	String Saddress;
	
	public int getSid() {
		return Sid;
	}
	public void setSid(int Sid)
	{
		this.Sid=Sid;
	}
	public String getSname()
	{
		return Sname;
	}
	public void setSname(String Sname)
	{
		this.Sname=Sname;
	}
	

	public String getSaddress()
		{
			return Saddress;
		}
	public void setSaddress(String address)
	{
		this.Saddress=address;
	}
}


