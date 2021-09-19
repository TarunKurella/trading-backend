package com.algomessiahs.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.algomessiahs.beans.Client;
@Repository
public interface Clientrepo extends JpaRepository<Client, String> {
	
	@Query("SELECT id,name FROM client  WHERE cust_id=:id1")
	public List<Object[]> getAll(@Param("id1") String id1);
	
}
