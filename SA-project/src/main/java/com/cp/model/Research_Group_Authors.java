package com.cp.model;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@EntityScan
@Table(name = "research_group_authors")
public class Research_Group_Authors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Research_Group_Authors_id")
	private String id;
	
	@Column(name ="ScopusAuthorID")
	private String scopusAuthorID;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Research_Group_GroupID", referencedColumnName = "GroupID")
	private Research_Group research_Group;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "University_UniversityId", referencedColumnName = "UniversityId")
	private University university;
	
//	@JsonIgnore
	@OneToMany(targetEntity=Authors.class, mappedBy="research_group_authors",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Authors> authors;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getScopusAuthorID() {
		return scopusAuthorID;
	}

	public void setScopusAuthorID(String scopusAuthorID) {
		this.scopusAuthorID = scopusAuthorID;
	}

	public Research_Group getResearch_Group() {
		return research_Group;
	}

	public void setResearch_Group(Research_Group research_Group) {
		this.research_Group = research_Group;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public List<Authors> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Authors> authors) {
		this.authors = authors;
	}
	
	
	
}
