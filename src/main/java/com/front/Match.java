package com.front;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Match {



	public Match(Integer id, Team team1, Team team2, String scoreT1, String scoreT2, String date, String judge) {
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
	
	public Team team1;
		
	public Team team2;
	
	public String scoreT1;
	
	public String scoreT2;
	
	public String date;
	
	public String judge;
}
