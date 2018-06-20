package com.conditional.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.conditional.devservice.DevServiceI;
//@PropertySource("classpath:application.properties")
@PropertySource(value = { "classpath:application.properties" })
@Component
public class EntryPoint {
	
	//@Resource(name = "${beanName}")
	@Resource(name = "${beanName}")
	public DevServiceI devServiceI;
	
	public void ServiceCall(){
		devServiceI.doOperation();
	}
}
