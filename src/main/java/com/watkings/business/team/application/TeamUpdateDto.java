package com.watkings.business.team.application;

import java.util.Date;

import com.watkings.domain.Player;

public class TeamUpdateDto {
	private String faundationDate;
	
	private String leagueId;

	private String name;

	private String capitainId;

	public String getFaundationDate() {
		return faundationDate;
	}

	public void setFaundationDate(String faundationDate) {
		this.faundationDate = faundationDate;
	}

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapitainId() {
		return capitainId;
	}

	public void setCapitainId(String capitainId) {
		this.capitainId = capitainId;
	}


}
