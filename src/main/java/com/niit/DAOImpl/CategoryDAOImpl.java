	/**
	 * 
	 */
package com.niit.DAOImpl;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

	/**
	 * @author MRuser
	 *
	 */
	@Repository("CategoryDAO")
	@Transactional
	public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;
		public void addCategory(Category category) 
		{
			sessionFactory.getCurrentSession().save(category);
		}
		public List<Category> getCategory() 
		{	
		return  sessionFactory.getCurrentSession().createQuery("from Category").list();	
		}
		public Category findCategoryById(int CategoryId) 
		{			
		return (Category)sessionFactory.getCurrentSession().createQuery("from Category where CId="+CategoryId).uniqueResult();
		}
		public boolean updateCategory(Category category) 
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		public boolean deleteCategory(int CategoryId) 
		{
			sessionFactory.getCurrentSession().delete(findCategoryById(CategoryId));	
			return true;
	    }
		public List<Category> findAllCategory() {
			// TODO Auto-generated method stub
			return null;
		}
		public Category findCategorytById(int CategoryId) {
			// TODO Auto-generated method stub
			return null;
		}
		public Category findCategoryByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}
		public Category findCategoryByType(String type) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
			
	}
