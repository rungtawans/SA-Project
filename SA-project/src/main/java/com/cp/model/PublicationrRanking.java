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
import jakarta.persistence.Table;

@Entity
@Table(name = "PublicationrRanking")
public class PublicationrRanking {
    public PublicationrRanking(String publicationrRankingId, Integer rank, List<com.cp.model.Publication> publication) {
		super();
		this.publicationrRankingId = publicationrRankingId;
		this.rank = rank;
		Publication = publication;
	}

	public String getPublicationrRankingId() {
		return publicationrRankingId;
	}

	public void setPublicationrRankingId(String publicationrRankingId) {
		this.publicationrRankingId = publicationrRankingId;
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

	@Id
    @Column(name = "PublicationrRankingId")
    private String publicationrRankingId;

    @Column(name = "Rank")
    private Integer rank;

    @JsonIgnore
    @OneToMany(targetEntity=Publication.class, mappedBy="Publication",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Publication> Publication;

    // ใส่ getters และ setters สำหรับทุกฟิลด์
}