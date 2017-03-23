package com.watkings.business.match.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	
	public Date getMatchDate(SimpleDateFormat dateFormat) {
		try{
		return dateFormat.parse(this.matchDate);
		}
		catch(ParseException e){
			System.out.println(e);
		}
		return new Date();
	}
		

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public Long getTeam1Id() {
		return Long.parseLong(team1Id);
	}

	public void setTeam1Id(String team1Id) {
		this.team1Id = team1Id;
	}

	public Long getTeam2Id() {
		return Long.parseLong(team2Id);
	}

	public void setTeam2Id(String team2Id) {
		this.team2Id = team2Id;
	}

	

}
