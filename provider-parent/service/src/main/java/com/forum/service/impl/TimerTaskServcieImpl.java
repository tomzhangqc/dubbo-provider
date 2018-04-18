package com.forum.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.forum.service.TimerTaskService;

@Service
public class TimerTaskServcieImpl implements TimerTaskService {
	private Logger logger = LoggerFactory.getLogger(getClass());
//	@Scheduled(fixedRate = 1000)
	@Override
	public void task() {
		logger.info("定时任务打印1");
	}
	
}
