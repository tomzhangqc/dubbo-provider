package com.forum.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.forum.service.UserLoginService;

/**
 * 
 * @author User
 *
 */
@RestController
public class LoginController {
	@Resource
	UserLoginService userLoginServiceImpl;
	 private Logger logger = LoggerFactory.getLogger(getClass());
	    @RequestMapping("/login")
	    public String home() {
	    	HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	    	HttpSession session=request.getSession();
	    	session.setAttribute("name", "张三");
	    	logger.info("用户登陆了");
	    	return "hellow world";
	    }
}
