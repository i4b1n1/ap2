package com.watkings.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

	public List<Player> findAll();
	
	@Query("select p from Player p where p.team.id = :teamId")
	public List<Player> getTeamPlayers(@Param("teamId")int teamId);
	

}