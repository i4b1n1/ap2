package com.watkings.business.match.application;

public class EventDto {
	private String playerId;
	private String teamId;
	private String eventTypeId;
	private String eventMinute;
	
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getEventTypeId() {
		return eventTypeId;
	}
	public void setEventTypeId(String eventTypeId) {
		this.eventTypeId = eventTypeId;
	}
	public String getEventMinute() {
		return eventMinute;
	}
	public void setEventMinute(String eventMinute) {
		this.eventMinute = eventMinute;
	}
	
}
