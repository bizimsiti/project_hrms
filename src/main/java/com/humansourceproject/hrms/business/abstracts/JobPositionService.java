package com.humansourceproject.hrms.business.abstracts;

import java.util.List;

import com.humansourceproject.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();
}
