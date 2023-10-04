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
	@JoinColumn(name = "UserID", referencedColumnName = "id")
	private Users Users_UserID;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Authors_Id", referencedColumnName = "id")
	private Authors Authors_Authors_Id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Authors_Publication_Authors_PublicationAuthorsId", referencedColumnName = "id")
	private Authors Authors_Publication_Authors_PublicationAuthorsId;

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

	public Authors getAuthors_Authors_Id() {
		return Authors_Authors_Id;
	}

	public void setAuthors_Authors_Id(Authors authors_Authors_Id) {
		Authors_Authors_Id = authors_Authors_Id;
	}

	public Authors getAuthors_Publication_Authors_PublicationAuthorsId() {
		return Authors_Publication_Authors_PublicationAuthorsId;
	}

	public void setAuthors_Publication_Authors_PublicationAuthorsId(
			Authors authors_Publication_Authors_PublicationAuthorsId) {
		Authors_Publication_Authors_PublicationAuthorsId = authors_Publication_Authors_PublicationAuthorsId;
	}
	
	
}
