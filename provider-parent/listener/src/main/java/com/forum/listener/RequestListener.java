package com.forum.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@WebListener
public class RequestListener implements ServletRequestListener{
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		logger.info("走了requestlistener");
	}

}
