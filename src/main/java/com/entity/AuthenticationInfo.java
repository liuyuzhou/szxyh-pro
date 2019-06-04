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
 * 认证信息表
 * 
 * @author lyz
 *
 */
@Entity
@Table(name = "authentication_info")
public class AuthenticationInfo {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable = false, name = "certified_user_id", length = 11)
	private Integer certifiedUserId;
	@Column(nullable = false, name = "authenticator_id", length = 11)
	private Integer authenticatorId;
	@Column(nullable = false, name = "certifie_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private Date certifieTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCertifiedUserId() {
		return certifiedUserId;
	}

	public void setCertifiedUserId(Integer certifiedUserId) {
		this.certifiedUserId = certifiedUserId;
	}

	public Integer getAuthenticatorId() {
		return authenticatorId;
	}

	public void setAuthenticatorId(Integer authenticatorId) {
		this.authenticatorId = authenticatorId;
	}

	public Date getCertifieTime() {
		return certifieTime;
	}

	public void setCertifieTime(Date certifieTime) {
		this.certifieTime = certifieTime;
	}

}
