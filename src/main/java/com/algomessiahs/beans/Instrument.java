package com.algomessiahs.beans;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "instruments")
public class Instrument {
	@Id
	String id;
	String name;
	String facevalue;
	LocalDateTime expiry_date;
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
	public String getFaceValue() {
		return facevalue;
	}
	public void setFaceValue(String faceValue) {
		this.facevalue = faceValue;
	}
	public LocalDateTime getExpiryDate() {
		return expiry_date;
	}
	public void setExpiryDate(LocalDateTime expiryDate) {
		this.expiry_date = expiryDate;
	}
	@Override
	public String toString() {
		return "Instrument [id=" + id + ", name=" + name + ", faceValue=" + facevalue + ", expiryDate=" + expiry_date
				+ "]";
	}
	public Instrument(String id, String name,String faceValue, LocalDateTime expiryDate) {
		super();
		this.id = id;
		this.name = name;
		this.facevalue = faceValue;
		this.expiry_date = expiryDate;
	}
	public Instrument() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
