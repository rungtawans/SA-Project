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
@Table(name = "comments")
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="CommentID")
	private String id;
	
	@Column(name ="Comment")
	private String comment;
	
	@Column(name ="CommentDate")
	private LocalDateTime commentDate;
	
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDateTime getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(LocalDateTime commentDate) {
		this.commentDate = commentDate;
	}

	public Users getUsers_UserID() {
		return Users_UserID;
	}

	public void setUsers_UserID(Users users_UserID) {
		Users_UserID = users_UserID;
	}
	
}
