package com.qualica.module1;

import org.apache.log4j.Logger;

public class Module1Class {
	static Logger log = Logger.getLogger("Maven Parent");
	public boolean doSomething() {
		log.debug("MODULE ONE (1) NOW DOES THIS COMPLETELY NEW KIND OF THING");
		return true;
	}
	
}
