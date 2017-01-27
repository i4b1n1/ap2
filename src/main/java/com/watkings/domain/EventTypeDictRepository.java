package com.watkings.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeDictRepository extends CrudRepository<EventTypeDict, Long> {

	public EventTypeDict findById(@Param("id") Long id);
	public List<EventTypeDict> findByEventName(@Param("eventName") String eventName);
	public List<EventTypeDict> findAll();	

}