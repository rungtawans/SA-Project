package com.cp.model;

import java.time.Year;
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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PaperStatistics")
public class PaperStatistics {
    @Id
    @Column(name = "StatID", length = 5)
    private String statId;

    @Column(name = "NumberOfViews")
    private Integer numberOfViews;

    @Column(name = "NumberOfCitations")
    private Integer numberOfCitations;

    @OneToOne
    @JoinColumn(name = "Year_YearId", referencedColumnName = "YearId")
    private Year year;
    
    @JsonIgnore
    @OneToMany(targetEntity=Publication.class, mappedBy="Publication",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Publication> Publication;

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

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public List<Publication> getPublication() {
		return Publication;
	}

	public void setPublication(List<Publication> publication) {
		Publication = publication;
	}

	public PaperStatistics(String statId, Integer numberOfViews, Integer numberOfCitations, Year year,
			List<com.cp.model.Publication> publication) {
		super();
		this.statId = statId;
		this.numberOfViews = numberOfViews;
		this.numberOfCitations = numberOfCitations;
		this.year = year;
		Publication = publication;
	}


    
}
