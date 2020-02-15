package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
@Table(name="Media")
public class Media {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	@Column
	private Integer UserId;
	@Column
	private String Title;
	@Column
	private String Description;
	@Column
	private Integer Mimetype;
	@Column
	private Integer size;
	@Column
	private String posterFileUrl;
	@Column
	private String fileUrl;
	@Column
	private Boolean hide;
	@Column
	@CreationTimestamp
	private LocalDateTime createdOn;
	@Column
	@UpdateTimestamp
	private LocalDateTime updatedOn;
	@Column
	private String tags;
	
 public Media() {
	    }

public Media(Integer id, Integer userId, String title, String description, Integer mimetype, Integer size,
			String posterFileUrl, String fileUrl, Boolean hide, LocalDateTime createdOn, LocalDateTime updatedOn,
			String tags) {
		super();
		this.Id = id;
		this.UserId = userId;
		this.Title = title;
		this.Description = description;
		this.Mimetype = mimetype;
		this.size = size;
		this.posterFileUrl = posterFileUrl;
		this.fileUrl = fileUrl;
		this.hide = hide;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.tags = tags;
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


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public Integer getMimetype() {
		return Mimetype;
	}


	public void setMimetype(Integer mimetype) {
		Mimetype = mimetype;
	}


	public Integer getSize() {
		return size;
	}


	public void setSize(Integer size) {
		this.size = size;
	}


	public String getPosterFileUrl() {
		return posterFileUrl;
	}


	public void setPosterFileUrl(String posterFileUrl) {
		this.posterFileUrl = posterFileUrl;
	}


	public String getFileUrl() {
		return fileUrl;
	}


	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}


	public Boolean getHide() {
		return hide;
	}


	public void setHide(Boolean hide) {
		this.hide = hide;
	}


	public LocalDateTime getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}


	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}


	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}


	public String getTags() {
		return tags;
	}


	public void setTags(String tags) {
		this.tags = tags;
	}
	

	

}
