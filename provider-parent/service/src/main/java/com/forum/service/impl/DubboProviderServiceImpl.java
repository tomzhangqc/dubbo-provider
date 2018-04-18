package com.forum.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.forum.service.DubboProviderService;

@Service
public class DubboProviderServiceImpl implements DubboProviderService {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void provider() {
		logger.info("生产方被调用了");
	}

}
