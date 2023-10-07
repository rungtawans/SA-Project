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
@Table(name = "followers")
public class Followers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="FollowerID")
	private String id;
	
	@Column(name ="NumberOfFollower")
	private int numberOfFollower;;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UserID", referencedColumnName = "id")
	private Users Users_UserID;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumberOfFollower() {
		return numberOfFollower;
	}

	public void setNumberOfFollower(int numberOfFollower) {
		this.numberOfFollower = numberOfFollower;
	}

	public Users getUsers_UserID() {
		return Users_UserID;
	}

	public void setUsers_UserID(Users users_UserID) {
		Users_UserID = users_UserID;
	}
	
}
