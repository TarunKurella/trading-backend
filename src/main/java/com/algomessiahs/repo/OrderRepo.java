package com.algomessiahs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algomessiahs.beans.Order;

public interface OrderRepo extends JpaRepository<Order,String> {

}
