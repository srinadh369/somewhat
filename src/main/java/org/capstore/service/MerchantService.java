package org.capstore.service;


import org.capstore.domain.Merchant;

public interface MerchantService {
	
	public Integer isvaliduser(Merchant login);
	
	public void saveMerchant(Merchant merchant);

}
