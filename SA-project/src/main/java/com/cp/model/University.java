package com.cp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UniversityId")
	private String id;
	
	@Column(name="Name")
	private String name;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="CountryId")
	private Country Country_CountryId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry_CountryId() {
		return Country_CountryId;
	}

	public void setCountry_CountryId(Country country_CountryId) {
		Country_CountryId = country_CountryId;
	}
}
