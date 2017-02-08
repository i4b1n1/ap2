package com.watkings.business.league;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.domain.LeagueTable;
import com.watkings.domain.LeagueTableRepository;


@RestController
@RequestMapping("/league")
public class LeagueController {
	
	@Autowired
	LeagueTableRepository repo;
	
	@RequestMapping(value="/table/{teamId}", method=RequestMethod.GET)
	//"Tabela ligowa dla ligi o podanym ID")
	public List<LeagueTable> getLeagueTable(@PathVariable int teamId){
		return repo.findByTeamId(teamId);
	}
	
	@RequestMapping(value="/results/{leagueId}/{matchweekNumber}")
	//wyniki dla podanej kolejki danej ligi
	public String leagueResults(@PathVariable String leagueId, @PathVariable String matchweekNumber){
		return "Wyniki dla ligi o id="+leagueId+"kolejki nr "+"matchweekNumber";
	}
}
