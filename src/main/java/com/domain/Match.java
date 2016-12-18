package com.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="MATCH")
public class Match {
	@Id
	@Column(name="ID")
	private Long id;
	
	@Column(name="MATCH_DATE")
	private Date matchDate;
	
	@Column(name="TEAM_HOME_ID")
	private Long teamHomeId;	
	
	@Column(name="TEAM_AWAY_ID")
	private Long teamAwayId;	
	
	@Column(name="REFEREE_ID")
	private Long refereeId;	
	
	@Column(name="COURT_ID")
	private Long courtId;	
	
}
