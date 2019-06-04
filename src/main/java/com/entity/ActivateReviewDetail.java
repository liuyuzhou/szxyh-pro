package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 活动回顾表
 * 
 * @author lyz
 *
 */
@Entity
@Table(name = "activate_review_detail")
public class ActivateReviewDetail {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable = false, name = "activate_id", length = 11)
	private Integer activateId;
	@Column(nullable = false, name = "user_id", length = 11)
	private Integer userId;
	@Column(nullable = false, name = "user_name", length = 20)
	private String userName;
	@Lob
	@Column(nullable = true, columnDefinition = "TEXT")
	private Boolean comment;
	@Column(nullable = false, name = "create_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActivateId() {
		return activateId;
	}

	public void setActivateId(Integer activateId) {
		this.activateId = activateId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Boolean getComment() {
		return comment;
	}

	public void setComment(Boolean comment) {
		this.comment = comment;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
