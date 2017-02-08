package com.watkings.domain;

import java.util.List;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueTableRepository extends CrudRepository<LeagueTable, Long>  {

	public List<LeagueTable> findAll();

	public List<LeagueTable> findByTeamId(int teamId);
}
