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
 * 活动信息表
 * 
 * @author lyz
 *
 */
@Entity
@Table(name = "activate_info")
public class ActivateInfo {
	@Id
	@GeneratedValue
	@Column(name = "activate_id")
	private Integer activateId;
	@Column(nullable = false, length = 100)
	private String title;
	@Column(nullable = false, name = "act_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "UTC")
	private Date actTime;
	@Column(nullable = false, name = "end_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private Date endTime;
	@Column(nullable = false, name = "act_creator", length = 50)
	private String act_creator;
	@Column(nullable = false, length = 300)
	private String content;
	@Column(nullable = false, name = "participate_num", length = 11)
	private Integer participateNum = Integer.valueOf(0);
	@Column(nullable = false)
	private Double cost = Double.valueOf(0);
	@Column(nullable = false, name = "create_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private Date createTime;
	@Column(nullable = false, name = "update_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private Date updateTime;

	public Integer getActivateId() {
		return activateId;
	}

	public void setActivateId(Integer activateId) {
		this.activateId = activateId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getActTime() {
		return actTime;
	}

	public void setActTime(Date actTime) {
		this.actTime = actTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getAct_creator() {
		return act_creator;
	}

	public void setAct_creator(String act_creator) {
		this.act_creator = act_creator;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getParticipateNum() {
		return participateNum;
	}

	public void setParticipateNum(Integer participateNum) {
		this.participateNum = participateNum;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
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
