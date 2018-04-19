package com.forum.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forum.service.DirectRabbitMQSenderService;
@RestController
public class DirectRabbitMQSenderController {
	@Resource
	DirectRabbitMQSenderService rabbitMQSenderServiceImpl;
	 private Logger logger = LoggerFactory.getLogger(getClass());
	    @RequestMapping("/directRabbit")
	    public String home() {
	    	logger.info("rabbitsender被调用了");
	    	rabbitMQSenderServiceImpl.send();
	    	return "hellow world";
	    }
}
