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
@Table(name = "PublicationrRanking")
public class PublicationRanking {

	@Id
	@Column(name = "PublicationrRankingId")
	private String publicationRankingId;

	@Column(name = "Ranking")
	private int rank;

//    @JsonIgnore
	@OneToMany(targetEntity = Publication.class, 
			mappedBy = "publication", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Publication> Publication;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Year_YearId", referencedColumnName = "YearId")
	private Year year;

	public PublicationRanking(String publicationRankingId, Integer rank, List<Publication> publication) {
		super();
		this.publicationRankingId = publicationRankingId;
		this.rank = rank;
		Publication = publication;
	}

	public String getPublicationrRankingId() {
		return publicationRankingId;
	}

	public void setPublicationrRankingId(String publicationrRankingId) {
		this.publicationRankingId = publicationrRankingId;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public List<Publication> getPublication() {
		return Publication;
	}

	public void setPublication(List<Publication> publication) {
		Publication = publication;
	}

	public String getPublicationRankingId() {
		return publicationRankingId;
	}

	public void setPublicationRankingId(String publicationRankingId) {
		this.publicationRankingId = publicationRankingId;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}