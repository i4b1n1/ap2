package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="MATCH_EVENT")
public class MatchEvent {
	@Id
	@Column(name="ID")
	private Long id;
	
	@Column(name="EVENT_VALUE")
	private Double eventValue;
	
	@Column(name="EVENT_MINUTE")
	private Long eventMinute;	
	
	@Column(name="MATCH_ID")
	private Long namematchId;
	
	@Column(name="EVENT_TYPE_ID")
	private Long eventTypeId;	
	
	@Column(name="PLAYER_ID")
	private Long playerId;
	

}
