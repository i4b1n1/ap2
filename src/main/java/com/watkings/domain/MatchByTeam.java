package com.watkings.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name="match_by_team")
public class MatchByTeam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable=false)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MATCH_DATE")
	private Date matchDate;

	@Column(nullable=false, length=45)
	private String rival;

	@Column(name="ROUND_NUMBER")
	private int roundNumber;

	@Column(name="TEAM_ID", nullable=false)
	private Long teamId;

	public MatchByTeam() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getMatchDate() {
		return this.matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public String getRival() {
		return this.rival;
	}

	public void setRival(String rival) {
		this.rival = rival;
	}

	public int getRoundNumber() {
		return this.roundNumber;
	}

	public void setRoundNumber(int roundNumber) {
		this.roundNumber = roundNumber;
	}

	public Long getTeamId() {
		return this.teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

}