package com.cp.model;

<<<<<<< HEAD
public class Country {
<<<<<<< HEAD
	
=======

=======
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CountryId")
	private String id;
	@Column(name="CountryName")
	private String name;
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
	@JsonIgnore
	@OneToMany(targetEntity=CountryPublicationRankings.class, mappedBy="country",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CountryPublicationRankings> countryPublicationRankings;
	public List<CountryPublicationRankings> getCountryPublicationRankings() {
		return countryPublicationRankings;
	}
	public void setCountryPublicationRankings(List<CountryPublicationRankings> countryPublicationRankings) {
		this.countryPublicationRankings = countryPublicationRankings;
	}
	
>>>>>>> origin/master
>>>>>>> 784bb87ec7c1bbc87fcd9842d559c9bdb5a1fd6a
}
