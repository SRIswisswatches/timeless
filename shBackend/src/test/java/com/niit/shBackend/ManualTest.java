package com.niit.shBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.BillingAddressDao;
import com.niit.dao.CartDao;
import com.niit.dao.CategoryDao;
import com.niit.dao.ProductDao;
import com.niit.dao.RoleDao;
import com.niit.dao.ShippingAddressDao;
import com.niit.dao.SupplierDao;
import com.niit.dao.UserDao;
import com.niit.dao.WishlistDao;
import com.niit.model.BillingAddress;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.User;
import com.niit.model.Wishlist;
import com.niit.model.Product;
import com.niit.model.Role;
import com.niit.model.ShippingAddress;
import com.niit.model.Supplier;

public class ManualTest {

	//private static Cart productid;

	public static void main (String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();

		CategoryDao categoryDao = (CategoryDao) context.getBean("CategoryDao");
		UserDao userDao = (UserDao) context.getBean("UserDao");
		ProductDao productDao = (ProductDao) context.getBean("ProductDao");
		BillingAddressDao billingaddressDao = (BillingAddressDao) context.getBean("BillingAddressDao");
		CartDao cartDao = (CartDao) context.getBean("CartDao");
		SupplierDao supplierDao = (SupplierDao) context.getBean("SupplierDao");
		WishlistDao wishlistDao = (WishlistDao) context.getBean("WishlistDao");
		ShippingAddressDao shippingaddressDao = (ShippingAddressDao) context.getBean("ShippingAddressDao");
		RoleDao roleDao = (RoleDao) context.getBean("RoleDao");
		
		Category category = (Category) context.getBean("category");
		User user = (User) context.getBean("user");
		Product product = (Product) context.getBean("product");
		BillingAddress billingaddress = (BillingAddress) context.getBean("billingaddress");
		Cart cart = (Cart) context.getBean("cart");
		Supplier supplier = (Supplier) context.getBean("supplier");
		Wishlist whishlist = (Wishlist) context.getBean("wishlist");
		ShippingAddress shippingaddress = (ShippingAddress) context.getBean("shippingaddress");
		Role role = (Role) context.getBean("role");
		
		
		category.setCategoryName("Watches");
		
		categoryDao.saveOrUpdate(category);
		
		
		user.setUsername("sri");
		user.setPassword("hai");

		role.setEmail("sri@sri.sri");
		
		user.setRole(role);
		role.setUser(user);
		
		userDao.saveOrUpdate(user);
		roleDao.saveOrUpdate(role);
		
		
		product.setProductName("fdknmfg");
		productDao.saveOrUpdate(product);
		
		billingaddress.setAddress("hfdjdufuinv");
		billingaddressDao.saveOrUpdate(billingaddress);
		
		
		cart.setProductName("dfhjj");
		cartDao.saveOrUpdate(cart);
		
		
		supplier.setSupplierName("hddsjk");
		supplier.setContactNumber(87968764);
		supplierDao.saveOrUpdate(supplier);
		
		
		whishlist.setProductName("dhjf");
		whishlist.setPrice(87);
		wishlistDao.saveOrUpdate(whishlist);
		
		shippingaddress.setAddress("fdgfs");
		shippingaddress.setUserName("jkfgjd");
		shippingaddressDao.saveOrUpdate(shippingaddress);
		
		
	}
}