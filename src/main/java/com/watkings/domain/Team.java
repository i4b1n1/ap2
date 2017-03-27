package com.watkings.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="team")
public class Team implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="FAUNDATION_DATE")
	private Date faundationDate;

	@Column(name="LEAGUE_ID")
	private Long leagueId;

	@Column(nullable=false, length=45)
	private String name;

	//bi-directional many-to-one association to Player
	@OneToMany(mappedBy="team", fetch=FetchType.LAZY)
	private List<Player> players;

	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="CAPITAIN_ID")
	private Player player;

	public Team() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFaundationDate() {
		return this.faundationDate;
	}

	public void setFaundationDate(Date faundationDate) {
		this.faundationDate = faundationDate;
	}

	public Long getLeagueId() {
		return this.leagueId;
	}

	public void setLeagueId(Long leagueId) {
		this.leagueId = leagueId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Player> getPlayers() {
		return this.players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

//	public Player addPlayer(Player player) {
//		getPlayers().add(player);
//		player.setTeam(this);
//
//		return player;
//	}
//
//	public Player removePlayer(Player player) {
//		getPlayers().remove(player);
//		player.setTeam(null);
//
//		return player;
//	}

	public Player getPlayer() {
		return this.player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
