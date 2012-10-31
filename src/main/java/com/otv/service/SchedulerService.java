
package com.otv.service;

import com.otv.task.FirstTask;
import com.otv.task.SecondTask;

/**
 * Scheduler Service Implementation
 * 
 * @author  onlinetechvision.com
 * @since   24 Feb 2012
 * @version 1.0.0
 *
 */
public class SchedulerService implements ISchedulerService {

	private FirstTask  firstTask;
	private SecondTask secondTask;
	
	/**
	 * Execute First Task
	 * 
	 */
	public void executeFirstTask() {
		getFirstTask().execute();
	}

	/**
	 * Execute Second Task
	 * 
	 */
	public void executeSecondTask() {
		getSecondTask().execute();
	}

	/**
	 * Get First Task
	 * 
	 * @return FirstTask
	 */
	public FirstTask getFirstTask() {
		return firstTask;
	}

	/**
	 * Set First Task
	 * 
	 * @param  firstTask First Task
	 */
	public void setFirstTask(FirstTask firstTask) {
		this.firstTask = firstTask;
	}

	/**
	 * Get Second Task
	 * 
	 * @return SecondTask
	 */
	public SecondTask getSecondTask() {
		return secondTask;
	}

	/**
	 * Set Second Task
	 * 
	 * @param  secondTask Second Task
	 */
	public void setSecondTask(SecondTask secondTask) {
		this.secondTask = secondTask;
	}
	
}
