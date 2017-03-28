package com.watkings.business.match.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.watkings.domain.Court;
import com.watkings.domain.CourtRepository;
import com.watkings.domain.Match;
import com.watkings.domain.MatchEvent;
import com.watkings.domain.MatchEventRepository;
import com.watkings.domain.MatchRepository;
import com.watkings.domain.PlayerRepository;
import com.watkings.domain.RefereeRepository;
import com.watkings.domain.Results;
import com.watkings.domain.ResultsRepository;
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
	@Autowired 
	ResultsRepository resultsRepository;	
	@Autowired
	MatchEventRepository matchEventRepository;
	@Autowired
	PlayerRepository playerRepository;

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
		
		matchRepository.save(match);
	}

	public MatchInfoDto getMatchInfo(Match match) {	
	
		Results result = resultsRepository.findByMatchId(match.getId().intValue());
		List<String> scorersList = getMatchScorersList(match);
		Court court =  courtRepository.findById(match.getCourtId());
		
		MatchInfoDto matchInfoDto = toDto(result, scorersList, match, court);
		
	return matchInfoDto;
	}

	private MatchInfoDto toDto(Results result, List<String> scorersList, Match match, Court court) {
		MatchInfoDto matchInfoDto = new MatchInfoDto();
		
		if(court!=null){
			matchInfoDto.setCourtAddress(court.getAddress());
			matchInfoDto.setCourtName(court.getName());
		}
		if(result!=null){
			matchInfoDto.setMatchweekNumber(result.getMatchwekkNumber());
			matchInfoDto.setTeam1Name(result.getTeamHomeName());
			matchInfoDto.setTeam2Name(result.getTeamAwayName());
			matchInfoDto.setTeam1Result(result.getGoalsHome().toString());
			matchInfoDto.setTeam2Result(result.getGoalsAway().toString());
		}
		if(scorersList!=null)
			matchInfoDto.setScorersList(scorersList);
		if(match.getMatchDate()!=null)
		matchInfoDto.setMatchDate(match.getMatchDate().toString());
		
		return matchInfoDto;
	}

	private List<String> getMatchScorersList(Match match) {
		List<Long> scorersIdList = matchEventRepository.findMatchScorers(match.getId().intValue());
		List<String> scorersNamesList = playerRepository.getNamesByIds(scorersIdList);
		return scorersNamesList;
	}

	public void addResult(int matchId, EventDto eventDto) {
		MatchEvent matchEvent = new MatchEvent();
		
		matchEvent.setMatchId(matchId);
		if(eventDto.getEventTypeId()!=null)
			matchEvent.setEventTypeId(Integer.parseInt(eventDto.getEventTypeId()));
		if(eventDto.getPlayerId()!=null)
			matchEvent.setPlayerId(Integer.parseInt(eventDto.getPlayerId()));
		if(eventDto.getTeamId()!=null)
			matchEvent.setTeamId(Integer.parseInt(eventDto.getTeamId()));
		if(eventDto.getEventMinute()!=null)
			matchEvent.setEventMinute(Integer.parseInt(eventDto.getEventMinute()));
		
		matchEventRepository.save(matchEvent);
		
	}
}
