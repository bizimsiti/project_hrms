package com.humansourceproject.hrms.core.utulities.results;

public class ErrorResult extends Result{

	public ErrorResult() {
		//one parameter Result constructor
		super(false);
	}
	
	public ErrorResult(String message) {
		super(false,message);
		
	}
	
	

}
