package com.watkings.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.watkings.domain.Match;



@Repository
public interface MatchRepository extends CrudRepository<Match, Long> {

	public List<Match> findAll();

	@Query(value="select * from match where id = ?1", nativeQuery=true)
	public Match findById(Long matchId);	

}