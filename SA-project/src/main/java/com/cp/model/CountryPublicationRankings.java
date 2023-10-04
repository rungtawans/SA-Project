package com.cp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class CountryPublicationRankings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CountryPublicationRankingsId")
	private String id;
	
	@Column(name="Rank")
	private int rank;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="CountryId")
	private Country Country_CountryId;

	public Year getYear_YearId() {
		return Year_YearId;
	}

	public void setYear_YearId(Year year_YearId) {
		Year_YearId = year_YearId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	
	public Country getCountry_CountryId() {
		return Country_CountryId;
	}

	public void setCountry_CountryId(Country country_CountryId) {
		Country_CountryId = country_CountryId;
	}


	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "YearId", referencedColumnName = "id")
	private Year Year_YearId;
	
}
