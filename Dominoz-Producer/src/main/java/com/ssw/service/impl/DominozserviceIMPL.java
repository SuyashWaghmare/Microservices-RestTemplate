package com.ssw.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssw.model.Dominoz;
import com.ssw.repository.DominozRepository;
import com.ssw.service.Dominozservice;

@Service
public class DominozserviceIMPL implements Dominozservice {

	@Autowired
	private DominozRepository repo;

	@Override
	public String saveOrderProd(Dominoz dom) {

		repo.save(dom);

		return "Order Placed";
	}

	@Override
	public List<Dominoz> getAllOdersProd() {

		return repo.findAll();
	}

	@Override
	public Dominoz getSingleOrderProd(int id) {
		if (repo.existsById(id))
			return repo.findById(id).get();
		else {
			return null;
		}

	}

	@Override
	public String deleteSingleOrderProd(int id) {

		repo.deleteById(id);
		return "ID successfully Deleted";

	}

	@Override
	public Object updateOrderProd(int id, Dominoz dom) {

		Dominoz dominoz = repo.findById(id).get();

		if (dominoz != null) {

			dominoz.setName(dom.getName());
			dominoz.setPrice(dom.getPrice());
			dominoz.setQuantity(dom.getQuantity());
			return repo.save(dominoz);
		}
		return "Id is not Found";

	}

}
