package com.algomessiahs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algomessiahs.beans.Custodian;

@Repository
public interface CustodianRepository extends JpaRepository<Custodian, String> {

}
