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
	
	@Column(name="Rank")
	private int Rank;
	
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

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "YearId", referencedColumnName = "id")
	private Year Year_YearId;
	
	public Year getYear_YearId() {
		return Year_YearId;
	}

	public void setYear_YearId(Year year_YearId) {
		Year_YearId = year_YearId;
	}

	@ManyToOne(optional=false)
	@JoinColumn(name="UniversityId")
	private University University_UniversityId;

	public University getUniversity_UniversityId() {
		return University_UniversityId;
	}

	public void setUniversity_UniversityId(University university_UniversityId) {
		University_UniversityId = university_UniversityId;
	}
}
