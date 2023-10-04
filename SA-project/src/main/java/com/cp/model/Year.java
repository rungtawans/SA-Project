package com.cp.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Year {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="YearId")
	private String id;
	
	private String Year;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}
	@OneToOne(mappedBy = "year")
    private CountryPublicationRankings countryPublicationRankings;

	public CountryPublicationRankings getCountryPublicationRankings() {
		return countryPublicationRankings;
	}

	public void setCountryPublicationRankings(CountryPublicationRankings countryPublicationRankings) {
		this.countryPublicationRankings = countryPublicationRankings;
	};
	
	@OneToOne(mappedBy = "year")
	private UniversityRankings universityRankings;

	public UniversityRankings getUniversityRankings() {
		return universityRankings;
	}

	public void setUniversityRankings(UniversityRankings universityRankings) {
		this.universityRankings = universityRankings;
	}
	
	@OneToOne(mappedBy = "year")
	private UniversityPublicationRankings universityPublicationRankings;

	public UniversityPublicationRankings getUniversityPublicationRankings() {
		return universityPublicationRankings;
	}

	public void setUniversityPublicationRankings(UniversityPublicationRankings universityPublicationRankings) {
		this.universityPublicationRankings = universityPublicationRankings;
	}
	
	@OneToOne(mappedBy = "year")
	private FacultyPublicationRankings facultyPublicationRankings;

	public FacultyPublicationRankings getFacultyPublicationRankings() {
		return facultyPublicationRankings;
	}

	public void setFacultyPublicationRankings(FacultyPublicationRankings facultyPublicationRankings) {
		this.facultyPublicationRankings = facultyPublicationRankings;
	}
}
