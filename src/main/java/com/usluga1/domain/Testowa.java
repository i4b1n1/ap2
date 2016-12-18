package com.usluga1.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@Table(name="testowa")
public class Testowa {

	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="imie")
	private String imie;
	
	@Column(name="nazwisko")
	private String nazwisko;

	public String getNazwisko() {
		return nazwisko;
	}
	

}

