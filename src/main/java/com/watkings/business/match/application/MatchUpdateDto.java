package com.watkings.business.match.application;

public class MatchUpdateDto {

	private Boolean isFinished;

	private String matchDate;

	private Integer court;

	private Integer referee;

	private Integer team1;

	private Integer team2;

	public Boolean getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public Integer getCourt() {
		return court;
	}

	public void setCourt(Integer court) {
		this.court = court;
	}

	public Integer getReferee() {
		return referee;
	}

	public void setReferee(Integer referee) {
		this.referee = referee;
	}

	public Integer getTeam1() {
		return team1;
	}

	public void setTeam1(Integer team1) {
		this.team1 = team1;
	}

	public Integer getTeam2() {
		return team2;
	}

	public void setTeam2(Integer team2) {
		this.team2 = team2;
	}


}
