package com.humansourceproject.hrms.business.abstracts;

import java.util.List;

import com.humansourceproject.hrms.core.utulities.results.DataResult;
import com.humansourceproject.hrms.core.utulities.results.Result;
import com.humansourceproject.hrms.entities.concretes.Candidate;


public interface CandidateService {


	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidate);
}
