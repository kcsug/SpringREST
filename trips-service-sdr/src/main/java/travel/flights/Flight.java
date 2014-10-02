package travel.flights;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class Flight implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String origin;
	private String destination;
	private String airline;
	private String flightNumber;
	private Date date;
	private String traveler;
	
	// getters and setters
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getAirline() {
		return airline;
	}
	
	public void setAirline(String airline) {
		this.airline = airline;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String getTraveler() {
		return traveler;
	}
	
	public void setTraveler(String traveler) {
		this.traveler = traveler;
	}
	
	@JsonFormat(shape=Shape.STRING)
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
}
