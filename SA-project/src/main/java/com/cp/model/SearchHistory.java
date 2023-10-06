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
@Table(name = "searchhistory")
public class SearchHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="SearchID")
	private String id;
	
	@Column(name ="SearchQuery")
	private int searchQuery;
	
	@Column(name ="SearchDate")
	private LocalDateTime searchDate;
	
	//@JsonIgnore 
	@ManyToOne(optional=false)
	@JoinColumn(name = "Users_UserID", referencedColumnName = "UserID")
	private Users users;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSearchQuery() {
		return searchQuery;
	}

	public void setSearchQuery(int searchQuery) {
		this.searchQuery = searchQuery;
	}

	public LocalDateTime getSearchDate() {
		return searchDate;
	}

	public void setSearchDate(LocalDateTime searchDate) {
		this.searchDate = searchDate;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	
}
