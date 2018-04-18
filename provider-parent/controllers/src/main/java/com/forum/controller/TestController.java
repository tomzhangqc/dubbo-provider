package com.forum.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
public class TestController {
	 private Logger logger = LoggerFactory.getLogger(getClass());
	    @RequestMapping("/test")
	    @Cacheable(value = "user", key = "'user:'+#id", unless = "#result==null")
	    public String home() {
	    	HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	    	HttpSession session=request.getSession();
	    	String name=session.getAttribute("name")+"";
	    	logger.info("*********************缓存中的值为:"+name+"*****************************");
	    	return "test";
	    }
}
