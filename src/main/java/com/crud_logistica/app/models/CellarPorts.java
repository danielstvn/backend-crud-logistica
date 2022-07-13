package com.crud_logistica.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="cellar_ports")
public class CellarPorts {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="type", length = 20, nullable = false)
    private String type;
	
	@Column(name="name", length = 60, nullable = false)
    private String name;
	
	@Column(name="location", length = 120, nullable = false)
    private String location;
	
	@Column(name="country", length = 35, nullable = false)
    private String country;
	
	@Column(name="availability", nullable = false)
    private boolean availability;

	public CellarPorts() {
		
	}

	public CellarPorts(int id, String type, String name, String location, String country, boolean availability) {
		
		this.id = id;
		this.type = type;
		this.name = name;
		this.location = location;
		this.country = country;
		this.availability = availability;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	
	
	
	
	

}
