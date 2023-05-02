package com.university.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.dto.EventModel;

public interface EventModelRepository extends JpaRepository<EventModel, Integer>{
	public List<EventModel> findByEventName(String eventname);

}
