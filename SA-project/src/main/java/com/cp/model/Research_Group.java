package com.cp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Research_Group {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="GroupId")
	private String id;
	
	@Column(name="GroupName")
	private String name;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="UniversityId")
	private University University_UniversityId;

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

	public University getUniversity_UniversityId() {
		return University_UniversityId;
	}

	public void setUniversity_UniversityId(University university_UniversityId) {
		University_UniversityId = university_UniversityId;
	}
}
