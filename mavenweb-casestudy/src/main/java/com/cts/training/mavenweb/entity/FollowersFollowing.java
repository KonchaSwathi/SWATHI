package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Followers")
public class FollowersFollowing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer FollowerId;
	@Column
	private Integer UserId;
	
	public FollowersFollowing() {
		super();
	}
	public FollowersFollowing(Integer userId, Integer followerId) {
		this.UserId = userId;
		this.FollowerId = followerId;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public Integer getFollowerId() {
		return FollowerId;
	}
	public void setFollowerId(Integer followerId) {
		FollowerId = followerId;
	}
	
	

}
