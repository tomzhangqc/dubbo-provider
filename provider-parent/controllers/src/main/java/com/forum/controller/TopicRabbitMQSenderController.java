package com.forum.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forum.service.TopicRabbitMQSenderService;
@RestController
public class TopicRabbitMQSenderController {
	@Resource
	TopicRabbitMQSenderService topicRabbitMQSenderServiceImpl;
	 private Logger logger = LoggerFactory.getLogger(getClass());
	    @RequestMapping("/topicRabbit")
	    public String home() {
	    	logger.info("topicrabbitsender被调用了");
	    	topicRabbitMQSenderServiceImpl.send();
	    	return "hellow world";
	    }
}
