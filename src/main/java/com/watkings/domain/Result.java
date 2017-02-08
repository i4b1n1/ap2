package com.watkings.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the results database table.
 * 
 */
@Entity
@Table(name="results")
@NamedQuery(name="Result.findAll", query="SELECT r FROM Result r")
public class Result implements Serializable {
	private static final long serialVersionUID = 1L;

	public Result() {
	}

}