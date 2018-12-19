package com.niit.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;
@Repository("supplierDAO")
@Transactional

public class SupplierDAOImpl implements SupplierDAO
{

@Autowired
SessionFactory sessionFactory;

public void addSupplier(Supplier supplier) {
	
	// TODO Auto-generated method stub
	sessionFactory.getCurrentSession().save(supplier);
	
}

public List<Supplier> getSupplier() {
	// TODO Auto-generated method stub
	return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	
}

public Supplier findSuppliertById(int SId) {
	// TODO Auto-generated method stub
	 return (Supplier)sessionFactory.getCurrentSession().createQuery("from supplier where SId="+SId).uniqueResult();
}

public boolean updateSupplier(Supplier supplier) {
	// TODO Auto-generated method stub
	sessionFactory.getCurrentSession().update(supplier);
	return true;
}

public boolean deleteSupplier(int Sid) {
	// TODO Auto-generated method stub
	sessionFactory.getCurrentSession().delete(findSuppliertById(Sid));
	return true;
}
}
