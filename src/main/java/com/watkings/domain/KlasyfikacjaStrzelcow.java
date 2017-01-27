package com.watkings.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;



//@Entity
//@Table(name="KLASYFIKACJA_STRZELCOW")
//@NamedQuery(name="KlasyfikacjaStrzelcow.findAll", query="SELECT k FROM KlasyfikacjaStrzelcow k")
public class KlasyfikacjaStrzelcow implements Serializable {
	private static final long serialVersionUID = 1L;

	//@Column(nullable=false)
	private BigInteger bramki;

	//@Column(nullable=false, length=45)
	private String druzyna;

	//@Column(length=45)
	private String zawodnik;


}