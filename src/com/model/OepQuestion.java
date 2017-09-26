package com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the OEP_QUESTIONS database table.
 * 
 */
@Entity
@Table(name="OEP_QUESTIONS")
@NamedQuery(name="OepQuestion.findAll", query="SELECT o FROM OepQuestion o")
public class OepQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="QUESTION_ID")
	private long questionId;

	@Column(name="QUESTION_ANSWER")
	private String questionAnswer;

	@Column(name="QUESTION_DESCRIPTION")
	private String questionDescription;

	@Column(name="QUESTION_OPTIONS")
	private String questionOptions;

	//bi-directional many-to-one association to OepCourse
	@ManyToOne
	@JoinColumn(name="COURSE_ID")
	private OepCourse oepCourse;

	public OepQuestion() {
	}

	public long getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getQuestionAnswer() {
		return this.questionAnswer;
	}

	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	public String getQuestionDescription() {
		return this.questionDescription;
	}

	public void setQuestionDescription(String questionDescription) {
		this.questionDescription = questionDescription;
	}

	public String getQuestionOptions() {
		return this.questionOptions;
	}

	public void setQuestionOptions(String questionOptions) {
		this.questionOptions = questionOptions;
	}

	public OepCourse getOepCourse() {
		return this.oepCourse;
	}

	public void setOepCourse(OepCourse oepCourse) {
		this.oepCourse = oepCourse;
	}

}