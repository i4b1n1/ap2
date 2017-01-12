package com.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;



@Entity
@Table(name="TABELA_LIGOWA")
@NamedQuery(name="TabelaLigowa.findAll", query="SELECT t FROM TabelaLigowa t")
public class TabelaLigowa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(precision=10)
	private BigDecimal bilans;

	@Column(length=45)
	private String name;

	@Column(precision=10)
	private BigDecimal punkty;

	@Column(precision=10)
	private BigDecimal stracone;

	@Column(precision=10)
	private BigDecimal strzelone;

}