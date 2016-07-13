package org.capstore.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.capstore.domain.Merchant;
import org.capstore.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MerchantRegistrationController {
	

	@Autowired
	private MerchantService merchantService;

	@RequestMapping("/merchant")
	public String showMerchantPage(Map<String, Object> map){
		
				map.put( "merchant", new Merchant());
				map.put("merchanttype", getAllMerchantType().values());
				return "merchantRegister";
				
	}
	
	@RequestMapping(value="/saveMerchant",method=RequestMethod.POST)
	public ModelAndView saveMerchant(@Valid @ModelAttribute("merchant") Merchant merchant,
			BindingResult result){
		
		if(!result.hasErrors()){
			
			System.out.println(merchant);
			merchantService.saveMerchant(merchant);
			
			
			
			
			
			return new ModelAndView("merchantsuccessregister","merchanttype", getAllMerchantType().values());
			
		}else
		{
			
			
			return new ModelAndView("merchantsuccessregister","merchanttype", getAllMerchantType().values());
		}
	
	}
	
	
	public Map<Integer, String> getAllMerchantType(){
		
		Map<Integer, String> maps=new HashMap<>();
		
		maps.put(1,"Merchant");
		maps.put(2,"Third Party");
		
		
		return maps;
		
	}

	
	      
	
	
	}


