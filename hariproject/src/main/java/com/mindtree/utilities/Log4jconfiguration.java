package com.mindtree.utilities;

import org.testng.log4testng.Logger;

public class Log4jconfiguration {
	
	public static Logger logger=Logger.getLogger(Log4jconfiguration.class);
	public void testLoggerDebug() {
		logger.debug("Hello.. im in Debug method");
	}

	public void testLoggerInfo() {
		logger.info("Hello.. im in Info method");
	}

	public void testLoggerWarn() {
		logger.warn("Hello.. im in Warn method");
	}

	public void testLoggerError() {
		logger.error("Hello.. im in Error method");
	}

	public void testLoggerFatal() {
		logger.fatal("Hello.. im in Fatal method");
	}
	
	public static void main(String[] args)
	{
		Log4jconfiguration lg=new Log4jconfiguration();
		lg.testLoggerDebug();
		lg.testLoggerInfo();
		lg.testLoggerError();
		lg.testLoggerFatal();
		lg.testLoggerWarn();
	}
			

}
