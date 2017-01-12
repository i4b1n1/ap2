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
@Table(name="EVENT_TYPE_DICT")
public class EventTypeDict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(name="EVENT_NAME", length=45)
	private String eventName;

	@OneToMany(mappedBy="eventTypeDict")
	private List<MatchEvent> matchEvents;

}
