package com.ssw.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ssw.model.Dominoz;
import com.ssw.service.Swiggyservice;

@Service
public class SwiggyserviceIMPL implements Swiggyservice {

	@Autowired
	private RestTemplate template;

	@Override
	public String saveOrderCon(Dominoz dom) {

		String saveOrderProd = "http://localhost:9297/dominoz-api/saveOrderProd";

		String msg = template.postForObject(saveOrderProd, dom, String.class);
            
		return msg;
	}

	@Override
	public List<Dominoz> getAllOrdersCon() {
		String getAllOrdersProd = "http://localhost:9297/dominoz-api/getAllOdersProd";
		List<Dominoz> list = template.getForObject(getAllOrdersProd, List.class);

		return list;
	}

	@Override
	public Dominoz getSingleOrderCon(int id) {

		String getSingleOrderProd = "http://localhost:9297/dominoz-api/getSingleOrderProd/" + id + "";
		Dominoz dominoz = template.getForObject(getSingleOrderProd, Dominoz.class);
		return dominoz;
	}

	@Override
	public String deleteSingleOrderCon(int id) {

		String deleteSingleOrderProd = "http://localhost:9297/dominoz-api/deleteSingleOrderProd/{id}";

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("id", id);

		template.delete(deleteSingleOrderProd, map);

		return "Id deleted";

	}

	@Override
	public Object updateOrderCon(int id, Dominoz dom) {
		String updateOrderProd = "http://localhost:9297/dominoz-api/updateOrderProd/" + id + "";
		template.put(updateOrderProd, dom);
		return "Updated";

	}

}
