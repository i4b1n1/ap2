package com.watkings.business.match;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.business.match.application.MatchService;
import com.watkings.business.match.application.MatchUpdateDto;
import com.watkings.business.player.application.PlayerUpdateDto;
import com.watkings.domain.Match;
import com.watkings.domain.MatchRepository;
import com.watkings.domain.Player;

@RestController
@RequestMapping(value="/match")
public class MatchController {

	@Autowired
	MatchRepository matchRepository;
	@Autowired
	MatchService matchService;
	
	@Transactional
	@RequestMapping(value="/update-match/{matchId}")
	public void updateMatch(@PathVariable int matchId,@RequestBody MatchUpdateDto matchUpdateDto){
		Match match = matchRepository.findById(matchId);
		matchService.updateMatch(match, matchUpdateDto);
	}
	
	@RequestMapping(value="/add-match")
	public void addPlayer(@RequestBody MatchUpdateDto matchUpdateDto){
		Match match = new Match();
		matchService.updateMatch(match, matchUpdateDto);
	}
	
}
