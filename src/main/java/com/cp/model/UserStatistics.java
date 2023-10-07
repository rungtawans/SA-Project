package com.cp.model;

import java.time.LocalDateTime;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@EntityScan
@Table(name = "userstatistics")
public class UserStatistics {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="StatID")
	private String id;
	
	@Column(name ="NumberOfSearches")
	private int numOfSearches;
	
	@Column(name ="NumberOfBookmarks")
	private int numOfBookmarks;
	
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

	public int getNumOfSearches() {
		return numOfSearches;
	}

	public void setNumOfSearches(int numOfSearches) {
		this.numOfSearches = numOfSearches;
	}

	public int getNumOfBookmarks() {
		return numOfBookmarks;
	}

	public void setNumOfBookmarks(int numOfBookmarks) {
		this.numOfBookmarks = numOfBookmarks;
	}

	public Users getUsers_UserID() {
		return Users_UserID;
	}

	public void setUsers_UserID(Users users_UserID) {
		Users_UserID = users_UserID;
	}

	
}
