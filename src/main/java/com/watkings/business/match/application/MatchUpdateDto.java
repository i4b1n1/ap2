package com.watkings.business.match.application;

import java.util.Date;

public class MatchUpdateDto {

	private String isFinished;

	private String matchDate;

	private String team1Id;

	private String team2Id;

	public Boolean getIsFinished() {
		return Boolean.valueOf(isFinished);
	}

	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished.toString();
	}

	public Date getMatchDate() {
		return new Date(matchDate);
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate.toString();
	}

//	public int getCourt() {
//		return courtId;
//	}
//
//	public void setCourt(int courtId) {
//		this.courtId = courtId;
//	}

//	public int getRefereeId() {
//		return refereeId;
//	}
//
//	public void setReferee(int referee) {
//		this.refereeId = referee;
//	}

	public Long getTeam1Id() {
		return Long.valueOf(team1Id);
	}

	public void setTeam1(Long team1) {
		this.team1Id = team1.toString();
	}

	public Long getTeam2Id() {
		return Long.valueOf(team2Id);
	}

	public void setTeam2(Long team2) {
		this.team2Id = team2.toString();
	}

}
