package com.watkings.business.match.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.watkings.domain.Match;
import com.watkings.domain.MatchRepository;

@Component
public class MatchService {
	
	@Autowired
	MatchRepository matchRepository;

	public void updateMatch(Match match, MatchUpdateDto matchUpdateDto) { 
		if(matchUpdateDto.getCourt()!=null)
			match.setCourt(matchUpdateDto.getCourt());
		if(matchUpdateDto.getIsFinished()!=null)
			match.setIsFinished(matchUpdateDto.getIsFinished().booleanValue());
		if(matchUpdateDto.getMatchDate()!=null)
			match.setMatchDate(matchUpdateDto.getMatchDate());
		if(matchUpdateDto.getReferee()!=null)
			match.setReferee(matchUpdateDto.getReferee());
		if(matchUpdateDto.getTeam1()!=null)
			match.setTeam1(matchUpdateDto.getTeam1());
		if(matchUpdateDto.getTeam2()!=null)
			match.setTeam1(matchUpdateDto.getTeam2());
		
	}

}
