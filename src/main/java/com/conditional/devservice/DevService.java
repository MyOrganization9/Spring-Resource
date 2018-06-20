package com.conditional.devservice;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service
public class DevService implements DevServiceI {
	
	public void doOperation(){
		System.out.println("In Dev service");
	}

}
