package com.watkings.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MatchRepository extends CrudRepository<Match, Long> {


//	public List<Match> findByLeagueIdAndIsFinished(Long leagueId,boolean isFinished);	
	public Match findById(Long matchId);
}