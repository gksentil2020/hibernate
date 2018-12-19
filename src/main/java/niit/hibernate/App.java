package niit.hibernate;

import java.util.List;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.DBConfig.DBConfig;
import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.dao.SupplierDAO;
import com.niit.dao.UserDao;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;
import com.niit.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
	//private static AbstractApplicationContext context;
	
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
    	/*
   	 	UserDao userDAO = (UserDao) context.getBean("userDAO");
   	 	User user=new User();
   	 	user.setUid(105);
   	 	user.setUname("senthil");
   	 	user.setPwd("sski.123");
   	 	user.setMobno("9566201545");
   	 	user.setEmailid("gksentil2021@gmail.com");
   	 	userDAO.addUser(user);
   	 	List<User> userList=userDAO.getUser();
   	 	for(User userobj:userList)
   	 	{
   	 		System.out.println(userobj.getUid());
   	 		System.out.println(userobj.getUname());
   	 	}
    	
   	 Scanner s=new Scanner(System.in);
	 	user.setUid(105);
	 	user.setUname("Senthilkumar");
	 	user.setPwd("sski@1234");
	 	user.setMobno("9840972724");
	 	user.setEmailid("gksentil2020@gmail.com");
	 	userDAO.updateUser(user);
	 	System.out.println("Enter the id to delete");
	 	int did=s.nextInt();
	 	userDAO.deleteUser(did);
    
    }
*/

   //product//
    
   
     ProductDAO productDAO = (ProductDAO) context.getBean("ProductDAO");
	 Product product=new Product(null, 0);
	 	/*product.setPid(21888);
	 	product.setPname("p4");
	 	product.setquantity(50);
	 	product.setprice(10000);*/
	 	
	 	context = new AnnotationConfigApplicationContext(DBConfig.class);
	 	
	 	
	 //	productDAO.addProduct(product);
	 	List<Product> productList=productDAO.getProduct();
	 	for(Product productobj:productList)
	 	{
	 		System.out.println(productobj.getPid());
	 		System.out.println(productobj.getPname());
	 	}
	 	
   Scanner s=new Scanner(System.in);
    product.setPid(230919);
    product.setPname("lenovo");
    product.setprice(30000);
    product.setquantity(150);
    productDAO.updateProduct(product);
   
    System.out.println("Enter the id to delete");
    int did=s.nextInt();
    productDAO.deleteProduct(did);
   
    
    /*CategoryDAO categoryDAO = (CategoryDAO) context.getBean("CategoryDAO");
 	Category category=new Category();
 	category.setCid(230919);
 	category.setCname("Karnatic");
 	category.settype("Sruti");
 	
 	
 	context = new AnnotationConfigApplicationContext(DBConfig.class);
 	
 	
 	categoryDAO.addCategory(category);
 	List<Category> categoryList=categoryDAO.getCategory();
 	for(Category categoryobj:categoryList)
 	{
 		System.out.println(categoryobj.getCid());
 		System.out.println(categoryobj.getCname());
 	}
 	
Scanner s=new Scanner(System.in);
category.setCid(230919);
category.setCname("Karnatic");
category.settype("Sruti");
categoryDAO.updateCategory(category);

System.out.println("Enter the id to delete");
int dpid=s.nextInt();
categoryDAO.deleteCategory(dpid);


 }*/
  /*  SupplierDAO SupplierDAO = (SupplierDAO) context.getBean("supplierDAO");
 	Supplier Supplier=new Supplier();
 	Supplier.setSid(230920);
 	Supplier.setSname("Lenovo");
 	Supplier.setSaddress("No 174 , 4th street ");
 	context = new AnnotationConfigApplicationContext(DBConfig.class);
 	
 	SupplierDAO.addSupplier(Supplier);
 	List<Supplier> SupplierList=SupplierDAO.getSupplier();
 	for(Supplier Supplierobj:SupplierList)
 	{
 		System.out.println(Supplierobj.getSid());
 		System.out.println(Supplierobj.getSname());
 	}
 	
Scanner s=new Scanner(System.in);
Supplier.setSid(230919);
Supplier.setSname("Lenovo");
Supplier.setSaddress("No 174,4th street,");
SupplierDAO.updateSupplier(Supplier);

System.out.println("Enter the id to delete");
int dpid=s.nextInt();
SupplierDAO.deleteSupplier(dpid);  
    }*/
    }
    }
