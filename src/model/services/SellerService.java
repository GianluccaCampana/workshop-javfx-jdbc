package model.services;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
	
	private SellerDao dao = DaoFactory.createSellerDao(); // conectando ao BD

	public List<Seller> findAll() {
		return dao.findAll();
	}
	
	public void saveOrUpdate(Seller obj) {
		if(obj.getId() == null) {
			dao.insert(obj); // colocando um novo departamento
		}
		else {
			dao.update(obj);
		}
	}
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}

}
