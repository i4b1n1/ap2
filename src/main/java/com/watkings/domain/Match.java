package com.watkings.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="MATCH")
public class Match implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="IS_FINISHED")
	private byte isFinished;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MATCH_DATE")
	private Date matchDate;

	@ManyToOne
	@JoinColumn(name="COURT_ID", nullable=false)
	private Court court;

	@ManyToOne
	@JoinColumn(name="REFEREE_ID", nullable=false)
	private Referee referee;

	@ManyToOne
	@JoinColumn(name="TEAM_HOME_ID", nullable=false)
	private Team team1;

	@ManyToOne
	@JoinColumn(name="TEAM_AWAY_ID", nullable=false)
	private Team team2;

	@OneToMany(mappedBy="match")
	private List<MatchEvent> matchEvents;	
	
}
