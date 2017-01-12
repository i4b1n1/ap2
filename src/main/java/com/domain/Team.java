package com.domain;

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
@Table(name="TEAM")
public class Team implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="FAUNDATION_DATE")
	private Date faundationDate;

	@Column(nullable=false, length=45)
	private String name;

	@OneToMany(mappedBy="team1")
	private List<Match> matches1;

	@OneToMany(mappedBy="team2")
	private List<Match> matches2;

	@OneToMany(mappedBy="team")
	private List<Player> players;

	@ManyToOne
	@JoinColumn(name="CAPITAIN_ID")
	private Player player;

}
