package com.algomessiahs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.algomessiahs.beans.Responsepage;
import com.algomessiahs.beans.Transaction;
import com.algomessiahs.service.Transactionservice;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Transactioncontroller {
	
	@Autowired
	Transactionservice transactionservice;
	
	@GetMapping(value="transaction/{id}")
	public ResponseEntity<Object> gettransaction(@PathVariable("id") int cid) {
		Transaction cust = transactionservice.findBytransid(cid);
		if(cust!=null)
			return new ResponseEntity<>(cust,HttpStatus.OK);
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Responsepage("failure","Custodian Not Found"));
	}

}
