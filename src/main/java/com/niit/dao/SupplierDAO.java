package com.niit.dao;
import java.util.List;

import com.niit.model.Supplier;



	public interface SupplierDAO 
	{
	public void addSupplier(Supplier supplier);
	public List<Supplier> getSupplier();
	public Supplier findSuppliertById(int SId);
	public boolean updateSupplier(com.niit.model.Supplier supplier);
	public boolean deleteSupplier(int Sid);
	
	}
