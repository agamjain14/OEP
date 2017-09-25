package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the OEP_COURSE database table.
 * 
 */
@Entity
@Table(name="OEP_COURSE")
@NamedQuery(name="OepCourse.findAll", query="SELECT o FROM OepCourse o")
public class OepCourse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="COURSE_ID")
	private long courseId;

	@Column(name="COURSE_DESCRIPTION")
	private String courseDescription;

	@Column(name="COURSE_NAME")
	private String courseName;

	@Column(name="COURSE_NO_QUESTIONS")
	private BigDecimal courseNoQuestions;

	@Column(name="COURSE_PASSING_SCORE")
	private BigDecimal coursePassingScore;

	//bi-directional many-to-one association to OepQuestion
	@OneToMany(mappedBy="oepCourse")
	private List<OepQuestion> oepQuestions;

	//bi-directional many-to-one association to OepResult
	@OneToMany(mappedBy="oepCourse")
	private List<OepResult> oepResults;

	public OepCourse() {
	}

	public long getCourseId() {
		return this.courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseDescription() {
		return this.courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public BigDecimal getCourseNoQuestions() {
		return this.courseNoQuestions;
	}

	public void setCourseNoQuestions(BigDecimal courseNoQuestions) {
		this.courseNoQuestions = courseNoQuestions;
	}

	public BigDecimal getCoursePassingScore() {
		return this.coursePassingScore;
	}

	public void setCoursePassingScore(BigDecimal coursePassingScore) {
		this.coursePassingScore = coursePassingScore;
	}

	public List<OepQuestion> getOepQuestions() {
		return this.oepQuestions;
	}

	public void setOepQuestions(List<OepQuestion> oepQuestions) {
		this.oepQuestions = oepQuestions;
	}

	public OepQuestion addOepQuestion(OepQuestion oepQuestion) {
		getOepQuestions().add(oepQuestion);
		oepQuestion.setOepCourse(this);

		return oepQuestion;
	}

	public OepQuestion removeOepQuestion(OepQuestion oepQuestion) {
		getOepQuestions().remove(oepQuestion);
		oepQuestion.setOepCourse(null);

		return oepQuestion;
	}

	public List<OepResult> getOepResults() {
		return this.oepResults;
	}

	public void setOepResults(List<OepResult> oepResults) {
		this.oepResults = oepResults;
	}

	public OepResult addOepResult(OepResult oepResult) {
		getOepResults().add(oepResult);
		oepResult.setOepCourse(this);

		return oepResult;
	}

	public OepResult removeOepResult(OepResult oepResult) {
		getOepResults().remove(oepResult);
		oepResult.setOepCourse(null);

		return oepResult;
	}

}