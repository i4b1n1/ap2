package com.watkings.business.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	

	@RequestMapping(value="/players/list/{id}", method = RequestMethod.GET)
	public List<Player> getTeamPlayers(@PathVariable int id) {
		List<Player> result = playerRepository.getTemSquad(id);
		return result;
	}
	
	@Transactional
	@RequestMapping(value="/update-team/{teamId}", method = RequestMethod.POST)
	public void updatePlayer(@PathVariable Long teamId,@RequestBody TeamUpdateDto teamUpdateDto){
		Team team = teamRepository.findById(teamId);
		teamService.updateTeam(team, teamUpdateDto);
	}
	
	@RequestMapping(value="/add-team", method = RequestMethod.POST)
	public void addPlayer(@RequestBody TeamUpdateDto teamUpdateDto){
		Team team = new Team();
		teamService.updateTeam(team, teamUpdateDto);
	}
	
	@RequestMapping(value="/team-info/{teamId}", method = RequestMethod.GET)
	public Team teamInfo(@PathVariable Long teamId){
		Team result = teamRepository.findById(teamId); 
		return result;
	}

}
