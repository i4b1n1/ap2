package com.watkings.business.player;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.login.LoginController;
import com.watkings.business.player.application.PlayerService;
import com.watkings.business.player.application.PlayerUpdateDto;
import com.watkings.domain.Player;
import com.watkings.domain.PlayerRepository;
import com.watkings.domain.ScorersCassification;
import com.watkings.domain.ScorersCassificationRepository;

@RestController
public class PlayerController {
	
	@Autowired
	ScorersCassificationRepository scorersRepository;
	@Autowired
	PlayerService playerService;
	@Autowired 
	PlayerRepository playerRepository;
	Log log = LogFactory.getLog(PlayerController.class);

	//jest
	@RequestMapping(value="/scorers-classification/{leagueId}", method = RequestMethod.GET)
	public List<ScorersCassification> scorersList(@PathVariable int leagueId){
		log.info("/scorers-classification/{leagueId}");
		return scorersRepository.findByLeagueIdOrderByBramkiDesc(leagueId);
	}
	
	//JEST
	@Transactional
	@RequestMapping(value="/update-player/{playerId}", method = RequestMethod.POST)
	public void updatePlayer(@PathVariable int playerId,@RequestBody PlayerUpdateDto playerUpdateDto){
		//String test = playerUpdateDto.getName() +" " + playerUpdateDto.getPosition() + " " + playerUpdateDto.getTeamId().toString() + " " + playerUpdateDto.getNationality();
		log.info("/update-player/{}");
		Player player = playerRepository.findById(playerId);
		playerService.updatePlayer(player, playerUpdateDto);
	}
	//JEST
	@RequestMapping(value="/add-player", method = RequestMethod.POST)
	public void addPlayer(@RequestBody PlayerUpdateDto playerUpdateDto){
		//String test = playerUpdateDto.getName() +" " + playerUpdateDto.getPosition() + " " + playerUpdateDto.getTeamId().toString() + " " + playerUpdateDto.getNationality();
		log.info("/add-player  {}" );
		Player player = new Player();
		playerService.updatePlayer(player, playerUpdateDto);
	}
	
	
}
