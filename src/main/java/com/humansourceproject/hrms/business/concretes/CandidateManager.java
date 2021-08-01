package com.humansourceproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humansourceproject.hrms.business.abstracts.CandidateService;
import com.humansourceproject.hrms.core.adapters.abstracts.UserCheckService;
import com.humansourceproject.hrms.core.utulities.results.DataResult;
import com.humansourceproject.hrms.core.utulities.results.ErrorResult;
import com.humansourceproject.hrms.core.utulities.results.Result;
import com.humansourceproject.hrms.core.utulities.results.SuccessDataResult;
import com.humansourceproject.hrms.core.utulities.results.SuccessResult;
import com.humansourceproject.hrms.dataAccess.abstracts.CandidateDao;
import com.humansourceproject.hrms.entities.concretes.Candidate;


@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	private UserCheckService userCheckService;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao,UserCheckService userCheckService) {
		super();
		this.candidateDao = candidateDao;
		this.userCheckService = userCheckService;
	}
	
	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(candidateDao.findAll(), "iş arayanlar listelendi");
		
	}



	@Override
	public Result add(Candidate candidate) {
		 if(userCheckService.CheckRealPerson(candidate.getIdendityNumber(),candidate.getFirstName(), candidate.getLastName(), candidate.getBirthYear()))
		 { 
			 this.candidateDao.save(candidate); return new SuccessResult("İş arayan bilgisi eklendi :)");
		} return new ErrorResult("Bilgiler Hatalı");
				 
	}

}

