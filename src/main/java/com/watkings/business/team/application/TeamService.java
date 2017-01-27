package com.watkings.business.team.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.watkings.domain.Player;
import com.watkings.domain.PlayerRepository;
import com.watkings.domain.TeamRepository;

@Component
public class TeamService {
	@Autowired
	TeamRepository teamRepository;
	
	@Autowired
	PlayerRepository platerRepository;

	public List<Player> getPlayersList(int teamId) {
		return platerRepository.getTeamPlayers(teamId);
	}
	
	

}
