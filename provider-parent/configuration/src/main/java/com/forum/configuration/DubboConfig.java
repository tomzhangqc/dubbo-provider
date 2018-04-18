package com.forum.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations={"classpath:config/dubbo-provider.xml"})
public class DubboConfig {
	
}
