package com.watkings.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.watkings.domain.Match;



@Repository
public interface MatchRepository extends CrudRepository<Match, Long> {

	public List<Match> findAll();

	public Match findById(int matchId);	

}