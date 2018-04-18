package com.forum.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;
import com.forum.service.DubboProviderService;

@Service(version = "1.0.0")
public class DubboProviderServiceImpl implements DubboProviderService {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void provider() {
		logger.info("生产方被调用了");
	}

}
