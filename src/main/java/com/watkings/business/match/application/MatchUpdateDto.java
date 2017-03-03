package com.watkings.business.match.application;

import java.util.Date;

public class MatchUpdateDto {

	private Boolean isFinished;

	private Date matchDate;

//	private int courtId;

	private int refereeId;

	private Long team1Id;

	private Long team2Id;

	public Boolean getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Boolean isFinished) {
		this.isFinished = isFinished;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

//	public int getCourt() {
//		return courtId;
//	}
//
//	public void setCourt(int courtId) {
//		this.courtId = courtId;
//	}

	public int getReferee() {
		return refereeId;
	}

	public void setReferee(int referee) {
		this.refereeId = referee;
	}

	public Long getTeam1() {
		return team1Id;
	}

	public void setTeam1(Long team1) {
		this.team1Id = team1;
	}

	public Long getTeam2() {
		return team2Id;
	}

	public void setTeam2(Long team2) {
		this.team2Id = team2;
	}

}
