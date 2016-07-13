package org.capstore.dao;


import org.capstore.domain.Merchant;

public interface MerchantDao {
	
	public Integer isvaliduser(Merchant login);
	
	public void saveMerchant(Merchant merchant);

}
