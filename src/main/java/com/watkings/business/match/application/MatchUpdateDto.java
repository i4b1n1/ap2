package com.watkings.business.match.application;

import java.util.Date;

public class MatchUpdateDto {

	private String isFinished;

	private String matchDate;

	private String team1Id;

	private String team2Id;

	public String getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(String isFinished) {
		this.isFinished = isFinished;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getTeam1Id() {
		return team1Id;
	}

	public void setTeam1Id(String team1Id) {
		this.team1Id = team1Id;
	}

	public String getTeam2Id() {
		return team2Id;
	}

	public void setTeam2Id(String team2Id) {
		this.team2Id = team2Id;
	}

	

}
