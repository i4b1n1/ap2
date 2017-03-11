package com.watkings.business.league;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.domain.LeagueTable;
import com.watkings.domain.LeagueTableRepository;
import com.watkings.domain.Results;
import com.watkings.domain.ResultsRepository;


@RestController
public class LeagueController {
	
	@Autowired
	LeagueTableRepository leagueTablerepo;
	
	@Autowired
	ResultsRepository resultsRepo;
	
	@RequestMapping(value="/table/{teamId}", method=RequestMethod.GET)
	//"Tabela ligowa dla ligi o podanym ID")
	public List<LeagueTable> getLeagueTable(@PathVariable int teamId){
		return leagueTablerepo.findByTeamId(teamId);
	}
	
	
	@RequestMapping(value="results/last-matchweek")
	//wyniki ostatniej kolejki
	public List<Results> lastMatchweekResults(){
		return resultsRepo.getLastMatchweekResults();
	}
}
