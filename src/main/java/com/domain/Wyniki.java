package com.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigInteger;


@Entity
@Table(name="WYNIKI")
@NamedQuery(name="Wyniki.findAll", query="SELECT w FROM Wyniki w")
public class Wyniki implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="MATCH_ID", nullable=false)
	private Match match;

	@Column(name="SCORE_AWAY", nullable=false)
	private BigInteger scoreAway;

	@Column(name="SCORE_HOME", nullable=false)
	private BigInteger scoreHome;

	@Column(name="TEAM_AWAY", nullable=false, length=45)
	private String teamAway;

	@Column(name="TEAM_HOME", nullable=false, length=45)
	private String teamHome;

}