package com.watkings.business.player.application;


public class PlayerUpdateDto {

	private String name;

	private String nationality;

	private String position;

	private String teamId;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Long getTeamId() {
		return Long.parseLong(teamId);
	}

	public void setTeam(String teamId) {
		this.teamId = teamId;
	}
	
}
