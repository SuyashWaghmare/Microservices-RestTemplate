package com.ssw.service;

import java.util.List;

import com.ssw.model.Dominoz;

public interface Dominozservice  {

	String saveOrderProd(Dominoz dom);

	List<Dominoz> getAllOdersProd();

	Dominoz getSingleOrderProd(int id);

	String deleteSingleOrderProd(int id);

	Object updateOrderProd(int id,Dominoz dom);

	

}
