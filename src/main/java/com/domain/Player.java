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
@Table(name="PLAYER")
public class Player {
	@Id
	@Column(name="ID")
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="TEAM_ID")
	private Long teamId;	
	
	@Column(name="NATIONALITY")
	private String nationality;
	
	@Column(name="POSITION")
	private String position;	
	
	@Column(name="DATE_OF_BIRTH")
	private Date dateOfBirth;
	
}
