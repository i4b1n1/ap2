package com.watkings.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the scorers_cassification database table.
 * 
 */
@Entity
@Table(name="scorers_cassification")
@NamedQuery(name="ScorersCassification.findAll", query="SELECT s FROM ScorersCassification s")
public class ScorersCassification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PLAYER_ID", nullable=false)
	private int playerId;
	
	@Column(nullable=false)
	private BigInteger bramki;

	@Column(nullable=false, length=45)
	private String druzyna;

	@Column(name="LEAGUE_ID")
	private int leagueId;

	@Column(length=45)
	private String zawodnik;

	public ScorersCassification() {
	}

	public BigInteger getBramki() {
		return this.bramki;
	}

	public void setBramki(BigInteger bramki) {
		this.bramki = bramki;
	}

	public String getDruzyna() {
		return this.druzyna;
	}

	public void setDruzyna(String druzyna) {
		this.druzyna = druzyna;
	}

	public int getLeagueId() {
		return this.leagueId;
	}

	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}

	public int getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getZawodnik() {
		return this.zawodnik;
	}

	public void setZawodnik(String zawodnik) {
		this.zawodnik = zawodnik;
	}

}