package com.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="TEAM")
public class Team {
	@Id
	@Column(name="ID")
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="FOUNDATION_DATE")
	private Date foundationDate;	
	
	@Column(name="CAPITAIN_ID")
	private Long capitainId;

}
