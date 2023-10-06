package com.cp.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class FacultyPublicationRankings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FacultyPublicationRankingsId")
	private String id;
	
	@Column(name="Ranking")
	private int rank;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Year_YearId", referencedColumnName = "YearId")
	private Year year;

	@ManyToOne(optional=false)
	@JoinColumn(name="Faculty_FacultyId", referencedColumnName = "FacultyId")
	private Faculty faculty;

	 @OneToMany(targetEntity=Publication.class, mappedBy="FacultyPublicationRankings",
	    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<Publication> publication;
	
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

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public List<Publication> getPublication() {
		return publication;
	}

	public void setPublication(List<Publication> publication) {
		this.publication = publication;
	}
	
}
