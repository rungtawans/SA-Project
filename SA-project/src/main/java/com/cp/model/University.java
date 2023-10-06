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

@Entity
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="UniversityId")
	private String id;
	
	@Column(name="Name")
	private String name;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="Country_CountryId", referencedColumnName = "CountryId")
	private Country country;

	@OneToMany(targetEntity=UniversityRankings.class, mappedBy="university",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UniversityRankings> universityRankings;
	
	@OneToMany(targetEntity=UniversityPublicationRankings.class, mappedBy="university",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UniversityPublicationRankings> universityPublicationRankings;
	
	@OneToMany(targetEntity=Faculty.class, mappedBy="university",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Faculty> faculty;
	
	@OneToMany(targetEntity=Research_Group.class, mappedBy="university",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private Research_Group research_group;
	
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
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Research_Group getResearch_group() {
		return research_group;
	}

	public void setResearch_group(Research_Group research_group) {
		this.research_group = research_group;
	}

	public List<UniversityRankings> getUniversityRankings() {
		return universityRankings;
	}

	public void setUniversityRankings(List<UniversityRankings> universityRankings) {
		this.universityRankings = universityRankings;
	}

	public List<UniversityPublicationRankings> getUniversityPublicationRankings() {
		return universityPublicationRankings;
	}

	public void setUniversityPublicationRankings(List<UniversityPublicationRankings> universityPublicationRankings) {
		this.universityPublicationRankings = universityPublicationRankings;
	}

	public List<Faculty> getFaculty() {
		return faculty;
	}

	public void setFaculty(List<Faculty> faculty) {
		this.faculty = faculty;
	}
	
}
