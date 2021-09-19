package com.algomessiahs.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "client")
public class Client {
	@Id
	String id;
	String name;
    @ManyToOne
    @JoinColumn(name = "cust_id")
    Custodian custodian;
    double transactionlimit;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Custodian getCustodian() {
		return custodian;
	}
	public void setCustodian(Custodian custodian) {
		this.custodian = custodian;
	}
	public double getTransactionLimit() {
		return transactionlimit;
	}
	public void setTransactionLimit(double transactionLimit) {
		this.transactionlimit = transactionLimit;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", custodian=" + custodian + ", transactionLimit="
				+ transactionlimit + "]";
	}
	public Client(String id, String name, Custodian custodian, double transactionLimit) {
		super();
		this.id = id;
		this.name = name;
		this.custodian = custodian;
		this.transactionlimit = transactionLimit;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
   

}
