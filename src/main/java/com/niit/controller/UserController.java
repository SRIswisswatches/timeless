package com.niit.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.dao.ProductDao;
import com.niit.dao.RoleDao;
import com.niit.dao.UserDao;
import com.niit.model.Product;
import com.niit.model.Role;
import com.niit.model.User;

@Controller
public class UserController {
	@Autowired
	private UserDao userDAO;
	
	@Autowired 
	private RoleDao roleDAO;

	@Autowired
	private Role role;
	
	@Autowired
	private ProductDao productDAO;
	
	@RequestMapping("adduser")
	public String addUser(@ModelAttribute User user, Model model) {
		
		String message;
		
		if(userDAO.isAllReadyRegister(user.getEmail(), true)){
			message = "Your emailId is Alread registered you have to login";
			
		}
		else {
		user.setEnabled(true);
		role.setEmail(user.getEmail());
		role.setRole("ROLE_USER");
		role.setUsername(user.getUsername());

		user.setRole(role);
		role.setUser(user);

		userDAO.saveOrUpdate(user);
		roleDAO.saveOrUpdate(role);
		
		/*shippingaddress.setUserId(user.getUserId());
		shippingaddressDAO.saveOrUpdate(shippingaddress);
		
		billingaddress.setUserId(user.getUserId());
		billingaddressDAO.saveOrUpdate(billingaddress);*/
		
		}
		
		model.addAttribute("loginButtonClicked", true);
		return "index";


	}
	@RequestMapping("/afterlogin")
	public String loginProcess(Principal p, Model model){
		
		String email = p.getName();
		
		User user = userDAO.getByEmail(email);
	
		Role role = roleDAO.getByEmail(email);
		
		String role1 = role.getRole();
		
		if(role1.equals("ROLE_ADMIN")){
			
			return "index";
		}
		else if(role1.equals("ROLE_USER")){
			List<Product> productList = productDAO.list();
			model.addAttribute("productList", productList);
			model.addAttribute("userLoggedIn", "true");
			return "index";
		}
		else{		
		
		return "index";
		}
	}
}


