package com.cp.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@EntityScan
@Table(name = "educationhistory")
public class EducationHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="EducationHistoryId")
	private String id;
	
	@Column(name ="BachelorDegree")
	private String bachelorDegree;
	
	@Column(name ="MasterDegree")
	private String masterDegree;
	
	@Column(name ="DoctoralDegree")
	private String doctoralDegree;
	
	@OneToOne(mappedBy = "educationhistory")
    private Authors authors;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBachelorDegree() {
		return bachelorDegree;
	}

	public void setBachelorDegree(String bachelorDegree) {
		this.bachelorDegree = bachelorDegree;
	}

	public String getMasterDegree() {
		return masterDegree;
	}

	public void setMasterDegree(String masterDegree) {
		this.masterDegree = masterDegree;
	}

	public String getDoctoralDegree() {
		return doctoralDegree;
	}

	public void setDoctoralDegree(String doctoralDegree) {
		this.doctoralDegree = doctoralDegree;
	}

	public Authors getAuthors() {
		return authors;
	}

	public void setAuthors(Authors authors) {
		this.authors = authors;
	}
	
}
