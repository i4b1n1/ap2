package com.watkings.business.team.application;

import java.util.Date;

import com.watkings.domain.Player;

public class TeamUpdateDto {
	private Date faundationDate;
	
	private Long leagueId;

	private String name;

	private Player capitain;

	public Date getFaundationDate() {
		return faundationDate;
	}

	public void setFaundationDate(Date faundationDate) {
		this.faundationDate = faundationDate;
	}

	public Long getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(Long leagueId) {
		this.leagueId = leagueId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player getCapitain() {
		return capitain;
	}

	public void setCapitain(Player capitain) {
		this.capitain = capitain;
	}
}
