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
	
	@OneToOne(mappedBy = "followers")
    private Users users;


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

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	
}
