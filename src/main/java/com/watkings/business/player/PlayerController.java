package com.watkings.business.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.domain.ScorersCassification;
import com.watkings.domain.ScorersCassificationRepository;

@RestController
@RequestMapping("/player")
public class PlayerController {
	
	@Autowired
	ScorersCassificationRepository scorersRepo;
	
	@RequestMapping(value="/scorers-classification/{leagueId}", method = RequestMethod.GET)
	public List<ScorersCassification> scorersList(@PathVariable int leagueId){
		return scorersRepo.findByLeagueIdOrderByBramkiDesc(leagueId);
	}	
}
