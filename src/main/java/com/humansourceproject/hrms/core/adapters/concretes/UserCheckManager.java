package com.humansourceproject.hrms.core.adapters.concretes;

import com.humansourceproject.hrms.core.adapters.abstracts.UserCheckService;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean CheckRealPerson(String identityNumber, String firstName, String lastName, int birthYear) {
		
		return false;
	}

}
