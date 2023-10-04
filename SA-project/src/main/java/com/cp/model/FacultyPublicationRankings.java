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
public class FacultyPublicationRankings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FacultyPublicationRankingsId")
	private String id;
	
	@Column(name="Rank")
	private int Rank;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "YearId", referencedColumnName = "id")
	private Year year;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRank() {
		return Rank;
	}

	public void setRank(int rank) {
		Rank = rank;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn(name="FacultyId")
	private Faculty Faculty_FacultyId;

	public Faculty getFaculty_FacultyId() {
		return Faculty_FacultyId;
	}

	public void setFaculty_FacultyId(Faculty faculty_FacultyId) {
		Faculty_FacultyId = faculty_FacultyId;
	}
}
