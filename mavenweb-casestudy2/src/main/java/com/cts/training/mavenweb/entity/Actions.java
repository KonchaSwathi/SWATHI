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
@Table(name="actions")
public class Actions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	@Column
	private Integer MediaId;
	@Column
	private Integer UserId;
	@Column
	private String Status;
	@Column
	@CreationTimestamp
	private LocalDateTime createdOn;
	
	public Actions() {
	}


	public Actions(Integer id, Integer mediaId, Integer userId, String status, LocalDateTime createdOn) {
		this.Id = id;
		this.MediaId = mediaId;
		this.UserId = userId;
		this.Status = status;
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


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public LocalDateTime getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	
	

}
