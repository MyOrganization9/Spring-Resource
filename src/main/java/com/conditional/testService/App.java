package com.conditional.testService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.conditional.controller.EntryPoint;
import com.sun.glass.ui.Application;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appl= new ClassPathXmlApplicationContext("confi.xml");
    	EntryPoint ep=appl.getBean(EntryPoint.class);
    	ep.ServiceCall();
        System.out.println( "Hello World!" );
    }
}
