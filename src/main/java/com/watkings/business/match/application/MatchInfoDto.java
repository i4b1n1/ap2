package com.watkings.business.match.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class MatchInfoDto {

	private String matchDate;

	private String team1Name;

	private String team2Name;
	
	private String team1Result;
	
	private String team2Result;
	
	private int matchweekNumber;

	private List<String> scorersList;
	
	private String CourtAddress;
	
	public String getTeam1Name() {
		return team1Name;
	}

	public void setTeam1Name(String team1Name) {
		this.team1Name = team1Name;
	}

	public String getCourtAddress() {
		return CourtAddress;
	}

	public void setCourtAddress(String courtAddress) {
		CourtAddress = courtAddress;
	}

	public String getCourtName() {
		return CourtName;
	}

	public void setCourtName(String courtName) {
		CourtName = courtName;
	}

	private String CourtName;

	public List<String> getScorersList() {
		return scorersList;
	}

	public void setScorersList(List<String> scorersList) {
		this.scorersList = scorersList;
	}

	public String getTeam1Result() {
		return team1Result;
	}

	public void setTeam1Result(String team1Result) {
		this.team1Result = team1Result;
	}

	public String getTeam2Result() {
		return team2Result;
	}

	public void setTeam2Result(String team2Result) {
		this.team2Result = team2Result;
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

	public String getTeam1Id() {
		return team1Name;
	}

	public void setTeam1Id(String team1Id) {
		this.team1Name = team1Id;
	}

	public String getTeam2Id() {
		return team2Name;
	}

	public void setTeam2Id(String team2Id) {
		this.team2Name = team2Id;
	}

	public String getTeam2Name() {
		return team2Name;
	}

	public void setTeam2Name(String team2Name) {
		this.team2Name = team2Name;
	}	
	
	public int getMatchweekNumber() {
		return matchweekNumber;
	}

	public void setMatchweekNumber(int matchweekNumber) {
		this.matchweekNumber = matchweekNumber;
	}

}
