package com.watkings.business.match.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.watkings.domain.CourtRepository;
import com.watkings.domain.Match;
import com.watkings.domain.MatchRepository;
import com.watkings.domain.RefereeRepository;
import com.watkings.domain.TeamRepository;
import com.watkings.utils.ProjectDateFormat;

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
	
	@Autowired
	ProjectDateFormat dateFormat;

	public void updateMatch(Match match, MatchUpdateDto matchUpdateDto) { 
		match.setCourtId(courtRepository.getRandomCourt());
		match.setIsFinished(false);
		if(matchUpdateDto.getMatchDate()!=null)
			match.setMatchDate(matchUpdateDto.getMatchDate(dateFormat.getSimpleDateFormat()));
		match.setReferee(refereeRepository.getRandomReferee());
		if(matchUpdateDto.getTeam1Id()!=null)
			match.setTeam1(matchUpdateDto.getTeam1Id());
		if(matchUpdateDto.getTeam2Id()!=null)
			match.setTeam2(matchUpdateDto.getTeam2Id());
		
	}

}
