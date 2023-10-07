package com.cp.model;

//import java.time.Year;
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

@Entity
@Table(name = "PaperStatistics")
public class PaperStatistics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StatID", length = 5)
    private String statId;

    @Column(name = "NumberOfViews")
    private Integer numberOfViews;

    @Column(name = "NumberOfCitations")
    private Integer numberOfCitations;

    /*@ManyToOne
    @JoinColumn(name = "YearId", referencedColumnName = "YearId")
    private Year year;*/
    
    @JsonIgnore
    @OneToMany(mappedBy = "paperStatistics")
    private List<Publication> publications;

	public String getStatId() {
		return statId;
	}

	public void setStatId(String statId) {
		this.statId = statId;
	}

	public Integer getNumberOfViews() {
		return numberOfViews;
	}

	public void setNumberOfViews(Integer numberOfViews) {
		this.numberOfViews = numberOfViews;
	}

	public Integer getNumberOfCitations() {
		return numberOfCitations;
	}

	public void setNumberOfCitations(Integer numberOfCitations) {
		this.numberOfCitations = numberOfCitations;
	}

	/*public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}*/

	public List<Publication> getPublications() {
		return publications;
	}

	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}

	public PaperStatistics(String statId, Integer numberOfViews, Integer numberOfCitations,/* Year year,*/
			List<Publication> publications) {
		super();
		this.statId = statId;
		this.numberOfViews = numberOfViews;
		this.numberOfCitations = numberOfCitations;
		//this.year = year;
		this.publications = publications;
	}




    
}
