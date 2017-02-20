package com.front;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

	Log log = LogFactory.getLog(FrontController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage() {
		return "index";
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


	}
	
	@RequestMapping(value = "insert/team/{nazwa}/{liga}/{pozycja}", method = RequestMethod.POST)
	public void insertTeam(
			@PathVariable("nazwa") String nazwa,
			@PathVariable("liga") String liga,
			@PathVariable("pozycja") String pozycja) {
		log.info("--- " + nazwa + " " + liga + " " + pozycja);

	}

	@RequestMapping(value = "insert/przyszly/{nazwaT1}/{nazwaT2}/{data}/{liga}", method = RequestMethod.POST)
	public void insertPrzyszlyMecz(
			@PathVariable("nazwaT1") String nazwaT1, 
			@PathVariable("nazwaT2") String nazwaT2,
			@PathVariable("data") String data, 
			@PathVariable("liga") String liga) {

	}

	@RequestMapping(value = "insert/wynik/{nazwaT1}/{nazwaT2}/{data}/{wynik}/{liga}", method = RequestMethod.POST)
	public void insertWynik(
			@PathVariable("nazwaT1") String nazwaT1, 
			@PathVariable("nazwaT2") String nazwaT2,
			@PathVariable("data") String data, 
			@PathVariable("wynik") String wynik, 
			@PathVariable("liga") String liga) {

	}

	@RequestMapping(value = "insert/pilkarz/{imie}/{nazwisko}/{pozycja}/{kary}/{liga}", method = RequestMethod.POST)
	public void insertPilkarz(
			@PathVariable("imie") String imie, 
			@PathVariable("nazwisko") String nazwisko,
			@PathVariable("pozycja") String pozycja, 
			@PathVariable("kary") String kary,
			@PathVariable("liga") String liga) {

	}

	@RequestMapping(value = "/logging/{login}/{key}", method = RequestMethod.GET)
	public Map logging(
			@PathVariable("login") String login, 
			@PathVariable("key") String key) {

		Map<String, String> map = new HashMap<String, String>();
		// sprawdzenie czy dane logowania sa poprawnw, jesli tak to true
		log.info("\n login: " + login + " key: " + key);
		map.put("status", "true");
		return map;
	}

		// wynik meczy w lidze
	@RequestMapping(value = "/scoreMatchs/{leagueId}", method = RequestMethod.GET)
	public List<Match> lastMatchs(@PathVariable("leagueId") String leagueId) {

		List<Team> listTeam = new ArrayList<Team>();
		List<Footballer> listFootballer = new ArrayList<Footballer>();
		listFootballer.add(new Footballer(0, leagueId, leagueId, leagueId, "0", leagueId, leagueId));
		listFootballer.add(new Footballer(1, "name1", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(2, "name2", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(3, "name3", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(4, "name4", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(5, "name5", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(6, "name6", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(7, "name7", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(8, "name7", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(9, "name9", "surname1", "team1", "0", "gracz", "brak"));

		listTeam.add(new Team(0, "1", "team1", "2", listFootballer));
		listTeam.add(new Team(1, "1", "team2", "1", listFootballer));
		listTeam.add(new Team(2, "1", "team3", "3", listFootballer));
		listTeam.add(new Team(3, "2", "team4", "2", listFootballer));
		listTeam.add(new Team(4, "2", "team5", "1", listFootballer));
		listTeam.add(new Team(5, "3", "team6", "1", listFootballer));
		listTeam.add(new Team(6, "3", "team7", "2", listFootballer));

		List<Match> listMatch = new ArrayList<Match>();
		listMatch.add(new Match(0, listTeam.get(1), listTeam.get(2), "2", "43-", "wtor-", leagueId));
		listMatch.add(new Match(1, listTeam.get(2), listTeam.get(3), "1", "47", "pon", leagueId));
		listMatch.add(new Match(2, listTeam.get(3), listTeam.get(4), "25", "44", "srodk", leagueId));
		listMatch.add(new Match(3, listTeam.get(4), listTeam.get(5), "26", "49", "wtor", leagueId));
		listMatch.add(new Match(4, listTeam.get(5), listTeam.get(6), "21", "45", "pzsz", "karzel7"));

		return listMatch;
	}

	// data przyszlych meczy
	@RequestMapping(value = "/futureMatchs/{leagueId}", method = RequestMethod.GET)
	public List<Match> futureMatchs(@PathVariable("leagueId") String leagueId) {

		List<Team> listTeam = new ArrayList<Team>();
		List<Footballer> listFootballer = new ArrayList<Footballer>();
		listFootballer.add(new Footballer(0, leagueId, leagueId, leagueId, "0", leagueId, leagueId));
		listFootballer.add(new Footballer(1, "name1", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(2, "name2", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(3, "name3", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(4, "name4", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(5, "name5", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(6, "name6", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(7, "name7", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(8, "name7", "surname1", "team1", "0", "gracz", "brak"));
		listFootballer.add(new Footballer(9, "name9", "surname1", "team1", "0", "gracz", "brak"));

		listTeam.add(new Team(0, "1", leagueId, "2", listFootballer));
		listTeam.add(new Team(1, "1", leagueId, "1", listFootballer));
		listTeam.add(new Team(2, "1", leagueId, "3", listFootballer));
		listTeam.add(new Team(3, "2", leagueId, "2", listFootballer));
		listTeam.add(new Team(4, "2", leagueId, "1", listFootballer));
		listTeam.add(new Team(5, "3", leagueId, "1", listFootballer));
		listTeam.add(new Team(6, "3", leagueId, "2", listFootballer));

		List<Match> listMatch = new ArrayList<Match>();

		listMatch.add(new Match(0, listTeam.get(1), listTeam.get(2), "2", "43-", "wtor-", leagueId));
		listMatch.add(new Match(1, listTeam.get(2), listTeam.get(3), "1", "47", "pon", leagueId));
		listMatch.add(new Match(2, listTeam.get(3), listTeam.get(4), "25", "44", "srodk", leagueId));
		listMatch.add(new Match(3, listTeam.get(4), listTeam.get(5), "26", "49", "wtor", leagueId));
		listMatch.add(new Match(4, listTeam.get(5), listTeam.get(6), "21", "45", "pzsz", leagueId));

		return listMatch;
	}

}
