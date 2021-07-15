package com.humansourceproject.hrms.core.utulities.results;

public class SuccessResult extends Result{
	
	public SuccessResult() {
		// one parameter Result constructor
		super(true);
	}

	public SuccessResult(String message) {
		super(true,message);
		
	}

}
