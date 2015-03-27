package com.jk.jnotepad;

import org.apache.commons.configuration.XMLConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class notepad {
	
	static final Logger log = LoggerFactory.getLogger(com.jk.jnotepad.notepad.class);
	
	public static void main(String[] args) {
		init();
		new main();
	}
	
	private static void init(){
		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
	    StatusPrinter.print(lc);
	    log.info(lc.toString());
	    // put code here to load properties
	    //XMLConfiguration config = new XMLConfiguration("./src/main/resources/config.xml");
	    
	}
}
