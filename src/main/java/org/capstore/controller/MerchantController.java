package org.capstore.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

//import org.capgemini.domain.Customer;
import org.capstore.domain.Merchant;
//import org.capgemini.service.CustomerService;
import org.capstore.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MerchantController {

	
			
@Autowired
private MerchantService merchantService; 
	

@RequestMapping("/merchantlogin")
public String showPage(@ModelAttribute("login") Merchant login,
		BindingResult result)	
{
	
	return "merchantlogin";
}



@RequestMapping("/merchantlogin1")
public String showPage1(@ModelAttribute("login") Merchant login,BindingResult result,HttpServletRequest request,Model map)	
{	System.out.println(login);

	
	
	int merchant_id=merchantService.isvaliduser(login);
	HttpSession httpSession=request.getSession();
	httpSession.setAttribute("merchantid", merchant_id);
	
	if(merchant_id!=0)
	{
		map.addAttribute("merchantid", merchant_id);
	
		return "merchant_home_page";
	}
	else
		 return "merchantloginerror";
}
	
		

	
	
	@RequestMapping("/merchant_add_product")
	public String showPage3(){
		return "merchant_add_product";
	}
	
	
	


	
	@RequestMapping("/logout")
public String logoutPage(@ModelAttribute("login") Merchant login,BindingResult result, HttpServletRequest request)	
{
		  HttpSession session=request.getSession(false);  
	        int n=(Integer)session.getAttribute("merchantid");
	        System.out.println("logout"+n);
	        session.invalidate();
	        return "merchantlogin";
}
	
	
	
	
	
	
	
}
