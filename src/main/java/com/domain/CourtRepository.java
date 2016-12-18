package com.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.usluga1.domain.Testowa;

@Repository
public interface CourtRepository extends CrudRepository<Court, Long> {

	public Court findById(@Param("id") Long id);
	public List<Court> findByName(@Param("name") String name);
	public List<Court> findAll();	

}