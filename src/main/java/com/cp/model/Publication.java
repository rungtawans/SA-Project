package com.cp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @OneToMany(mappedBy = "publication", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Publication_Area> publication_Areas;

    
    @JsonIgnore
    @OneToMany(targetEntity=Publication_Area.class, mappedBy="The_Research_Area",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<The_Research_Area> The_Research_Area;
   
    @OneToOne(cascade = CascadeType.ALL)
 	@JoinColumn(name = "QuatileSJRId",referencedColumnName = "Quatile_SJR_QuatileSJRId")
	private Quatile_SJR quatile_SJR ;
    
    public Publication(String paperID, String title, String abstractText, Integer publishYear, String issn, String isbn,
			String doi, String orcid, String university, String publisher, List<Publication_Area> publication_Areas,
			List<com.cp.model.The_Research_Area> the_Research_Area, Quatile_SJR quatile_SJR,
			PaperStatistics paperStatistics, PublicationrRanking publicationrRanking,
			Publication_Authors publication_Authors, com.cp.model.FacultyPublicationRankings facultyPublicationRankings/*,
			Year year*/) {
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
		this.publication_Areas = publication_Areas;
		The_Research_Area = the_Research_Area;
		this.quatile_SJR = quatile_SJR;
		this.paperStatistics = paperStatistics;
		this.publicationrRanking = publicationrRanking;
		this.publication_Authors = publication_Authors;
		FacultyPublicationRankings = facultyPublicationRankings;
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

	public List<Publication_Area> getPublication_Areas() {
		return publication_Areas;
	}

	public void setPublication_Areas(List<Publication_Area> publication_Areas) {
		this.publication_Areas = publication_Areas;
	}

	public List<The_Research_Area> getThe_Research_Area() {
		return The_Research_Area;
	}

	public void setThe_Research_Area(List<The_Research_Area> the_Research_Area) {
		The_Research_Area = the_Research_Area;
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

	public PublicationrRanking getPublicationrRanking() {
		return publicationrRanking;
	}

	public void setPublicationrRanking(PublicationrRanking publicationrRanking) {
		this.publicationrRanking = publicationrRanking;
	}

	public Publication_Authors getPublication_Authors() {
		return publication_Authors;
	}

	public void setPublication_Authors(Publication_Authors publication_Authors) {
		this.publication_Authors = publication_Authors;
	}

	public FacultyPublicationRankings getFacultyPublicationRankings() {
		return FacultyPublicationRankings;
	}

	public void setFacultyPublicationRankings(FacultyPublicationRankings facultyPublicationRankings) {
		FacultyPublicationRankings = facultyPublicationRankings;
	}

	@ManyToOne(optional=false)
    @JoinColumn(name = "StatID", referencedColumnName = "PaperStatistics_StatID")
    //private PaperStatistics PaperStatistics;
    private PaperStatistics paperStatistics;
    
    @ManyToOne(optional=false)
    @JoinColumn(name = "PublicationrRankingId", referencedColumnName = "PublicationrRanking_PublicationrRankingId")
    private PublicationrRanking publicationrRanking;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Publication_Authors_PublicationAuthorsId",referencedColumnName = "PublicationAuthorsId")
	private Publication_Authors publication_Authors;
    
    @ManyToOne(optional=false)
    @JoinColumn(name = "FacultyPublicationRankings_FacultyPublicationRankings_Id", referencedColumnName = "FacultyPublicationRankings_Id")
    private FacultyPublicationRankings FacultyPublicationRankings;

    

}
