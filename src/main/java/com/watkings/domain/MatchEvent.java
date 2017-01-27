package com.watkings.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="MATCH_EVENT")
public class MatchEvent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="EVENT_MINUTE")
	private int eventMinute;

	@Column(name="TEAM_ID")
	private int teamId;

	@ManyToOne
	@JoinColumn(name="EVENT_TYPE_ID", nullable=false)
	private EventTypeDict eventTypeDict;

	@ManyToOne
	@JoinColumn(name="MATCH_ID", nullable=false)
	private Match match;

	@ManyToOne
	@JoinColumn(name="PLAYER_ID", nullable=false)
	private Player player;
	

}
