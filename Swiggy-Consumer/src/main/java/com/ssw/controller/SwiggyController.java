package com.ssw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssw.model.Dominoz;
import com.ssw.service.Swiggyservice;

@RestController
@RequestMapping("/swiggy-api")
public class SwiggyController {

	@Autowired
	private Swiggyservice service;

	@PostMapping("/saveOrderCon")
	ResponseEntity<String> saveOrderCon(@RequestBody Dominoz dom) {

		return new ResponseEntity<String>(service.saveOrderCon(dom), HttpStatus.CREATED);

	}

	@GetMapping("/getAllOrdersCon")
	ResponseEntity <List<Dominoz>> getAllOrdersCon() {

		return new ResponseEntity<List<Dominoz>>(service.getAllOrdersCon(), HttpStatus.OK);

	}

	@GetMapping("/getSingleOrderCon/{id}")
	ResponseEntity<Dominoz> getSingleOrderProd(@PathVariable int id) {

		return new ResponseEntity<Dominoz>(service.getSingleOrderCon(id), HttpStatus.OK);

	}

	@DeleteMapping("/deleteSingleOrderCon/{id}")
	ResponseEntity<String> deleteSingleOrderCon(@PathVariable int id) {

		return new ResponseEntity<String>(service.deleteSingleOrderCon(id), HttpStatus.OK);

	}

	@PutMapping("/updateOrderCon/{id}")
	ResponseEntity<Object> updateOrderCon(@PathVariable int id, @RequestBody Dominoz dom) {

		return new ResponseEntity<Object>(service.updateOrderCon(id, dom), HttpStatus.CREATED);

	}

}
