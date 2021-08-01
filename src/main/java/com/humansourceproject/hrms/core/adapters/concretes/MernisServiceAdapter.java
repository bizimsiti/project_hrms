package com.humansourceproject.hrms.core.adapters.concretes;


import java.rmi.RemoteException;

import org.springframework.stereotype.Component;

import com.humansourceproject.hrms.core.adapters.abstracts.UserCheckService;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class MernisServiceAdapter  implements UserCheckService{

	
	@Override
	
	public boolean CheckRealPerson(String identityNumber, String firstName, String lastName, int birthYear) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = false;
			try {
				result = client.TCKimlikNoDogrula(Long.parseLong(identityNumber), firstName.toUpperCase(),
						lastName.toUpperCase(),birthYear);
			} catch (RemoteException e) {
				
				e.printStackTrace();
			}
			return result;
	
		
	}}
