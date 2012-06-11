package com.qualica.module2;

import org.apache.log4j.Logger;

import com.qualica.module1.Module1Class;


public class Module2Class {
	static Logger log = Logger.getLogger("Module 2");
	public boolean doSomething() {
		log.debug("I AM MODULE 2 and I am invoking Module 1: ");
		log.debug(new Module1Class().doSomething());
		return true;
	}
	
}
