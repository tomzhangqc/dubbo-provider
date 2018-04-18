package com.forum.interceptor.registered;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.forum.interceptor.ChannelInterceptor;
import com.forum.interceptor.CoreInterceptor;

/**
 * 
 * @author zhangqc
 * @description 注册拦截器链
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter{
	  @Override    
	    public void addInterceptors(InterceptorRegistry registry) {    
	      //注册拦截器链
		  registry.addInterceptor(new CoreInterceptor()).addPathPatterns("/**").excludePathPatterns("/admin");
		  registry.addInterceptor(new ChannelInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
		  super.addInterceptors(registry);  
	    }    
}
