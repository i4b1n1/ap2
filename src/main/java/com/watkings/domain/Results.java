package com.watkings.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;


/**
 * The persistent class for the results database table.
 * 
 */
@Entity
@Table(name="results")
public class Results implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MATCH_ID", nullable=false)
	private int matchId;
	
	@Column(name="LEAGUE_ID")
	private int leagueId;
	
	@Column(name="GOALS_AWAY", precision=10)
	private BigDecimal goalsAway;

	@Column(name="GOALS_HOME", precision=10)
	private BigDecimal goalsHome;

	@Column(name="MATCHWEEK_NUMBER", nullable=true)
	private int matchweekNumber;

	@Column(name="TEAM_AWAY_ID")
	private int teamAwayId;
	
	@Column(name="TEAM_AWAY_NAME", nullable=false, length=45)
	private String teamAwayName;

	@Column(name="TEAM_HOME_ID")
	private int teamHomeId;
	
	@Column(name="TEAM_HOME_NAME", nullable=false, length=45)
	private String teamHomeName;

	public Results() {
	}

	public BigDecimal getGoalsAway() {
		return this.goalsAway;
	}

	public void setGoalsAway(BigDecimal goalsAway) {
		this.goalsAway = goalsAway;
	}

	public BigDecimal getGoalsHome() {
		return this.goalsHome;
	}

	public void setGoalsHome(BigDecimal goalsHome) {
		this.goalsHome = goalsHome;
	}

	public int getMatchwekkNumber() {
		return this.matchweekNumber;
	}

	public void setMatchwekkNumber(int matchwekkNumber) {
		this.matchweekNumber = matchwekkNumber;
	}

	public int getTeamAwayId() {
		return this.teamAwayId;
	}

	public void setTeamAwayId(int teamAwayId) {
		this.teamAwayId = teamAwayId;
	}

	public int getTeamHomeId() {
		return this.teamHomeId;
	}

	public void setTeamHomeId(int teamHomeId) {
		this.teamHomeId = teamHomeId;
	}
	
	public int getLeagueId() {
		return this.leagueId;
	}

	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	public int getMatchId() {
		return this.matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	
	public String getTeamHomeName() {
		return this.teamHomeName;
	}

	public void setTeamHomeName(String teamHomeName) {
		this.teamHomeName = teamHomeName;
	}
	
	public String getTeamAwayName() {
		return this.teamAwayName;
	}

	public void setTeamAwayName(String teamAwayName) {
		this.teamAwayName = teamAwayName;
	}

}