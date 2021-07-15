package com.humansourceproject.hrms.business.abstracts;

import java.util.List;

import com.humansourceproject.hrms.core.utulities.results.DataResult;
import com.humansourceproject.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	DataResult<List<JobPosition>> getAll();
}
