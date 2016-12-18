package com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="EVENT_TYPE_DICT")
public class EventTypeDict {
	@Id
	@Column(name="ID")
	private Long id;
	
	@Column(name="EVENT_NAME")
	private String eventName;

}
