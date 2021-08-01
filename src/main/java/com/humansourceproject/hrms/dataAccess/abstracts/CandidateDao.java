package com.humansourceproject.hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import com.humansourceproject.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer>{
	
}
