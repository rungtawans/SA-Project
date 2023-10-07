package com.cp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Publication_Area")
public class Publication_Area {
    @Id
    @Column(name = "PublicationAreaID")
    private String publicationAreaID;
    
    @Column(name = "SubjectArea")
    private String subjectArea;
    
    @ManyToOne(optional=false)
    @JoinColumn(name = "Publication_PaperID", referencedColumnName = "PaperID")
    private Publication publication;

	public String getPublicationAreaID() {
		return publicationAreaID;
	}

	public void setPublicationAreaID(String publicationAreaID) {
		this.publicationAreaID = publicationAreaID;
	}

	public String getSubjectArea() {
		return subjectArea;
	}

	public void setSubjectArea(String subjectArea) {
		this.subjectArea = subjectArea;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public Publication_Area(String publicationAreaID, String subjectArea, Publication publication) {
		super();
		this.publicationAreaID = publicationAreaID;
		this.subjectArea = subjectArea;
		this.publication = publication;
	}

}
