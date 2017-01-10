package com.usluga1.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TestowaRepository extends CrudRepository<Testowa, Long> {

	public Testowa findById(@Param("id") Long id);
	//public List<Testowa> findByImieAndId(@Param("imie") String imie);
	public List<Testowa> findAll();
	
	  @Query("select nazwisko from Testowa t where t.id = 0")
	  String findOczkowicz();
	

}
