package com.cp.model;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.cp.demo.Product;
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
	@JoinColumn(name = "GroupID", referencedColumnName = "id")
	private Research_Group Research_Group_GroupID;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "University_UniversityId", referencedColumnName = "id")
	private Research_Group University_UniversityId;
	
	@JsonIgnore
	@OneToMany(targetEntity=Authors.class, mappedBy="authors",
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

	public Research_Group getResearch_Group_GroupID() {
		return Research_Group_GroupID;
	}

	public void setResearch_Group_GroupID(Research_Group research_Group_GroupID) {
		Research_Group_GroupID = research_Group_GroupID;
	}

	public Research_Group getUniversity_UniversityId() {
		return University_UniversityId;
	}

	public void setUniversity_UniversityId(Research_Group university_UniversityId) {
		University_UniversityId = university_UniversityId;
	}

	public List<Authors> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Authors> authors) {
		this.authors = authors;
	}
	
	
	
}
