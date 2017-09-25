package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the OEP_RESULTS database table.
 * 
 */
@Embeddable
public class OepResultPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="RESULT_ID")
	private long resultId;

	@Column(name="USER_ID", insertable=false, updatable=false)
	private long userId;

	@Column(name="COURSE_ID", insertable=false, updatable=false)
	private long courseId;

	public OepResultPK() {
	}
	public long getResultId() {
		return this.resultId;
	}
	public void setResultId(long resultId) {
		this.resultId = resultId;
	}
	public long getUserId() {
		return this.userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getCourseId() {
		return this.courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OepResultPK)) {
			return false;
		}
		OepResultPK castOther = (OepResultPK)other;
		return 
			(this.resultId == castOther.resultId)
			&& (this.userId == castOther.userId)
			&& (this.courseId == castOther.courseId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.resultId ^ (this.resultId >>> 32)));
		hash = hash * prime + ((int) (this.userId ^ (this.userId >>> 32)));
		hash = hash * prime + ((int) (this.courseId ^ (this.courseId >>> 32)));
		
		return hash;
	}
}