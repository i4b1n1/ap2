package com.watkings.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MatchByTeamRepository extends CrudRepository<MatchByTeam, Long> {

	public List<MatchByTeam> findByTeamId(Long matchId);

}