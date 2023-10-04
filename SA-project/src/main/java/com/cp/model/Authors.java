package com.cp.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@EntityScan
@Table(name = "authors")
public class Authors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Authors_Id")
	private String id;
	
	@Column(name ="AuthorShortName")
	private String authorShortName;
	
	@Column(name ="ScopusAuthorID")
	private String scopusAuthorID;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "PublicationAuthorsId", referencedColumnName = "id")
	private Publication_Authors Publication_Authors_PublicationAuthorsId;

	@ManyToOne(optional=false)
	@JoinColumn(name = "Research_Group_Authors_id", referencedColumnName = "id")
	private Research_Group_Authors Research_Group_Authors_Research_Group_Authors_id;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "Research_Group_GroupID", referencedColumnName = "id")
	private Research_Group_Authors Research_Group_Authors_Research_Group_GroupID;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "University_UniversityId", referencedColumnName = "id")
	private Research_Group_Authors Research_Group_Authors_University_UniversityId;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EducationHistoryId", referencedColumnName = "id")
	private EducationHistory EducationHistory_EducationHistoryId;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getAuthorShortName() {
		return authorShortName;
	}


	public void setAuthorShortName(String authorShortName) {
		this.authorShortName = authorShortName;
	}


	public String getScopusAuthorID() {
		return scopusAuthorID;
	}


	public void setScopusAuthorID(String scopusAuthorID) {
		this.scopusAuthorID = scopusAuthorID;
	}


	public Publication_Authors getPublication_Authors_PublicationAuthorsId() {
		return Publication_Authors_PublicationAuthorsId;
	}


	public void setPublication_Authors_PublicationAuthorsId(Publication_Authors publication_Authors_PublicationAuthorsId) {
		Publication_Authors_PublicationAuthorsId = publication_Authors_PublicationAuthorsId;
	}


	public Research_Group_Authors getResearch_Group_Authors_Research_Group_Authors_id() {
		return Research_Group_Authors_Research_Group_Authors_id;
	}


	public void setResearch_Group_Authors_Research_Group_Authors_id(
			Research_Group_Authors research_Group_Authors_Research_Group_Authors_id) {
		Research_Group_Authors_Research_Group_Authors_id = research_Group_Authors_Research_Group_Authors_id;
	}


	public Research_Group_Authors getResearch_Group_Authors_Research_Group_GroupID() {
		return Research_Group_Authors_Research_Group_GroupID;
	}


	public void setResearch_Group_Authors_Research_Group_GroupID(
			Research_Group_Authors research_Group_Authors_Research_Group_GroupID) {
		Research_Group_Authors_Research_Group_GroupID = research_Group_Authors_Research_Group_GroupID;
	}


	public Research_Group_Authors getResearch_Group_Authors_University_UniversityId() {
		return Research_Group_Authors_University_UniversityId;
	}


	public void setResearch_Group_Authors_University_UniversityId(
			Research_Group_Authors research_Group_Authors_University_UniversityId) {
		Research_Group_Authors_University_UniversityId = research_Group_Authors_University_UniversityId;
	}


	public EducationHistory getEducationHistory_EducationHistoryId() {
		return EducationHistory_EducationHistoryId;
	}


	public void setEducationHistory_EducationHistoryId(EducationHistory educationHistory_EducationHistoryId) {
		EducationHistory_EducationHistoryId = educationHistory_EducationHistoryId;
	}
	
	
}
