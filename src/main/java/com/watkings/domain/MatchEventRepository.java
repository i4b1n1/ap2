package com.watkings.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface MatchEventRepository extends CrudRepository<MatchEvent, Long> {

	public List<MatchEvent> findAll();	

}