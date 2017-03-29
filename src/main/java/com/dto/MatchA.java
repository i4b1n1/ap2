package com.dto;

import java.util.List;



public class MatchA {



	public MatchA(Integer id, TeamA team1, TeamA team2, String scoreT1, String scoreT2, String date, String judge) {
		super();
		this.id = id;
		this.team1 = team1;
		this.team2 = team2;
		this.scoreT1 = scoreT1;
		this.scoreT2 = scoreT2;
		this.date = date;
		this.judge = judge;
	}

	public Integer id;
	
	public TeamA team1;
		
	public TeamA team2;
	
	public String scoreT1;
	
	public String scoreT2;
	
	public String date;
	
	public String judge;
}
