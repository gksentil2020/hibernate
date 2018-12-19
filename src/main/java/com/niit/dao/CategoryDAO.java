package com.niit.dao;

import java.util.List;

import com.niit.model.Category;



	public interface CategoryDAO 
	{
	public void addCategory(Category category);
	public List<Category> getCategory();
	public List<Category> findAllCategory();
	public Category findCategorytById(int CategoryId);
	public Category findCategoryByName(String name);
	public Category findCategoryByType(String type);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(int Cid);
	
	}
