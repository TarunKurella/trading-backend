package com.algomessiahs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.algomessiahs.beans.Client;
import com.algomessiahs.beans.Clients;
import com.algomessiahs.beans.Custodian;
import com.algomessiahs.beans.Instrument;
import com.algomessiahs.beans.Order;
import com.algomessiahs.repo.Clientrepo;
import com.algomessiahs.repo.CustodianRepository;
import com.algomessiahs.repo.Instrumentrepo;
import com.algomessiahs.repo.OrderRepo;

@Service
public class CustodianService implements UserDetailsService{
	
	@Autowired
	CustodianRepository custrepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	 Custodian custodian=custrepo.findById(username).get();
	 return new User(custodian.getId(), "yes123$", new ArrayList<>());
		
	}

	
	public Custodian findBycustid(String cid) {
		java.util.Optional<Custodian> optcust = custrepo.findById(cid);
		if(optcust.isPresent())
		{
			return optcust.get();
		}
		else
			return null;
	}
	@Autowired
	Clientrepo clientrepo;
	
	
	public Client findByclientid(String cid) {
		java.util.Optional<Client> optcust = clientrepo.findById(cid);
		if(optcust.isPresent())
		{
			return optcust.get();
		}
		else
			return null;
	}
	
	public List<Clients> findAllclient(String cid) {
		List<Object[]> list = clientrepo.getAll(cid);
		
		List<Clients> cl=new ArrayList<Clients>();
		for (Object ob[]:list) {
		cl.add(new Clients(String.valueOf(ob[0]),String.valueOf(ob[1])));
			
		}
		
		return cl;
	}
	@Autowired
	Instrumentrepo instrumentrepo;
	
	public Instrument findByinsid(String cid) {
		Optional<Instrument> optcust = instrumentrepo.findById(cid);
		if(optcust.isPresent())
		{
			return optcust.get();
		}
		else
			return null;
	}
	public List<Instrument> findAllInstruments() {
		List<Instrument> Clients = instrumentrepo.findAll();
		
			return Clients;
	}
	@Autowired
	OrderRepo orderrepo;
	public Order addOrder(Order order) {
		Order o=orderrepo.save(order);
		return o;
	}

    

}
