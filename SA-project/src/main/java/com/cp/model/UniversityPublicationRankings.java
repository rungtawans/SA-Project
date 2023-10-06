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
public class UniversityPublicationRankings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UniversityPublicationRankingsId")
	private String id;
	
	@Column(name="Ranking")
	private int rank;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Year_YearId", referencedColumnName = "YearId")
	private Year year;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Univerity_UniversityId", referencedColumnName = "UniversityId")
	private University university;

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

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	
}
