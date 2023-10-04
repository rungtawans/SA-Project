package com.cp.model;

import java.time.Year;
import java.util.List;
import java.util.Set;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

//import javax.persistence.*;

@Entity
@Table(name = "Publication")
public class Publication {
    @Id
    @Column(name = "PaperID")
    private String paperID;

    @Column(name = "Title")
    private String title;

    @Column(name = "Abstract")
    private String abstractText;

    @Column(name = "PublishYear")
    private Integer publishYear;

    @Column(name = "ISSN")
    private String issn;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "DOI")
    private String doi;

    @Column(name = "ORCID")
    private String orcid;

    @Column(name = "University")
    private String university;

    @Column(name = "Publisher")
    private String publisher;

    @JsonIgnore
    @OneToMany(targetEntity=Publication_Area.class, mappedBy="Publication_Area",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Publication_Area> Publication_Area;
   
    @OneToOne(cascade = CascadeType.ALL)
 	@JoinColumn(name = "Quatile_SJR",referencedColumnName = "id")
	private Quatile_SJR Quatile_SJR;
    
    @ManyToOne(optional=false)
    @JoinColumn(name = "PaperStatistics_StatID", referencedColumnName = "StatID")
    private PaperStatistics PaperStatistics;
    
    @ManyToOne(optional=false)
    @JoinColumn(name = "PublicationrRanking_PublicationrRankingId", referencedColumnName = "PublicationrRankingId")
    private PublicationrRanking PublicationrRanking;

	public Publication(String paperID, String title, String abstractText, Integer publishYear, String issn, String isbn,
			String doi, String orcid, String university, String publisher,
			List<com.cp.model.Publication_Area> publication_Area, com.cp.model.Quatile_SJR quatile_SJR,
			com.cp.model.PaperStatistics paperStatistics, com.cp.model.PublicationrRanking publicationrRanking) {
		super();
		this.paperID = paperID;
		this.title = title;
		this.abstractText = abstractText;
		this.publishYear = publishYear;
		this.issn = issn;
		this.isbn = isbn;
		this.doi = doi;
		this.orcid = orcid;
		this.university = university;
		this.publisher = publisher;
		Publication_Area = publication_Area;
		Quatile_SJR = quatile_SJR;
		PaperStatistics = paperStatistics;
		PublicationrRanking = publicationrRanking;
	}

	public String getPaperID() {
		return paperID;
	}

	public void setPaperID(String paperID) {
		this.paperID = paperID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbstractText() {
		return abstractText;
	}

	public void setAbstractText(String abstractText) {
		this.abstractText = abstractText;
	}

	public Integer getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(Integer publishYear) {
		this.publishYear = publishYear;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getOrcid() {
		return orcid;
	}

	public void setOrcid(String orcid) {
		this.orcid = orcid;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public List<Publication_Area> getPublication_Area() {
		return Publication_Area;
	}

	public void setPublication_Area(List<Publication_Area> publication_Area) {
		Publication_Area = publication_Area;
	}

	public Quatile_SJR getQuatile_SJR() {
		return Quatile_SJR;
	}

	public void setQuatile_SJR(Quatile_SJR quatile_SJR) {
		Quatile_SJR = quatile_SJR;
	}

	public PaperStatistics getPaperStatistics() {
		return PaperStatistics;
	}

	public void setPaperStatistics(PaperStatistics paperStatistics) {
		PaperStatistics = paperStatistics;
	}

	public PublicationrRanking getPublicationrRanking() {
		return PublicationrRanking;
	}

	public void setPublicationrRanking(PublicationrRanking publicationrRanking) {
		PublicationrRanking = publicationrRanking;
	}
}
