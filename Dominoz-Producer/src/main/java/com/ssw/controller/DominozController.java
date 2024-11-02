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
import com.ssw.service.Dominozservice;

@RestController
@RequestMapping("/dominoz-api")
public class DominozController {

	@Autowired
	private Dominozservice service;

	@PostMapping("/saveOrderProd")
	ResponseEntity<String> saveOrderProd(@RequestBody Dominoz dom) {

		return new ResponseEntity<String>(service.saveOrderProd(dom), HttpStatus.CREATED);

	}

	@GetMapping("/getAllOdersProd")
	ResponseEntity<List<Dominoz>> getAllOdersProd() {

		return new ResponseEntity<List<Dominoz>>(service.getAllOdersProd(), HttpStatus.OK);

	}

	@GetMapping("/getSingleOrderProd/{id}")
	ResponseEntity<Dominoz> getSingleOrderProd(@PathVariable int id) {

		return new ResponseEntity<Dominoz>(service.getSingleOrderProd(id), HttpStatus.OK);

	}

	@DeleteMapping("/deleteSingleOrderProd/{id}")
	ResponseEntity<String> deleteSingleOrderProd(@PathVariable int id) {

		return new ResponseEntity<String>(service.deleteSingleOrderProd(id), HttpStatus.OK);

	}

	@PutMapping("/updateOrderProd/{id}")
	ResponseEntity<Object> updateOrderProd(@PathVariable int id, @RequestBody Dominoz dom) {

		return new ResponseEntity<Object>(service.updateOrderProd(id,dom), HttpStatus.OK);

	}

	
	
}
