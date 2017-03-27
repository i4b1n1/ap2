package com.watkings.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

	public List<Player> findAll();
	
	@Query(value="select * from player p where p.TEAM_ID = ?1",nativeQuery=true)
	public List<Player> getTemSquad(int teamId);

	public Player findById(int playerId);

	@Query(value="select NAME from player p where p.TEAM_ID in (?1)",nativeQuery=true)
	public List<String> getNamesByIds(List<Long> scorersIdList);
		
}