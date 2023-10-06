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
	
	@OneToOne(mappedBy = "year")
    private CountryPublicationRankings countryPublicationRankings;
	
	@OneToOne(mappedBy = "year")
	private UniversityRankings universityRankings;
	
	@OneToOne(mappedBy = "year")
	private UniversityPublicationRankings universityPublicationRankings;
	
	@OneToOne(mappedBy = "year")
	private FacultyPublicationRankings facultyPublicationRankings;
	
	@OneToOne(mappedBy = "year")
	private Quatile_SJR qualitile_SJR;

	@OneToOne(mappedBy = "year")
	private PaperStatistics paperStatistics;
	
	@OneToOne(mappedBy = "year")
	private PublicationRanking publicationRanking;

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

	public CountryPublicationRankings getCountryPublicationRankings() {
		return countryPublicationRankings;
	}

	public void setCountryPublicationRankings(CountryPublicationRankings countryPublicationRankings) {
		this.countryPublicationRankings = countryPublicationRankings;
	};
	
	public UniversityRankings getUniversityRankings() {
		return universityRankings;
	}

	public void setUniversityRankings(UniversityRankings universityRankings) {
		this.universityRankings = universityRankings;
	}
	
	public UniversityPublicationRankings getUniversityPublicationRankings() {
		return universityPublicationRankings;
	}

	public void setUniversityPublicationRankings(UniversityPublicationRankings universityPublicationRankings) {
		this.universityPublicationRankings = universityPublicationRankings;
	}
	
	public FacultyPublicationRankings getFacultyPublicationRankings() {
		return facultyPublicationRankings;
	}

	public void setFacultyPublicationRankings(FacultyPublicationRankings facultyPublicationRankings) {
		this.facultyPublicationRankings = facultyPublicationRankings;
	}

	public Quatile_SJR getQualitile_SJR() {
		return qualitile_SJR;
	}

	public void setQualitile_SJR(Quatile_SJR qualitile_SJR) {
		this.qualitile_SJR = qualitile_SJR;
	}

	public PaperStatistics getPaperStatistics() {
		return paperStatistics;
	}

	public void setPaperStatistics(PaperStatistics paperStatistics) {
		this.paperStatistics = paperStatistics;
	}

	public PublicationRanking getPublicationRanking() {
		return publicationRanking;
	}

	public void setPublicationRanking(PublicationRanking publicationRanking) {
		this.publicationRanking = publicationRanking;
	}
	
}
