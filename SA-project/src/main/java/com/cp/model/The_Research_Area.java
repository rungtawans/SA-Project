package com.cp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

	public void setThe_Research_Area_Id(String the_Research_Area_Id) {
		The_Research_Area_Id = the_Research_Area_Id;
	}

	public String getThe_Research_Area_Name() {
		return The_Research_Area_Name;
	}

	public void setThe_Research_Area_Name(String the_Research_Area_Name) {
		The_Research_Area_Name = the_Research_Area_Name;
	}

	public The_Research_Area(String the_Research_Area_Id, String the_Research_Area_Name) {
		super();
		The_Research_Area_Id = the_Research_Area_Id;
		The_Research_Area_Name = the_Research_Area_Name;
	}

    
    // สร้าง getter และ setter สำหรับคุณสมบัติอื่น ๆ ของ Entity

    // สร้าง constructor และ method อื่น ๆ ตามความเหมาะสม
}