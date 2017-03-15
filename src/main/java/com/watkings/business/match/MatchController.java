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

import com.dto.FootballerA;
import com.watkings.business.match.application.MatchService;
import com.watkings.business.match.application.MatchUpdateDto;
import com.watkings.domain.Match;
import com.watkings.domain.MatchRepository;

import java.util.ArrayList;

@RestController
public class MatchController {

	@Autowired
	MatchRepository matchRepository;
	@Autowired
	MatchService matchService;
	
	Log log = LogFactory.getLog(MatchController.class);
	//JEST
	@Transactional
	@RequestMapping(value="/update-match/{matchId}", method = RequestMethod.POST)
	public void updateMatch(@PathVariable int matchId,@RequestBody MatchUpdateDto matchUpdateDto){
		log.info("/update-match/{matchId}");
//		Match match = matchRepository.findById(matchId);
//		matchService.updateMatch(match, matchUpdateDto);
	}
	//JEST
	@RequestMapping(value="/add-match", method = RequestMethod.POST)
	public void addPlayer(@RequestBody MatchUpdateDto matchUpdateDto){
		log.info("/add-match");
//		Match match = new Match();
//		matchService.updateMatch(match, matchUpdateDto);
	}
	// tu sie cos psuje , ale nie moge dosc na szybko co to jest  
	//ogolnbie chce to wykorzytsac do listy meczy z kolejki -> beda wyswietlay sie druzyny i informacje
	@RequestMapping(value="/match-info/{matchId}", method = RequestMethod.GET)
	public Match getMatchInfo(@PathVariable Long matchId){
		log.info("/match-info/{matchId}");
		Match result = matchRepository.findById(matchId);
		return result;
	}


}
