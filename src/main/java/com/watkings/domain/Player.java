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
@Table(name="PLAYER")
public class Player implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;

	@Column(length=45)
	private String name;

	@Column(length=45)
	private String nationality;

	@Column(length=45)
	private String position;

	@OneToMany(mappedBy="player")
	private List<MatchEvent> matchEvents;

	@ManyToOne
	@JoinColumn(name="TEAM_ID")
	private Team team;

	@OneToMany(mappedBy="player")
	private List<Team> teams;
	
}
