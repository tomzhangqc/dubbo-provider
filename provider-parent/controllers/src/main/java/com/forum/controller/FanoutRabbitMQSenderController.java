package com.forum.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forum.service.FanoutRabbitMQSenderService;
@RestController
public class FanoutRabbitMQSenderController {
	@Resource
	FanoutRabbitMQSenderService fanoutRabbitMQSenderService;
	 private Logger logger = LoggerFactory.getLogger(getClass());
	    @RequestMapping("/fanoutRabbit")
	    public String home() {
	    	logger.info("fanoutrabbitsender被调用了");
	    	fanoutRabbitMQSenderService.send();
	    	return "hellow world";
	    }
}