package com.oep.dao;

import com.oep.model.OepResult;

public interface ExamDAO {
	public void enrollTest();

	void retrieve();

	void storeResult(OepResult result);
}
