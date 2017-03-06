package com.watkings.business.match.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.watkings.domain.CourtRepository;
import com.watkings.domain.Match;
import com.watkings.domain.MatchRepository;
import com.watkings.domain.RefereeRepository;
import com.watkings.domain.TeamRepository;

@Component
public class MatchService {
	
	@Autowired
	MatchRepository matchRepository;
	
	@Autowired
	CourtRepository courtRepository;
	
	@Autowired
	RefereeRepository refereeRepository;
	
	@Autowired
	TeamRepository teamRepository;

	public void updateMatch(Match match, MatchUpdateDto matchUpdateDto) { 
		match.setCourt(courtRepository.getRandomCourt());
		match.setIsFinished(false);
		if(matchUpdateDto.getMatchDate()!=null)
			match.setMatchDate(matchUpdateDto.getMatchDate());
		match.setReferee(refereeRepository.getRandomReferee());
		if(matchUpdateDto.getTeam1Id()!=null)
			match.setTeam1(teamRepository.findById(matchUpdateDto.getTeam1Id()));
		if(matchUpdateDto.getTeam2Id()!=null)
			match.setTeam2(teamRepository.findById(matchUpdateDto.getTeam2Id()));
		
	}

}
