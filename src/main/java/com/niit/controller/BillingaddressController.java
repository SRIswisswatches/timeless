package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.BillingAddressDao;
import com.niit.model.BillingAddress;

@Controller
public class BillingaddressController {


	@Autowired
	private BillingAddressDao billingaddressDao;
	
	@RequestMapping("billingaddressPage")
	public ModelAndView newBillingaddress(){
		
		ModelAndView mv = new ModelAndView("NewBillingaddress");
		return mv;
	}
	
	@RequestMapping("addBillingaddress")
	public String addBillingAddress(@ModelAttribute BillingAddress billingaddress){
		billingaddressDao.saveOrUpdate(billingaddress);
		return "ViewBillingaddress";
		
	}
}