package com.watkings.business.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.business.player.application.PlayerUpdateDto;
import com.watkings.business.team.application.TeamService;
import com.watkings.business.team.application.TeamUpdateDto;
import com.watkings.domain.Player;
import com.watkings.domain.PlayerRepository;
import com.watkings.domain.Team;
import com.watkings.domain.TeamRepository;


@RestController
@RequestMapping("/team")
public class TeamController {

	@Autowired
	TeamService service;
	@Autowired
	PlayerRepository playerRepository;
	@Autowired
	TeamRepository teamRepository;
	@Autowired
	TeamService teamService;
	

	@RequestMapping("/players/list/{id}")
	public List<Player> getTeamPlayers(@PathVariable int id) {
		List<Player> result = playerRepository.getTemSquad(id);
		return result;
	}
	
	@Transactional
	@RequestMapping(value="/update-team/{teamId}")
	public void updatePlayer(@PathVariable int teamId,@RequestBody TeamUpdateDto teamUpdateDto){
		Team team = teamRepository.findById(teamId);
		teamService.updateTeam(team, teamUpdateDto);
	}
	
	@RequestMapping(value="/add-team")
	public void addPlayer(@RequestBody TeamUpdateDto teamUpdateDto){
		Team team = new Team();
		teamService.updateTeam(team, teamUpdateDto);
	}

}
