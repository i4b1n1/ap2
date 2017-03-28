package com.watkings.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="match_event")
public class MatchEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="EVENT_MINUTE")
	private int eventMinute;

	@Column(name="EVENT_TYPE_ID", nullable=false)
	private int eventTypeId;

	@Column(name="PLAYER_ID", nullable=false)
	private int playerId;

	@Column(name="TEAM_ID")
	private int teamId;

	@Column(name="MATCH_ID", nullable=false)
	private int matchId;


	public MatchEvent() {
	}
	
	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEventMinute() {
		return this.eventMinute;
	}

	public void setEventMinute(int eventMinute) {
		this.eventMinute = eventMinute;
	}

	public int getEventTypeId() {
		return this.eventTypeId;
	}

	public void setEventTypeId(int eventTypeId) {
		this.eventTypeId = eventTypeId;
	}

	public int getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getTeamId() {
		return this.teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	

}
