package model.service;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
	
	private SellerDao SellerDao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll() {
		return SellerDao.findAll();
	}
	
	public void saveOrUpdate(Seller obj) {
		if (obj.getId() == null) {
			SellerDao.insert(obj);
		}
		else {
			SellerDao.update(obj);
		}
	}
	
	public void remove(Seller obj) {
		SellerDao.deleteById(obj.getId());
	}
}
