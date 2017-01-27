package com.watkings.business.league;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/league")
public class LeagueController {
	
//	@Autowired
//	LeagueService leagueService;
	
	@RequestMapping("/table")
	//"Tabela ligowa dla ligi o podanym ID")
	public String getLeagueTable(){
		String result = "Tabela ligi "; 
		return result;
	}
	
}
