package com.humansourceproject.hrms.core.utulities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data,String message) {
		// three parameter DataResult constructor
		super(data, true,message);
	}
	
	public SuccessDataResult(T data) {
		super(data, true);
	}
	
	public SuccessDataResult(String message) {		
		super(null, true,message);	
	}
	
	public SuccessDataResult() {
		super(null, true);
	}

}
