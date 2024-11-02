package com.ssw.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dominoz {
	@Id
	private int id;
	private String name;
	private long quantity;
	private double price;

	public Dominoz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dominoz(int id, String name, long quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
