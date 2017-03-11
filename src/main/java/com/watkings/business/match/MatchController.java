package com.watkings.business.match;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.business.match.application.MatchService;
import com.watkings.business.match.application.MatchUpdateDto;
import com.watkings.domain.Match;
import com.watkings.domain.MatchRepository;

@RestController
public class MatchController {

	@Autowired
	MatchRepository matchRepository;
	@Autowired
	MatchService matchService;
	
	Log log = LogFactory.getLog(MatchController.class);
	//					url = 'http://localhost:2990/update-match/' + idMecz.value + "/"+ team1Mecz.value + "/"+ team2Mecz.value + "/"+ dataMecz.value + "/"+ courtMecz.value + "/"+ reffereMecz.value) .
	@Transactional
	@RequestMapping(value="/update-match/{matchId}", method = RequestMethod.POST)
	public void updateMatch(@PathVariable Long matchId,@RequestBody MatchUpdateDto matchUpdateDto){
		Match match = matchRepository.findById(matchId);
		matchService.updateMatch(match, matchUpdateDto);
	}
	//					url = 'http://localhost:2990/add-match/' +  team1Mecz.value + "/"+ team2Mecz.value + "/"+ dataMecz.value + "/"+ courtMecz.value + "/"+ reffereMecz.value) .
	@RequestMapping(value="/add-match", method = RequestMethod.POST)
	public void addPlayer(@RequestBody MatchUpdateDto matchUpdateDto){
		Match match = new Match();
		matchService.updateMatch(match, matchUpdateDto);
	}
	
	@RequestMapping(value="/match-info/{matchId}", method = RequestMethod.GET)
	public Match getMatchInfo(@PathVariable Long matchId){
		Match result = matchRepository.findById(matchId);
		return result;
	}
	
	
	//Ponizej: dodaj wydarzenie meczowe(trzeba dodac)
	//				url = 'http://localhost:2990/insert/wynik/' + idEvent.value + "/" + idTeamuEvent.value + "/"+ minutaEvent.value + "/"+ typEvent.value + "/"+ zawodnikEvent.value + "/"+ wartoscEvent.value + "/" + zawodnikEvent.value).

	
	
}
