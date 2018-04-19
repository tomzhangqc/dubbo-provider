package com.forum.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import com.forum.service.DirectRabbitMQSenderService;

@Service
public class DirectRabbitMQSenderServiceImpl implements DirectRabbitMQSenderService{
	@Resource
	private AmqpTemplate rabbitTemplate;
	Logger log=LoggerFactory.getLogger(getClass());
	@Override
	public void send() {
	     String context = "这是一个direct消息";
	     log.info("Sender : " + context);
	     this.rabbitTemplate.convertAndSend("rabbit", context);
	}

}
