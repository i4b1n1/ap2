package com.watkings.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;



/**
 * The persistent class for the LEAGUE_TABLE database table.
 * 
 */
@Entity
@Table(name="league_table")
public class LeagueTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="GOALS_LOST", precision=10)
	private BigDecimal goalsLost;

	@Column(name="GOALS_SCORED", precision=10)
	private BigDecimal goalsScored;

	@Id
	@Column(name="LEAGUE_ID")
	private int leagueId;

	@Column(precision=10)
	private BigDecimal points;

	
    @JoinColumn(name="TEAM_ID")
	private int teamId;
    
    @JoinColumn(name="NAME")
    private String teamName;

	public LeagueTable() {
	}

	public BigDecimal getGoalsLost() {
		return this.goalsLost;
	}

	public void setGoalsLost(BigDecimal goalsLost) {
		this.goalsLost = goalsLost;
	}

	public BigDecimal getGoalsScored() {
		return this.goalsScored;
	}

	public void setGoalsScored(BigDecimal goalsScored) {
		this.goalsScored = goalsScored;
	}

	public int getLeagueId() {
		return this.leagueId;
	}

	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	public BigDecimal getPoints() {
		return this.points;
	}

	public void setPoints(BigDecimal points) {
		this.points = points;
	}

	public int getTeamId() {
		return this.teamId;
	}

	public void setTeamId(int team) {
		this.teamId = team;
	}
	
	public String getTeamName(){
		return this.teamName;
	}

	public void setTeamName(String team){
		this.teamName = team;
	}
}