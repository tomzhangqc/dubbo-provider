package com.forum.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@WebListener
public class SessionListener implements HttpSessionListener{
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		logger.info("走了session监听器");
		
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
