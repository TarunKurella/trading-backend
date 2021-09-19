package com.algomessiahs.beans;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Order")
public class Order {
	@Id
	int id;
	String client_id;
	String instrument_id;
	double price;
	int quantity;
	String type;
	LocalDateTime time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getInstrument_id() {
		return instrument_id;
	}
	public void setInstrument_id(String instrument_id) {
		this.instrument_id = instrument_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public Order(int id, String client_id, String instrument_id, double price, int quantity, String type,
			LocalDateTime time) {
		super();
		this.id = id;
		this.client_id = client_id;
		this.instrument_id = instrument_id;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
		this.time = time;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
