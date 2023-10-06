package com.cp.model;

//import java.time.Year;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Quatile_SJR", referencedColumnName = "QuatileSJRId")
	private Quatile_SJR quatile_SJR;

	@ManyToOne(optional = false)
	@JoinColumn(name = "FacultyPublicationRankings_FacultyPublicationRankings_Id", referencedColumnName = "FacultyPublicationRankings_Id")
	private PublicationRanking facultyPublicationRankings;

	@ManyToOne(optional = false)
	@JoinColumn(name = "PaperStatistics_StatID", referencedColumnName = "StatID")
	private PaperStatistics paperStatistics;

	@ManyToOne(optional = false)
	@JoinColumn(name = "PublicationrRanking_PublicationrRankingId", referencedColumnName = "PublicationrRankingId")
	private PublicationRanking publicationRanking;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Publication_Authors_PublicationAuthorsId", referencedColumnName = "PublicationAuthorsId")
	private Publication_Authors publication_AuthorsPublication_Authors;

//  @JsonIgnore
	@OneToMany(targetEntity = Publication_Area.class, mappedBy = "Publication_Area", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Publication_Area> publication_Area;

	public Publication(String paperID, String title, String abstractText, Integer publishYear, String issn, String isbn,
			String doi, String orcid, String university, String publisher, List<Publication_Area> publication_Area,
			Quatile_SJR quatile_SJR, PaperStatistics paperStatistics, PublicationRanking publicationRanking) {
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
		this.publication_Area = publication_Area;
		this.quatile_SJR = quatile_SJR;
		this.paperStatistics = paperStatistics;
		this.publicationRanking = publicationRanking;
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
		return publication_Area;
	}

	public void setPublication_Area(List<Publication_Area> publication_Area) {
		this.publication_Area = publication_Area;
	}

	public Quatile_SJR getQuatile_SJR() {
		return quatile_SJR;
	}

	public void setQuatile_SJR(Quatile_SJR quatile_SJR) {
		this.quatile_SJR = quatile_SJR;
	}

	public PaperStatistics getPaperStatistics() {
		return paperStatistics;
	}

	public void setPaperStatistics(PaperStatistics paperStatistics) {
		this.paperStatistics = paperStatistics;
	}

	public PublicationRanking getPublicationRanking() {
		return publicationRanking;
	}

	public void setPublicationRanking(PublicationRanking publicationRanking) {
		this.publicationRanking = publicationRanking;
	}

	public PublicationRanking getFacultyPublicationRankings() {
		return facultyPublicationRankings;
	}

	public void setFacultyPublicationRankings(PublicationRanking facultyPublicationRankings) {
		this.facultyPublicationRankings = facultyPublicationRankings;
	}

	public Publication_Authors getPublication_AuthorsPublication_Authors() {
		return publication_AuthorsPublication_Authors;
	}

	public void setPublication_AuthorsPublication_Authors(Publication_Authors publication_AuthorsPublication_Authors) {
		this.publication_AuthorsPublication_Authors = publication_AuthorsPublication_Authors;
	}

}
