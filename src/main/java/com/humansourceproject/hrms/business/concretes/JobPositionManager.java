package com.humansourceproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humansourceproject.hrms.business.abstracts.JobPositionService;
import com.humansourceproject.hrms.core.utulities.results.DataResult;
import com.humansourceproject.hrms.core.utulities.results.Result;
import com.humansourceproject.hrms.core.utulities.results.SuccessDataResult;
import com.humansourceproject.hrms.core.utulities.results.SuccessResult;
import com.humansourceproject.hrms.dataAccess.abstracts.JobPositionDao;
import com.humansourceproject.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"iş pozisyonları listelendi !");	
	
	}


	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("iş pozisyonu eklendi");
	}

}
