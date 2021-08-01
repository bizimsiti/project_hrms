package com.humansourceproject.hrms.core.adapters.abstracts;


public interface UserCheckService {
	public boolean CheckRealPerson(String identityNumber,String firstName,String lastName,int birthYear);

}
