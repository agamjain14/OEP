package com.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the OEP_RESULTS database table.
 * 
 */
@Entity
@Table(name="OEP_RESULTS")
@NamedQuery(name="OepResult.findAll", query="SELECT o FROM OepResult o")
public class OepResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OepResultPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="RESULT_DATE")
	private Date resultDate;

	@Column(name="RESULT_SCORE")
	private BigDecimal resultScore;

	@Column(name="RESULT_STATUS")
	private String resultStatus;

	//bi-directional many-to-one association to OepCourse
	@ManyToOne
	@JoinColumn(name="COURSE_ID",insertable=false,updatable=false)
	private OepCourse oepCourse;

	//bi-directional many-to-one association to OepUser
	@ManyToOne
	@JoinColumn(name="USER_ID",insertable=false,updatable=false)
	private OepUser oepUser;

	public OepResult() {
	}

	public OepResultPK getId() {
		return this.id;
	}

	public void setId(OepResultPK id) {
		this.id = id;
	}

	public Date getResultDate() {
		return this.resultDate;
	}

	public void setResultDate(Date resultDate) {
		this.resultDate = resultDate;
	}

	public BigDecimal getResultScore() {
		return this.resultScore;
	}

	public void setResultScore(BigDecimal resultScore) {
		this.resultScore = resultScore;
	}

	public String getResultStatus() {
		return this.resultStatus;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	public OepCourse getOepCourse() {
		return this.oepCourse;
	}

	public void setOepCourse(OepCourse oepCourse) {
		this.oepCourse = oepCourse;
	}

	public OepUser getOepUser() {
		return this.oepUser;
	}

	public void setOepUser(OepUser oepUser) {
		this.oepUser = oepUser;
	}

}