package com.university.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.university.Repository.EventModelRepository;
import com.university.dto.EventModel;


@RestController
public class Controller2 {
	@Autowired
    EventModelRepository emr;
	
	@PostMapping("/addevent")
	public String addEvent(@RequestBody EventModel e){
		emr.save(e);
		return "Deta of Event added successfully";
	}
	
	@PutMapping("/updateevent")
	public String updateEvent(@RequestBody EventModel e) {
		emr.save(e);
		return "update event";
	}
	
	 @GetMapping("/geteventbyid")
	    public EventModel geteventbyid(@RequestParam int eventid){
		 Optional<EventModel> o  = emr.findById(eventid);
	    	EventModel em = o.get();
	    	return em;
	 }
	 
	 @GetMapping("/geteventname")
	 public List<EventModel> geteventbyname(@RequestParam String eventname ){
		 List<EventModel> em = emr.findByEventName(eventname);
		 return em;
		 
	 }
	 
	 @DeleteMapping("/deleteevent")
	 public String deletebyeventid(@RequestParam int eventid) {
		 emr.deleteById(eventid);
		 return "data deleted successfully";
	 }
	    	
	
}
