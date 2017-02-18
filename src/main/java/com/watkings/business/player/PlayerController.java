package com.watkings.business.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.business.player.application.PlayerService;
import com.watkings.business.player.application.PlayerUpdateDto;
import com.watkings.domain.Player;
import com.watkings.domain.PlayerRepository;
import com.watkings.domain.ScorersCassification;
import com.watkings.domain.ScorersCassificationRepository;

@RestController
@RequestMapping("/player")
public class PlayerController {
	
	@Autowired
	ScorersCassificationRepository scorersRepository;
	@Autowired
	PlayerService playerService;
	@Autowired 
	PlayerRepository playerRepository;
	
	
	@RequestMapping(value="/scorers-classification/{leagueId}", method = RequestMethod.GET)
	public List<ScorersCassification> scorersList(@PathVariable int leagueId){
		return scorersRepository.findByLeagueIdOrderByBramkiDesc(leagueId);
	}
	
	@Transactional
	@RequestMapping(value="/update-player/{playerId}", method = RequestMethod.POST)
	public void updatePlayer(@PathVariable int playerId,@ModelAttribute(value="playerUpdateDto") PlayerUpdateDto playerUpdateDto){
		Player player = playerRepository.findById(playerId);
		playerService.updatePlayer(player, playerUpdateDto);
	}
	
	@RequestMapping(value="/add-player", method = RequestMethod.POST)
	public void addPlayer(@ModelAttribute(value="playerUpdateDto") PlayerUpdateDto playerUpdateDto){
		Player player = new Player();
		playerService.updatePlayer(player, playerUpdateDto);
	}
	
}
