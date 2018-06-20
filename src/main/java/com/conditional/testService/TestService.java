package com.conditional.testService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.conditional.devservice.DevServiceI;
@Service
public class TestService implements DevServiceI{
	
	public void doOperation(){
		System.out.println("In test service");
	}
}
