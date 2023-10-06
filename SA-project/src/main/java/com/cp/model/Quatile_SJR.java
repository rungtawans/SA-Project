package com.cp.model;

import java.time.Year;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Quatile_SJR")
public class Quatile_SJR {
    @Id
    @Column(name = "QuatileSJRId")
    private String quatileSJRId;
    
    @Column(name = "Quatile")
    private String quatile;

    @OneToOne(mappedBy = "quatileSJR")
    private Publication publication;
    
    @OneToOne
    @JoinColumn(name = "Year_YearId", referencedColumnName = "YearId")
    private Year year;
    
    @OneToOne
    @JoinColumn(name = "Quatile_SJR_QuatileSJRId", referencedColumnName = "quatileSJRId")
    private Quatile_SJR quatile_SJR;

	public String getQuatileSJRId() {
		return quatileSJRId;
	}

	public void setQuatileSJRId(String quatileSJRId) {
		this.quatileSJRId = quatileSJRId;
	}

	public String getQuatile() {
		return quatile;
	}

	public void setQuatile(String quatile) {
		this.quatile = quatile;
	}

	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Quatile_SJR(String quatileSJRId, String quatile, Publication publication, Year year) {
		super();
		this.quatileSJRId = quatileSJRId;
		this.quatile = quatile;
		this.publication = publication;
		this.year = year;
	}

	public Quatile_SJR getQuatile_SJR() {
		return quatile_SJR;
	}

	public void setQuatile_SJR(Quatile_SJR quatile_SJR) {
		this.quatile_SJR = quatile_SJR;
	}

    
}

