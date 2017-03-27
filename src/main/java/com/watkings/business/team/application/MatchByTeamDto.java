package com.watkings.business.team.application;

public class MatchByTeamDto {

	private String matchId;
	private String date;
	private String rival;
	private String roundNumber;

	public MatchByTeamDto(String matchId, String date, String rival,String roundNumber) {
		this.matchId = matchId;
		this.date = date;
		this.rival = rival;
		this.roundNumber = roundNumber;
	}
	
	public String getRoundNumber() {
		return roundNumber;
	}

	public void setRoundNumber(String roundNumber) {
		this.roundNumber = roundNumber;
	}
	
	public String getMatchId() {
		return matchId;
	}
	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTeamHome() {
		return rival;
	}
	public void setTeamHome(String teamHome) {
		this.rival = teamHome;
	}
	
}
