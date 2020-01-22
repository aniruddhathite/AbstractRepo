package com.abstractRepo.Server.service;

import javax.inject.Named;

@Named
public class WelcomeService extends AbstractService{

	public String output;
	
	public String getOutput() {
		return output;
	}
	
	
	
	public void Service () {
		output= "welcome call to first service";
	}
	
}
