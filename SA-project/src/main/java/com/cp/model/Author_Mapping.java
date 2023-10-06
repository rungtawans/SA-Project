package com.cp.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@EntityScan
@Table(name = "author_mapping")
public class Author_Mapping {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Author_Mapping_ID")
	private String id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Users_UserID", referencedColumnName = "UserID")
	private Users users;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Authors_Authors_Id", referencedColumnName = "Authors_Id")
	private Authors authors;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Authors getAuthors() {
		return authors;
	}

	public void setAuthors(Authors authors) {
		this.authors = authors;
	}
	
}
