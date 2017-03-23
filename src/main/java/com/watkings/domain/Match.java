package com.watkings.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="matches")
public class Match implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="COURT_ID")
	private int court;

	@Column(name="IS_FINISHED")
	private boolean isFinished;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MATCH_DATE")
	private Date matchDate;

	@Column(name="ROUND_NUMBER")
	private int roundNumber;

	@Column(name="LEAGUE_ID")
	private Long league;

	@Column(name="REFEREE_ID", nullable=false)
	private int referee;

	@Column(name="TEAM_HOME_ID", nullable=false)
	private Long team1;

	@Column(name="TEAM_AWAY_ID", nullable=false)
	private Long team2;

	@OneToMany(mappedBy="match")
	private List<MatchEvent> matchEvents;

	public Match() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCourtId() {
		return this.court;
	}

	public void setCourtId(int courtId) {
		this.court = courtId;
	}

	public boolean getIsFinished() {
		return this.isFinished;
	}

	public void setIsFinished(boolean b) {
		this.isFinished = b;
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

	public Long getLeague() {
		return this.league;
	}

	public void setLeague(Long league) {
		this.league = league;
	}

	public int getReferee() {
		return this.referee;
	}

	public void setReferee(int referee) {
		this.referee = referee;
	}

	public Long getTeam1() {
		return this.team1;
	}

	public void setTeam1(Long team1) {
		this.team1 = team1;
	}

	public Long getTeam2() {
		return this.team2;
	}

	public void setTeam2(Long team2) {
		this.team2 = team2;
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
}
