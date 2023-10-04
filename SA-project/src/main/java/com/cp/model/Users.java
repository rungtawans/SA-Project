package com.cp.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.cp.demo.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@EntityScan
@Table(name = "users")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="UserID")
	private String id;
	
	@Column(name ="Username")
	private String username;
	
	@Column(name ="Password")
	private String password;
	
	@Column(name ="Email")
	private String email;
	
	@Column(name ="FullName")
	private String fullname;
	
	@Column(name ="CreatedAt")
	 private LocalDateTime createdAt;

	
	private Followers followers;
	
	@OneToOne(mappedBy ="users")
	public Followers getFollowers() {
		return followers;
	}
	public void setFollowers(Followers followers) {
		this.followers = followers;
	}
	
	@JsonIgnore
	@OneToMany(targetEntity=Recommendations.class, mappedBy="recommendations",
	    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	 private List<Recommendations> recommendations;
	public List<Recommendations> getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(List<Recommendations> recommendations) {
		this.recommendations = recommendations;
	}
	
	@JsonIgnore
	@OneToMany(targetEntity=Bookmarks.class, mappedBy="bookmarks",
		    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Bookmarks> bookmarks;

	public List<Bookmarks> getBookmarks() {
		return bookmarks;
	}

	public void setBookmarks(List<Bookmarks> bookmarks) {
		this.bookmarks = bookmarks;
	}
	
	@JsonIgnore
	@OneToMany(targetEntity=Comments.class, mappedBy="comments",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Comments> comments;
		
	public List<Comments> getComments() {
		return comments;
	}
	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	
	@JsonIgnore
	@OneToMany(targetEntity=UserStatistics.class, mappedBy="userstatistics",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<UserStatistics> userstatistics;
	
	public List<UserStatistics> getUserstatistics() {
		return userstatistics;
	}
	public void setUserstatistics(List<UserStatistics> userstatistics) {
		this.userstatistics = userstatistics;
	}
	
	@JsonIgnore
	@OneToMany(targetEntity=SearchHistory.class, mappedBy="searchhistory",
    		cascade=CascadeType.ALL, fetch = FetchType.LAZY)
	private List<SearchHistory> searchhistory;
	
	public List<SearchHistory> getSearchhistory() {
		return searchhistory;
	}
	public void setSearchhistory(List<SearchHistory> searchhistory) {
		this.searchhistory = searchhistory;
	}
	
	
	
/// 	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	
}
