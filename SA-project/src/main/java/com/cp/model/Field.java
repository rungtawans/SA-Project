package com.cp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Field {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="FieldId")
	private String id;
	
	@Column(name="FieldName")
	private String name;
	
	@Column(name="FieldDescription")
	private String desc;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="FacultyId")
	private Faculty Faculty_FacultyId;

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Faculty getFaculty_FacultyId() {
		return Faculty_FacultyId;
	}

	public void setFaculty_FacultyId(Faculty faculty_FacultyId) {
		Faculty_FacultyId = faculty_FacultyId;
	}
}
