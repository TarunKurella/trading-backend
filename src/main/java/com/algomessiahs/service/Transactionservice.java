package com.algomessiahs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algomessiahs.beans.Instrument;
import com.algomessiahs.beans.Transaction;
import com.algomessiahs.repo.Transactionrepo;

@Service
public class Transactionservice {
	
	@Autowired
	Transactionrepo trasactionrepo;
	
	public Transaction findBytransid(int id) {
		java.util.Optional<Transaction> optcust = trasactionrepo.findById(id);
		if(optcust.isPresent())
		{
			return optcust.get();
		}
		else
			return null;
	}

}
