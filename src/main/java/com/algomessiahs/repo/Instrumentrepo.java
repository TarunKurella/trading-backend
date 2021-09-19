package com.algomessiahs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algomessiahs.beans.Instrument;

@Repository
public interface Instrumentrepo extends JpaRepository<Instrument, String> {

}
