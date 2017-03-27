package com.watkings.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MatchEventRepository extends CrudRepository<MatchEvent, Long> {

	public List<MatchEvent> findAll();

	@Query(value="select PLAYER_ID from match_event where MATCH_ID = ?1", nativeQuery=true)
	public List<Long> findMatchScorers(int intValue);	

}