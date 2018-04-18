package com.forum.configuration;


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
/**
 * 
 * @author zhangqc
 * @description 初始化线程池用于定时任务调度
 */
@Configuration
public class ScheduledConfig implements SchedulingConfigurer {
	@Value("${timerThreadPoolSize}")
	Integer size;
	@Override
	public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
	    scheduledTaskRegistrar.setScheduler(setTaskExecutors());
	}

	@Bean(destroyMethod="shutdown")
	public Executor setTaskExecutors(){
	    return Executors.newScheduledThreadPool(size); 
	}
}
