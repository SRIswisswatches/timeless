package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.RoleDao;
import com.niit.dao.UserDao;
import com.niit.model.Role;
import com.niit.model.User;
import com.niit.dao.ProductDao;
import com.niit.model.Product;


@Controller
public class IndexController {
	
	@Autowired
	private UserDao userDAO;
	
	@Autowired 
	private RoleDao roleDAO;

	@Autowired
	private Role role;
	
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String IndexPage(Model model)
	{
		List<Product> productList = productDao.list();
		model.addAttribute("productList", productList);
		return "index";
	}
	
	@RequestMapping("index")
	public String IndexPage2(Model model)
	{
		List<Product> productList = productDao.list();
		model.addAttribute("productList", productList);
		return "index";
	}
	
	@RequestMapping("signup")
	public ModelAndView signup() {

		ModelAndView mv = new ModelAndView("signup");
		mv.addObject("signupButtonClicked", true);
		return mv;
	}
	
	@RequestMapping("login")
	public ModelAndView login() {

		ModelAndView mv = new ModelAndView("login");
		mv.addObject("signupButtonClicked", true);
		return mv;
	}
	
	
	
}
