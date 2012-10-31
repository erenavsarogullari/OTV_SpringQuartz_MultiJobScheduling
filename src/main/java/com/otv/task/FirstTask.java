package com.otv.task;

import org.apache.log4j.Logger;


/**
 * First Task
 * 
 * @author  onlinetechvision.com
 * @since   24 Feb 2012
 * @version 1.0.0
 *
 */
public class FirstTask {
	
	private static Logger log = Logger.getLogger(FirstTask.class);
	
	/**
	 * Execute this task
	 * 
	 */
	public void execute() {
		log.debug("FirstTask runs successfully...");
	}	
}
