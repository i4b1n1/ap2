package com.watkings.business.player.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.watkings.domain.Player;
import com.watkings.domain.PlayerRepository;

@Component
public class PlayerService {
	
	@Autowired 
	PlayerRepository playerRepository;
	

	public void updatePlayer(Player player, PlayerUpdateDto playerUpdateDto) {
		
		if(playerUpdateDto.getName()!=null)
			player.setName(playerUpdateDto.getName());
		if(playerUpdateDto.getNationality()!=null)
			player.setNationality(playerUpdateDto.getNationality());
		if(playerUpdateDto.getPosition()!=null)
			player.setPosition(playerUpdateDto.getPosition());
		if(playerUpdateDto.getTeamId()!=null)
			player.setTeam(playerUpdateDto.getTeamId());
		
		playerRepository.save(player);
	}


}
