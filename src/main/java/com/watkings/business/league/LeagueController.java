package com.watkings.business.league;



import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.watkings.business.player.PlayerController;
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
	
	Log log = LogFactory.getLog(LeagueController.class);
	//jest
	@RequestMapping(value="/table/{leagueId}", method=RequestMethod.GET)
	//"Tabela ligowa dla ligi o podanym ID")
	public List<LeagueTable> getLeagueTable(@PathVariable int leagueId){
		log.info("/table/{teamId}");
		return leagueTablerepo.findByLeagueId(leagueId);//tutaj zmienilel z team id na ligaId
	}
	
	//jest
	@RequestMapping(value="results/last-matchweek/{leagueId}")
	public List<Results> lastMatchweekResults(@PathVariable int leagueId){
		log.info("/results/last-matchweek  " + leagueId);
		return resultsRepo.getLastMatchweekResults();
	}
}
