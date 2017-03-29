package com.watkings.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScorersCassificationRepository extends CrudRepository<ScorersCassification, Long>  {
	
	public List<ScorersCassification> findAll();

	public List<ScorersCassification> findByLeagueIdOrderByBramkiDesc(int leagueId);	
}
