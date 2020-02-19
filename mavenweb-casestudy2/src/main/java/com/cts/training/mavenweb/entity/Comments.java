package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
@Entity
@Table(name="comments")
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	@Column
	private Integer MediaId;
	@Column
	private Integer UserId;
	@Column
	private String Comment;
	@Column
	@CreationTimestamp
	private LocalDateTime createdOn;
	
	public Comments() {
	}
	public Comments(Integer id, Integer mediaId, Integer userId, String comment, LocalDateTime createdOn) {
		this.Id = id;
		 this.MediaId = mediaId;
		this.UserId = userId;
		this.Comment = comment;
		this.createdOn = createdOn;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getMediaId() {
		return MediaId;
	}
	public void setMediaId(Integer mediaId) {
		MediaId = mediaId;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	
	
	

}
