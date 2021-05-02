package day3Homework1;

import logger.BaseLogger;

public class CustomerManager {
	private BaseLogger logger;//temel | base Class ile �al���yorum
	
	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("m��teri eklendi");
		logger.log();
	}
}
