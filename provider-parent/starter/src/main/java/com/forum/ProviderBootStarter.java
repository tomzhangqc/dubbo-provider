package com.forum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@MapperScan("com.forum.dao")
@EnableScheduling
@ServletComponentScan
@EnableRedisHttpSession(redisNamespace="xxxx",maxInactiveIntervalInSeconds = 3600)
public class ProviderBootStarter {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProviderBootStarter.class, args);
    }
}
