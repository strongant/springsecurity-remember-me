package com.memorynotfound.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
/**
 *  如果你想使用XML的方式配置Spring Security 记住我配置时，请取消此注释并注释掉
 *  @see com.memorynotfound.spring.security.config.SecurityConfig#@EnableWebSecurity
 */
// @ImportResource("classpath:spring-security-config.xml")
public class Run {

    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }
}
