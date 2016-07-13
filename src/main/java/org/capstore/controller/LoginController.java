package org.capstore.controller;

import org.capstore.domain.Customer;
import org.capstore.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

	@Autowired
	private CustomerService customerService; 
	
	@RequestMapping("/login")
	public String validateUser(@ModelAttribute("login") Customer login,
			BindingResult result){
		
		
		return "login";
		
	}
	

	
	@RequestMapping("/userlogin")
	public String showPage(@ModelAttribute("login") Customer customer,BindingResult result)	
	{	System.out.println(customer);
		
		boolean flag = customerService.isvaliduser(customer);
	
		System.out.println(flag);
		if(flag)
			return "customer";
		else
			return "loginerror";
	}

	
	


	
}
