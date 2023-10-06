package com.cp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Research_Group {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="GroupId")
	private String id;
	
	@Column(name="GroupName")
	private String name;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="University_UniversityId", referencedColumnName = "UniversityId")
	private University university;
	
	@OneToOne(mappedBy = "Research_Group")
    private Research_Group_Authors research_Group_Authors;

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

	public Research_Group_Authors getResearch_Group_Authors() {
		return research_Group_Authors;
	}

	public void setResearch_Group_Authors(Research_Group_Authors research_Group_Authors) {
		this.research_Group_Authors = research_Group_Authors;
	}
	
	
	
}
