package com.cp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "The_Research_Area")
public class The_Research_Area {
    @Id
    @Column(name = "The_Research_Area_Id")
    private String The_Research_Area_Id;
    
    @Column(name = "The_Research_Area_Name")
    private String The_Research_Area_Name;

	public String getThe_Research_Area_Id() {
		return The_Research_Area_Id;
	}
	@ManyToOne(optional=false)
    @JoinColumn(name = "Publication_Research_Area_Id", referencedColumnName = "The_Research_Area_Id")
    private Publication publication;
}