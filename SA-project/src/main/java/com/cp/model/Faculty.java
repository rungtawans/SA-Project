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
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FacultyId")
	private String id;
	
	@Column(name="FacultyName")
	private String name;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="University_UniversityId", referencedColumnName = "UniversityId")
	private University university;

	@OneToMany(targetEntity=Field.class, mappedBy="faculty",
	cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Field> field;
	
	@OneToMany(targetEntity=FacultyPublicationRankings.class, mappedBy="faculty",
			cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<FacultyPublicationRankings> facultyPublicationRankings;

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

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public List<Field> getField() {
		return field;
	}

	public void setField(List<Field> field) {
		this.field = field;
	}

	public List<FacultyPublicationRankings> getFacultyPublicationRankings() {
		return facultyPublicationRankings;
	}

	public void setFacultyPublicationRankings(List<FacultyPublicationRankings> facultyPublicationRankings) {
		this.facultyPublicationRankings = facultyPublicationRankings;
	}

	
}
