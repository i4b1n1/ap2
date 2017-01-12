package com.domain;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface CourtRepository extends CrudRepository<Court, Long> {

	public Court findById(@Param("id") Long id);
	public List<Court> findByName(@Param("name") String name);
	public List<Court> findAll();	

}