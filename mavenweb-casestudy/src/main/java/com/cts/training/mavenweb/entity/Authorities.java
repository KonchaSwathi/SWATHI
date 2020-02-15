package com.cts.training.mavenweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Authorities")
public class Authorities {
	@Column(name = "name")
	private String UserName;
	@Column(name = "name")
	private String AuthorityUserName;
	public Authorities() {
		
	}
	public Authorities(String userName, String authorityUserName) {
		
		this.UserName = userName;
		this.AuthorityUserName = authorityUserName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getAuthorityUserName() {
		return AuthorityUserName;
	}
	public void setAuthorityUserName(String authorityUserName) {
		AuthorityUserName = authorityUserName;
	}
	
	

}
