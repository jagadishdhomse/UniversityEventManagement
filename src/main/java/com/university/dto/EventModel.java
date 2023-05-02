package com.university.dto;


import java.sql.Time;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EventModel {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	int eventid;
	String eventname;
	String locationofevent;
	 @JsonDeserialize(using = LocalDateDeserializer.class)
	LocalDate date;
	  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
	Time starttime;
	  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss")
	Time endtime;
	public int getEventid() {
		return eventid;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getLocationofevent() {
		return locationofevent;
	}
	public void setLocationofevent(String locationofevent) {
		this.locationofevent = locationofevent;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Time getStarttime() {
		return starttime;
	}
	public void setStarttime(Time starttime) {
		this.starttime = starttime;
	}
	public Time getEndtime() {
		return endtime;
	}
	public void setEndtime(Time endtime) {
		this.endtime = endtime;
	}
	
	
}
