package com.algomessiahs.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "custodian")
public class Custodian {
	@Id
	String id;
	String name;
	
	public Custodian(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "custodian [id=" + id + ", name=" + name + "]";
	}
	public Custodian() {
		super();
		// TODO Auto-generated constructor stub
	}
	
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

}

