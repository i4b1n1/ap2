package com.watkings.business.team.application;

public class TeamBasicDto {
	
	String name;
	String id;
	
	TeamBasicDto(Long id, String name){
		this.name = name;
		this.id = Long.toString(id);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
