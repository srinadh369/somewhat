package org.capstore.controller;

import java.util.Map;

import javax.validation.Valid;

import org.capstore.domain.Customer;
import org.capstore.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	

	
@Autowired
private CustomerService customerService;
	

	@RequestMapping("/customer")
	public String showCustomerPage(Map<String, Object> map){
		
				map.put( "customer", new Customer());
				return "customerRegister";
	}
	
	

	
	
	@RequestMapping(value="/saveCustomer",method=RequestMethod.POST)
	public ModelAndView saveCustomer(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult result){
		
		if(!result.hasErrors()){
			customerService.saveCustomer(customer);
			return new ModelAndView("customer");
			
			
			
		}else
		{
			return new ModelAndView("customer");
		}
	
	}
	

	
	

}
