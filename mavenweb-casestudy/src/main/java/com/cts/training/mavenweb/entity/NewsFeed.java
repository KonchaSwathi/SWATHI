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
@Table(name="News")
public class NewsFeed {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	@Column
	private Integer UserId;
	@Column
	private String Feed;
	@Column
	@CreationTimestamp
	private LocalDateTime createdOn;
	
  public NewsFeed() {
	}
	public NewsFeed(Integer id, Integer userId, String feed, LocalDateTime createdOn) {
		this.Id = id;
		this.UserId = userId;
		this.Feed = feed;
		this.createdOn = createdOn;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getFeed() {
		return Feed;
	}
	public void setFeed(String feed) {
		Feed = feed;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	
	

}
