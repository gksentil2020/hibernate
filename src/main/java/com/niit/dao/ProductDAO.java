package com.niit.dao;

	import java.util.List;

import com.niit.model.Product;


	public interface ProductDAO 
	{
	public void addProduct(Product product);
	public List<Product> getProduct();
	public List<Product> findAllProduct();
	public Product findProductById(int ProductId);
	public Product findProductByName(String name);
	public Product findProdcutByPrice(float price);
	public Product findProductByquantity(float quantity);
	public boolean updateProduct(Product Product);
	public boolean deleteProduct(int Pid);
	}
