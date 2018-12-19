
	/**
	 * 
	 */
	package com.niit.DAOImpl;

	import java.util.List;

	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDao;
import com.niit.model.User;

	/**
	 * @author MRuser
	 *
	 */
	@Repository("userDAO")
	@Transactional
	public class UserDAOImpl implements UserDao {

		@Autowired
	SessionFactory sessionFactory;
		public void addUser(User user) 
		{
			sessionFactory.getCurrentSession().save(user);
		}
		public List<User> getUser() 
		{	
		return  sessionFactory.getCurrentSession().createQuery("from User").list();	
		}
		public User findUserById(int UserId) 
		{			
		return (User)sessionFactory.getCurrentSession().createQuery("from User where UserId="+UserId).uniqueResult();
		}
		public boolean updateUser(User user) 
		{
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		public boolean deleteUser(int UserId) 
		{
			sessionFactory.getCurrentSession().delete(findUserById(UserId));	
			return true;
	    }
		public List<User> findAllUser() {
			return null;
		}
		public User findUserByName(String name) {
			return null;
		}

	}


