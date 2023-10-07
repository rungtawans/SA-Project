package com.cp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
import jakarta.persistence.Table;

@Entity
@Table (name = "FacultyPublicationRankings")
public class FacultyPublicationRankings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FacultyPublicationRankingsId")
	private String id;
	
	@Column(name="Rank")
	private int Rank;
	
	/*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "YearId", referencedColumnName = "id")
	private Year year;*/

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

	/*public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}*/
	@JsonIgnore
    @OneToMany(targetEntity=Publication.class, mappedBy="Publication",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Publication> Publication;
	
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
