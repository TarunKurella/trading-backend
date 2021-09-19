package com.algomessiahs.beans;

public class Responsepage {
	private String message;
	private String description;
	public Responsepage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Responsepage(String message, String description) {
		super();
		this.message = message;
		this.description = description;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ResponsePage [message=" + message + ", description=" + description + "]";
	}

}