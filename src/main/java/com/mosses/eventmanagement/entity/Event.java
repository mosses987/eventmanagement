package com.mosses.eventmanagement.entity;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.rest.core.annotation.RestResource;
@JsonPropertyOrder({"resourceId"})
@Entity
public class Event extends AbstractEntity {
	
	private String name;
	private String description;
	private ZonedDateTime startTime;
	private ZonedDateTime endTime;
	private ZoneId zoneId;
	private boolean started;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(nullable = false)
	private Organizer organizer;
	
	@OneToMany(mappedBy = "event",fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Participant> participant;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@RestResource(exported = false)
	private Venue venue;
	
	
	
	public Organizer getOrganizer() {
		return organizer;
	}
	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}
	public Set<Participant> getParticipant() {
		return participant;
	}
	public void setParticipants(Set<Participant> participant) {
		this.participant= participant;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ZonedDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(ZonedDateTime startTime) {
		this.startTime = startTime;
	}
	public ZonedDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(ZonedDateTime endTime) {
		this.endTime = endTime;
	}
	public ZoneId getZoneId() {
		return zoneId;
	}
	public void setZoneId(ZoneId zoneId) {
		this.zoneId = zoneId;
	}
	public boolean isStarted() {
		return started;
	}
	public void setStarted(boolean started) {
		this.started = started;
	}
	public long getResourceId(){
		return this.id;
	}
	@Override
	public String toString() {
		return "Event [name=" + name + ", description=" + description + ", startTime=" + startTime + ", endTime="
				+ endTime + ", zoneId=" + zoneId + ", started=" + started + ", organizer=" + organizer
				+ ", participants=" + participant + ", venue=" + venue + "]";
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return Objects.equals(id, ((Event) obj).id);
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id);
	}

}
