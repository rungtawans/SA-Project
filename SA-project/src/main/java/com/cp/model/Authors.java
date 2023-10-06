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
	@JoinColumn(name = "Publication_Authors_PublicationAuthorsId", referencedColumnName = "PublicationAuthorsId")
	private Publication_Authors publication_Authors;

	@ManyToOne(optional=false)
	@JoinColumn(name = "Research_Group_Authors_Research_Group_Authors_id", referencedColumnName = "Research_Group_Authors_id")
	private Research_Group_Authors research_Group_Authors;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "Research_Group_Authors_Research_Group_GroupID", referencedColumnName = "Research_Group_GroupID")
	private Research_Group research_Group;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "Research_Group_Authors_University_UniversityId", referencedColumnName = "University_UniversityId")
	private University university;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EducationHistory_EducationHistoryId", referencedColumnName = "EducationHistoryId")
	private EducationHistory educationHistory;
	
	@OneToOne(mappedBy = "authors")
    private Author_Mapping author_Mapping;

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

	public Publication_Authors getPublication_Authors() {
		return publication_Authors;
	}

	public void setPublication_Authors(Publication_Authors publication_Authors) {
		this.publication_Authors = publication_Authors;
	}

	public Author_Mapping getAuthor_Mapping() {
		return author_Mapping;
	}

	public void setAuthor_Mapping(Author_Mapping author_Mapping) {
		this.author_Mapping = author_Mapping;
	}

	public Research_Group_Authors getResearch_Group_Authors() {
		return research_Group_Authors;
	}

	public void setResearch_Group_Authors(Research_Group_Authors research_Group_Authors) {
		this.research_Group_Authors = research_Group_Authors;
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

	public EducationHistory getEducationHistory() {
		return educationHistory;
	}

	public void setEducationHistory(EducationHistory educationHistory) {
		this.educationHistory = educationHistory;
	}

}
