package com.otv.task;

import org.apache.log4j.Logger;

/**
 * Second Task
 * 
 * @author  onlinetechvision.com
 * @since   24 Feb 2012
 * @version 1.0.0
 *
 */
public class SecondTask {

	private static Logger log = Logger.getLogger(SecondTask.class);
	
	/**
	 * Execute this task
	 * 
	 */
	public void execute() {
		log.debug("SecondTask runs successfully...");
	}	
}
