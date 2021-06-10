package com.humansourceproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.humansourceproject.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition,Integer>{

}
