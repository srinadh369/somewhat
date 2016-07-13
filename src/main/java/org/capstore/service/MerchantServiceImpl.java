package org.capstore.service;


import org.capstore.dao.MerchantDao;
import org.capstore.domain.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MerchantServiceImpl implements MerchantService {

	
	@Autowired
	MerchantDao merchantDao;
	
	@Transactional
	public Integer isvaliduser(Merchant login) {
		
	return	merchantDao.isvaliduser(login);
	}

	@Transactional
	@Override
	public void saveMerchant(Merchant merchant) {
		merchantDao.saveMerchant(merchant);
		
	

}
}