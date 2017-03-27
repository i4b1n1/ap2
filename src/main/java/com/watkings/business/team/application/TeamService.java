package com.watkings.business.team.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.watkings.domain.PlayerRepository;
import com.watkings.domain.Team;
import com.watkings.domain.TeamRepository;

@Component
public class TeamService {
	@Autowired
	TeamRepository teamRepository;
	@Autowired
	PlayerRepository playerRepository;
	public void updateTeam(Team team, TeamUpdateDto teamUpdateDto) {
		
//		if(teamUpdateDto.getFaundationDate()!=null)
//			team.setFaundationDate(teamUpdateDto.getFaundationDate());
//		if(teamUpdateDto.getName()!=null)
//			team.setName(teamUpdateDto.getName());
//		if(teamUpdateDto.getCapitain()!=null)
//			team.setPlayer(playerRepository.findById(teamUpdateDto.getCapitain().intValue()));
//		if(teamUpdateDto.getLeagueId()!=null)
//		team.setLeagueId(teamUpdateDto.getLeagueId());
		
		teamRepository.save(team);

	}
	public List<TeamBasicDto> getTeamsByLeague(int teamId) {
		List<Team> teamsList = teamRepository.findByLeagueId(new Long(teamId));
		List<TeamBasicDto> teamsDtoList  = new ArrayList<TeamBasicDto>();
		
		for(Team team: teamsList){
			teamsDtoList.add(new TeamBasicDto(team.getId(), team.getName()));
		}
		
		return teamsDtoList;
	}

	
	

}
