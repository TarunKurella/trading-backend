package com.algomessiahs.beans;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	int id;
	String orderType;
	@ManyToOne
	@JoinColumn(name = "client_id")
	Client client;
	@ManyToOne
	@JoinColumn(name = "instrument_id")
	Instrument instrument;
	double price;
	int quantity;
	LocalDateTime time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantiy() {
		return quantity;
	}
	public void setQuantiy(int quantiy) {
		this.quantity = quantiy;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", orderType=" + orderType + ", client=" + client + ", instrument="
				+ instrument + ", price=" + price + ", quantiy=" + quantity + ", time=" + time + "]";
	}
	public Transaction(int id, String orderType, Client client, Instrument instrument, double price, int quantiy,
			LocalDateTime time) {
		super();
		this.id = id;
		this.orderType = orderType;
		this.client = client;
		this.instrument = instrument;
		this.price = price;
		this.quantity = quantiy;
		this.time = time;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
	
