package com.watkings.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LEAGUE database table.
 * 
 */
@Entity
@Table(name="LEAGUE")
@NamedQuery(name="League.findAll", query="SELECT l FROM League l")
public class League implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)  
	private int id;

	@Column(name="LEAGUE_NAME", length=45)
	private String leagueName;

}