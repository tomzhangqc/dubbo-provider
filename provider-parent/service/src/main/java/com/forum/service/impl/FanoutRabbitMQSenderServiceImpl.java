package com.forum.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import com.forum.service.FanoutRabbitMQSenderService;
@Service
public class FanoutRabbitMQSenderServiceImpl implements FanoutRabbitMQSenderService{
	@Resource
	private AmqpTemplate rabbitTemplate;
	Logger log=LoggerFactory.getLogger(getClass());
	@Override
	public void send() {
		String context = "这是一个fanout消息";
		log.info("Sende message is " + context);
	    this.rabbitTemplate.convertAndSend("fanoutExchange", "", context);
	}

}
