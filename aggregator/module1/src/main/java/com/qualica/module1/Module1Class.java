package com.qualica.module1;

import org.apache.log4j.Logger;

public class Module1Class {
	static Logger log = Logger.getLogger("Module 1");
	public boolean doSomething() {
		log.debug("MODULE ONE (1) HAS CHANGED AGAIN");
		return true;
	}
	
}
