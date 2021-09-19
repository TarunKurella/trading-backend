package com.algomessiahs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algomessiahs.beans.AuthRequest;
import com.algomessiahs.beans.Client;
import com.algomessiahs.beans.Clients;
import com.algomessiahs.beans.Custodian;
import com.algomessiahs.beans.Instrument;
import com.algomessiahs.beans.Order;
import com.algomessiahs.beans.Responsepage;
import com.algomessiahs.service.CustodianService;
import com.algomessiahs.util.JwtUtil;

@CrossOrigin(origins = "http://localhost:4200")
@RestController()
public class CustodianController {
	
	@Autowired
	CustodianService custodianservice;
	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@GetMapping(value="/")
	public String welcome() {
		return "Welcome";
	}

	@PostMapping(value="/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));

		} catch (Exception e) {
			throw new Exception("Invalid Username / Password");
		}
		return jwtUtil.generateToken(authRequest.getUsername());
	}

	
	@GetMapping(value="custodian/{id}")
	public ResponseEntity<Object> getCustodian(@PathVariable("id") String cid) {
		Custodian cust = custodianservice.findBycustid(cid);
		if(cust!=null)
			return new ResponseEntity<>(cust,HttpStatus.OK);
		else
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Responsepage("failure","Custodian Not Found"));
	}
	@GetMapping(value="client/{id}")
	public Client getClient(@PathVariable("id") String cid) {
		Client cust = custodianservice.findByclientid(cid);
		
			return cust;
		
	}
	
	@GetMapping(value="clients/{id}")
	public List<Clients> getClients(@PathVariable("id") String id) {
		
		List<Clients> cust = custodianservice.findAllclient(id);
		
		return cust;
		
	}
	
	@GetMapping(value="instrument/{id}")
	public Instrument getInstrument(@PathVariable("id") String id) {
		Instrument ins=custodianservice.findByinsid(id);
		return ins;
	
	}
	
	@GetMapping(value="instruments")
	public List<Instrument> getInstruments() {
		
		List<Instrument> cust = custodianservice.findAllInstruments();
		
		return cust;
		
	}
	@PostMapping(value="order")
	public Order addOrder(@RequestBody Order order) {
		return custodianservice.addOrder(order);
	}


}
