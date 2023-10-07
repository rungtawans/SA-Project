package com.cp.model;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Publication_Authors")
public class Publication_Authors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="PublicationAuthorsId")
	private String id;
	
	@JsonIgnore
	@OneToMany(targetEntity=Authors.class, mappedBy="authors",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Authors> authors;

	@OneToOne(mappedBy = "publicationAuthors")
    private Publication publication;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Authors> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Authors> authors) {
		this.authors = authors;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public Publication_Authors(String id, List<Authors> authors, Publication publication) {
		super();
		this.id = id;
		this.authors = authors;
		this.publication = publication;
	}


	
}
