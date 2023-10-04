package com.cp.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;



import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@EntityScan
@Table(name = "recommendations")
public class Recommendations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="RecommendationID")
	private String id;
	
	

	//@JsonIgnore 
	@ManyToOne(optional=false)
	@JoinColumn(name = "UserID", referencedColumnName = "id")
	private Users Users_UserID;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Users getUsers_UserID() {
		return Users_UserID;
	}

	public void setUsers_UserID(Users users_UserID) {
		Users_UserID = users_UserID;
	}	
	
}
