package com.watkings.business.match;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.business.match.application.EventDto;
import com.watkings.business.match.application.MatchInfoDto;
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
	//JEST
	@RequestMapping(value="/update-match/{matchId}", method = RequestMethod.POST)
	public void updateMatch(@PathVariable int matchId,@RequestBody MatchUpdateDto matchUpdateDto){
		log.info("/update-match/{matchId}");
		Match match = matchRepository.findById(new Long(matchId));
		matchService.updateMatch(match, matchUpdateDto);
	}
	//JEST
	@RequestMapping(value="/add-match", method = RequestMethod.POST)
	public void addPlayer(@RequestBody MatchUpdateDto matchUpdateDto){
		log.info("/add-match");
		Match match = new Match();
		matchService.updateMatch(match, matchUpdateDto);
	}

	//POPRAWIONE
	@RequestMapping(value="/match-info/{matchId}", method = RequestMethod.GET)
	public MatchInfoDto getMatchInfo(@PathVariable int matchId){
		log.info("/match-info/{matchId}");
		Long id = new Long(matchId);
		Match match = matchRepository.findById(id);
		if(match!=null)
			return matchService.getMatchInfo(match);
		else
			return new MatchInfoDto();
	}
	
	@RequestMapping(value="/add-result/{matchId}", method = RequestMethod.GET)
	public void addMatchResult(@PathVariable int matchId, @RequestBody EventDto eventDto){
		log.info("/add-result/{matchId}");
		matchService.addResult(matchId, eventDto);
	}

}
