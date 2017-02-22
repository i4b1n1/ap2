package com.watkings.business.match;

import java.util.ArrayList;
import java.util.List;

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
import com.dto.MatchA;
import com.dto.TeamA;
import com.front.FrontController;
import com.watkings.business.match.application.MatchService;
import com.watkings.business.match.application.MatchUpdateDto;
import com.watkings.domain.Match;
import com.watkings.domain.MatchRepository;

@RestController
public class MatchController {

	@Autowired
	MatchRepository matchRepository;
	@Autowired
	MatchService matchService;
	
	Log log = LogFactory.getLog(MatchController.class);
	
	@Transactional
	@RequestMapping(value="/update-match/{matchId}", method = RequestMethod.POST)
	public void updateMatch(@PathVariable Long matchId,@RequestBody MatchUpdateDto matchUpdateDto){
		Match match = matchRepository.findById(matchId);
		matchService.updateMatch(match, matchUpdateDto);
	}
	
	@RequestMapping(value="/add-match", method = RequestMethod.POST)
	public void addPlayer(@RequestBody MatchUpdateDto matchUpdateDto){
		Match match = new Match();
		matchService.updateMatch(match, matchUpdateDto);
	}
	
	@RequestMapping(value="/match-info/{matchId}", method = RequestMethod.GET)
	public Match getMatchInfo(@PathVariable Long matchId){
		Match result = matchRepository.findById(matchId);
		return result;
	}
	
	
	// wynik meczy w lidze
@RequestMapping(value = "/scoreMatchs/{leagueId}", method = RequestMethod.GET)
public List<MatchA> lastMatchs(@PathVariable("leagueId") String leagueId) {

	List<TeamA> listTeam = new ArrayList<TeamA>();
	List<FootballerA> listFootballer = new ArrayList<FootballerA>();
	listFootballer.add(new FootballerA(0, leagueId, leagueId, leagueId, "0", leagueId, leagueId));
	listFootballer.add(new FootballerA(1, "name1", "surname1", "team1", "0", "gracz", "brak"));
	listFootballer.add(new FootballerA(2, "name2", "surname1", "team1", "0", "gracz", "brak"));
	listFootballer.add(new FootballerA(3, "name3", "surname1", "team1", "0", "gracz", "brak"));
	listFootballer.add(new FootballerA(4, "name4", "surname1", "team1", "0", "gracz", "brak"));
	listFootballer.add(new FootballerA(5, "name5", "surname1", "team1", "0", "gracz", "brak"));
	listFootballer.add(new FootballerA(6, "name6", "surname1", "team1", "0", "gracz", "brak"));
	listFootballer.add(new FootballerA(7, "name7", "surname1", "team1", "0", "gracz", "brak"));
	listFootballer.add(new FootballerA(8, "name7", "surname1", "team1", "0", "gracz", "brak"));
	listFootballer.add(new FootballerA(9, "name9", "surname1", "team1", "0", "gracz", "brak"));

	listTeam.add(new TeamA(0, "1", "team1", "2", listFootballer));
	listTeam.add(new TeamA(1, "1", "team2", "1", listFootballer));
	listTeam.add(new TeamA(2, "1", "team3", "3", listFootballer));
	listTeam.add(new TeamA(3, "2", "team4", "2", listFootballer));
	listTeam.add(new TeamA(4, "2", "team5", "1", listFootballer));
	listTeam.add(new TeamA(5, "3", "team6", "1", listFootballer));
	listTeam.add(new TeamA(6, "3", "team7", "2", listFootballer));

	List<MatchA> listMatch = new ArrayList<MatchA>();
	listMatch.add(new MatchA(0, listTeam.get(1), listTeam.get(2), "2", "43-", "wtor-", leagueId));
	listMatch.add(new MatchA(1, listTeam.get(2), listTeam.get(3), "1", "47", "pon", leagueId));
	listMatch.add(new MatchA(2, listTeam.get(3), listTeam.get(4), "25", "44", "srodk", leagueId));
	listMatch.add(new MatchA(3, listTeam.get(4), listTeam.get(5), "26", "49", "wtor", leagueId));
	listMatch.add(new MatchA(4, listTeam.get(5), listTeam.get(6), "21", "45", "pzsz", "karzel7"));
	log.info("scoreMatchs   " +leagueId);
	return listMatch;
}

// data przyszlych meczy
		@RequestMapping(value = "/futureMatchs/{leagueId}", method = RequestMethod.GET)
		public List<MatchA> futureMatchs(@PathVariable("leagueId") String leagueId) {
		
			List<TeamA> listTeam = new ArrayList<TeamA>();
			List<FootballerA> listFootballer = new ArrayList<FootballerA>();
			listFootballer.add(new FootballerA(0, leagueId, leagueId, leagueId, "0", leagueId, leagueId));
			listFootballer.add(new FootballerA(1, "name1", "surname1", "team1", "0", "gracz", "brak"));
			listFootballer.add(new FootballerA(2, "name2", "surname1", "team1", "0", "gracz", "brak"));
			listFootballer.add(new FootballerA(3, "name3", "surname1", "team1", "0", "gracz", "brak"));
			listFootballer.add(new FootballerA(4, "name4", "surname1", "team1", "0", "gracz", "brak"));
			listFootballer.add(new FootballerA(5, "name5", "surname1", "team1", "0", "gracz", "brak"));
			listFootballer.add(new FootballerA(6, "name6", "surname1", "team1", "0", "gracz", "brak"));
			listFootballer.add(new FootballerA(7, "name7", "surname1", "team1", "0", "gracz", "brak"));
			listFootballer.add(new FootballerA(8, "name7", "surname1", "team1", "0", "gracz", "brak"));
			listFootballer.add(new FootballerA(9, "name9", "surname1", "team1", "0", "gracz", "brak"));
		
			listTeam.add(new TeamA(0, "1", leagueId, "2", listFootballer));
			listTeam.add(new TeamA(1, "1", leagueId, "1", listFootballer));
			listTeam.add(new TeamA(2, "1", leagueId, "3", listFootballer));
			listTeam.add(new TeamA(3, "2", leagueId, "2", listFootballer));
			listTeam.add(new TeamA(4, "2", leagueId, "1", listFootballer));
			listTeam.add(new TeamA(5, "3", leagueId, "1", listFootballer));
			listTeam.add(new TeamA(6, "3", leagueId, "2", listFootballer));
		
			List<MatchA> listMatch = new ArrayList<MatchA>();
		
			listMatch.add(new MatchA(0, listTeam.get(1), listTeam.get(2), "2", "43-", "wtor-", leagueId));
			listMatch.add(new MatchA(1, listTeam.get(2), listTeam.get(3), "1", "47", "pon", leagueId));
			listMatch.add(new MatchA(2, listTeam.get(3), listTeam.get(4), "25", "44", "srodk", leagueId));
			listMatch.add(new MatchA(3, listTeam.get(4), listTeam.get(5), "26", "49", "wtor", leagueId));
			listMatch.add(new MatchA(4, listTeam.get(5), listTeam.get(6), "21", "45", "pzsz", leagueId));
			log.info("futireMatch   " +leagueId);
			return listMatch;
		}
		
		
		@RequestMapping(value = "insert/przyszly/{nazwaT1}/{nazwaT2}/{data}/{liga}", method = RequestMethod.POST)
		public void insertPrzyszlyMecz(
				@PathVariable("nazwaT1") String nazwaT1, 
				@PathVariable("nazwaT2") String nazwaT2,
				@PathVariable("data") String data, 
				@PathVariable("liga") String liga) {
			log.info("insert przyszly " + nazwaT1 + " " + liga + " " + nazwaT2);
		}
		
		@RequestMapping(value = "insert/wynik/{nazwaT1}/{nazwaT2}/{data}/{wynik}/{liga}", method = RequestMethod.POST)
		public void insertWynik(
				@PathVariable("nazwaT1") String nazwaT1, 
				@PathVariable("nazwaT2") String nazwaT2,
				@PathVariable("data") String data, 
				@PathVariable("wynik") String wynik, 
				@PathVariable("liga") String liga) {
			log.info("insert wynik " + nazwaT1 + " " + liga + " " + nazwaT2);
		
		}
		
		@RequestMapping(value = "save/{id}/{team1name}/{team1score}/{team2name}/{team2score}/{date}/{liga}", method = RequestMethod.POST)
		public void updateData(
				@PathVariable("id") String id,
				@PathVariable("team1name") String team1name,
				@PathVariable("team1score") String team1score,
				@PathVariable("team2name") String team2name,
				@PathVariable("team2score") String team2score,
				@PathVariable("date") String date,
				@PathVariable("liga") String liga) {

			log.info("save" +  id+ team1name+team1score +team2name + team2score+ date+ liga);;
		};

}
