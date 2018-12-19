	/**
	 * 
	 */
	package com.niit.DAOImpl;

	import java.util.List;

	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

	/**
	 * @author MRuser
	 *
	 */
	@Repository("ProductDAO")
	@Transactional
	public class ProductDAOImpl implements ProductDAO {

		@Autowired
	SessionFactory sessionFactory;
		
		public void addProduct(Product product) 
		{
			sessionFactory.getCurrentSession().save(product);
		}
		public List<Product> getProduct() 
		{	
		return  sessionFactory.getCurrentSession().createQuery("from Product").list();	
		}
		public Product findProductById(int ProductId) 
		{			
		return (Product)sessionFactory.getCurrentSession().createQuery("from Product where PId="+ProductId).uniqueResult();
		}
		public boolean updateProduct(Product product) 
		{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		public boolean deleteProduct(int ProductId) 
		{
			sessionFactory.getCurrentSession().delete(findProductById(ProductId));	
			return true;
	    }
		public List<Product> findAllProduct() {
			return null;
		}
		public Product findProductByName(String name) {
			return null;
		}
		
		public boolean deleteUser(int Pid) {
			return false;
		}
		public Product findProdcutByPrice(float price) {
			return null;
		}
		public Product findProductByquantity(float quantity) {
			return null;
		}

	}

