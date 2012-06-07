package com.qualica.module2;

import org.apache.log4j.Logger;


public class Module2Class {
	static Logger log = Logger.getLogger("Maven Parent");
	public boolean doSomething() {
		log.debug("I AM MODULE 2 - TWO - yes TWO  2 (2) and also in GIT");
		return true;
	}
	
}
