package com.ssw.service;

import java.util.List;

import com.ssw.model.Dominoz;

public interface Swiggyservice {

	String saveOrderCon(Dominoz dom);

	Dominoz getSingleOrderCon(int id);

	String deleteSingleOrderCon(int id);

	Object updateOrderCon(int id, Dominoz dom);

	List<Dominoz> getAllOrdersCon();

}
