package com.algomessiahs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algomessiahs.beans.Transaction;

@Repository
public interface Transactionrepo extends JpaRepository<Transaction, Integer> {

}
