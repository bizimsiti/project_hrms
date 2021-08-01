package com.humansourceproject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.humansourceproject.hrms.business.abstracts.CandidateService;
import com.humansourceproject.hrms.core.utulities.results.DataResult;
import com.humansourceproject.hrms.core.utulities.results.Result;
import com.humansourceproject.hrms.entities.concretes.Candidate;



@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
	private CandidateService candidateService;
	
	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){
		return this.candidateService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}
	
}
