package com.watkings.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultsRepository extends CrudRepository<Results, Long> {

	public List<Results> findAll();
	
	public List<Results> findByMatchweekNumberAndLeagueIdOrderByMatchId(int matchId, int leagueId);

	@Query(value="select * from results r where r.MATCHWEEK_NUMBER = (select max(MATCHWEEK_NUMBER) from results)", nativeQuery= true)
	public List<Results> getLastMatchweekResults();	

}