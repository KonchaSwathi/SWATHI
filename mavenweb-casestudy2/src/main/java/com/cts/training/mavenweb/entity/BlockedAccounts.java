package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Blocked")
public class BlockedAccounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer BlockedUserId;
	@Column
	private Integer UserId;
	
	
	public BlockedAccounts() {
		
	}
	public BlockedAccounts(Integer userId, Integer blockedUserId) {
		this.UserId = userId;
		this.BlockedUserId = blockedUserId;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public Integer getBlockedUserId() {
		return BlockedUserId;
	}
	public void setBlockedUserId(Integer blockedUserId) {
		BlockedUserId = blockedUserId;
	}
	
	

}
