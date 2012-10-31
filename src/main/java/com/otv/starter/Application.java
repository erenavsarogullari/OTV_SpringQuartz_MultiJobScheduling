package com.otv.starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application Starter Class
 * 
 * @author  onlinetechvision.com
 * @since   24 Feb 2012
 * @version 1.0.0
 *
 */
public class Application {
	
	/**
	 * Main method of the Application
	 * 
	 */
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}
}
