package com.watkings.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="MATCH")
public class Match implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue
	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="IS_FINISHED")
	private boolean isFinished;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MATCH_DATE")
	private Date matchDate;

	@Column(name="ROUND_NUMBER")
	private int roundNumber;

	//bi-directional many-to-one association to MatchEvent
	@OneToMany(mappedBy="match")
	private List<MatchEvent> matchEvents;

	//bi-directional many-to-one association to Court
	@ManyToOne
	@JoinColumn(name="COURT_ID", nullable=false)
	private Court court;

	//bi-directional many-to-one association to League
	@ManyToOne
	@JoinColumn(name="LEAGUE_ID")
	private League league;

	//bi-directional many-to-one association to Referee
	@ManyToOne
	@JoinColumn(name="REFEREE_ID", nullable=false)
	private Referee referee;

	//bi-directional many-to-one association to Team
	@ManyToOne
	@JoinColumn(name="TEAM_HOME_ID", nullable=false)
	private Team team1;

	//bi-directional many-to-one association to Team
	@ManyToOne
	@JoinColumn(name="TEAM_AWAY_ID", nullable=false)
	private Team team2;

	public Match() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getIsFinished() {
		return this.isFinished;
	}

	public void setIsFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	public Date getMatchDate() {
		return this.matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public int getRoundNumber() {
		return this.roundNumber;
	}

	public void setRoundNumber(int roundNumber) {
		this.roundNumber = roundNumber;
	}

	public List<MatchEvent> getMatchEvents() {
		return this.matchEvents;
	}

	public void setMatchEvents(List<MatchEvent> matchEvents) {
		this.matchEvents = matchEvents;
	}

	public MatchEvent addMatchEvent(MatchEvent matchEvent) {
		getMatchEvents().add(matchEvent);
		matchEvent.setMatch(this);

		return matchEvent;
	}

	public MatchEvent removeMatchEvent(MatchEvent matchEvent) {
		getMatchEvents().remove(matchEvent);
		matchEvent.setMatch(null);

		return matchEvent;
	}

	public Court getCourt() {
		return this.court;
	}

	public void setCourt(Court court) {
		this.court = court;
	}

	public League getLeague() {
		return this.league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public Referee getReferee() {
		return this.referee;
	}

	public void setReferee(Referee referee) {
		this.referee = referee;
	}

	public Team getTeam1() {
		return this.team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return this.team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
}
