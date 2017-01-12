package com.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="REFEREE")
public class Referee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="BIRTH_DATE", length=45)
	private String birthDate;

	@Column(name="FIRST_NAME", length=45)
	private String firstName;

	@Column(name="LAST_NAME", length=45)
	private String lastName;

	@OneToMany(mappedBy="referee")
	private List<Match> matches;

}
