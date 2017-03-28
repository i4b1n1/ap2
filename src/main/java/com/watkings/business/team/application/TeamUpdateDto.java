package com.watkings.business.team.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TeamUpdateDto {
	private String faundationDate;
	
	private String leagueId;

	private String name;

	private String capitainId;

	public String getFaundationDate() {
		return faundationDate;
	}

	public Long getLeagueId() {
		return Long.parseLong(leagueId);
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

	public Long getCapitainId() {
		return Long.parseLong(capitainId);
	}

	public void setCapitainId(String capitainId) {
		this.capitainId = capitainId;
	}
	
	public Date getFaundationDate(SimpleDateFormat dateFormat) {
		try{
		return dateFormat.parse(this.faundationDate);
		}
		catch(ParseException e){
			System.out.println(e);
		}
		return new Date();
	}
		

	public void setFaundationDate(String matchDate) {
		this.faundationDate = matchDate;
	}


}
