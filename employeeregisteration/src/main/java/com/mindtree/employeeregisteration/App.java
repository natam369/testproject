package com.mindtree.employeeregisteration;

import java.applet.AppletContext;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
	@Autowired
	ApplicationContext applicationContext;
	
    public static void main( String[] args )
    {
      
        SpringApplication.run(App.class, args);
    }
	
    @PostConstruct
    public void test()
    {
    	String[] beans=applicationContext.getBeanDefinitionNames();
    	for(int i=0;i<beans.length;i++) {
    		System.out.println("BEANS::"+beans[i]);
    	}
    }
}
