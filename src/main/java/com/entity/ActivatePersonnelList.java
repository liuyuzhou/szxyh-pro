package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 活动参与人列表
 * 
 * @author lyz
 *
 */
@Entity
@Table(name = "activate_personnel_list")
public class ActivatePersonnelList {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable = false, name = "activate_id", length = 11)
	private Integer activateId;
	@Column(nullable = false, name = "user_id", length = 11)
	private Integer userId;
	@Column(nullable = false, name = "user_name", length = 20)
	private String userName;
	@Column(nullable = false, name = "is_drive")
	private Boolean isDrive = Boolean.FALSE;
	@Column(nullable = false, name = "is_family")
	private Boolean isFamily = Boolean.FALSE;
	@Column(nullable = false, name = "is_manned")
	private Boolean isManned = Boolean.FALSE;
	@Column(nullable = false, name = "is_participate")
	private Boolean isParticipate = Boolean.TRUE;
	@Column(nullable = false, name = "create_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private Date createTime;
	@Column(nullable = false, name = "update_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private Date updateTime;

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

	public Boolean getIsDrive() {
		return isDrive;
	}

	public void setIsDrive(Boolean isDrive) {
		this.isDrive = isDrive;
	}

	public Boolean getIsFamily() {
		return isFamily;
	}

	public void setIsFamily(Boolean isFamily) {
		this.isFamily = isFamily;
	}

	public Boolean getIsManned() {
		return isManned;
	}

	public void setIsManned(Boolean isManned) {
		this.isManned = isManned;
	}

	public Boolean getIsParticipate() {
		return isParticipate;
	}

	public void setIsParticipate(Boolean isParticipate) {
		this.isParticipate = isParticipate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
