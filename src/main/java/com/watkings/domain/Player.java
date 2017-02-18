package com.watkings.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="PLAYER")
public class Player implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue
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

	@Column(name="TEAM_ID")
	private Long team;

//	@OneToMany(mappedBy="player")
//	private List<Team> teams;
	
	public Player() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Long getTeam() {
		return this.team;
	}

	public void setTeam(Long teamId) {
		this.team = teamId;
	}

//	public List<Team> getTeams() {
//		return this.teams;
//	}
//
//	public void setTeams(List<Team> teams) {
//		this.teams = teams;
//	}

//	public Team addTeam(Team team) {
//		getTeams().add(team);
//		team.setPlayer(this);
//
//		return team;
//	}
//
//	public Team removeTeam(Team team) {
//		getTeams().remove(team);
//		team.setPlayer(null);
//
//		return team;
//	}
	
}
