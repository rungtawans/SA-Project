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
	
	@Column(name="Ranking")
	private int rank;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Country_CountryId", referencedColumnName = "CountryId")
	private Country country;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Year_YearId", referencedColumnName = "YearId")
	private Year Year_YearId;

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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
