package com.watkings.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefereeRepository extends CrudRepository<Referee, Long> {

	public List<Referee> findAll();

	@Query("select r from Referee r order by RAND() LIMIT 1")
	public Referee getRandomReferee();	

}