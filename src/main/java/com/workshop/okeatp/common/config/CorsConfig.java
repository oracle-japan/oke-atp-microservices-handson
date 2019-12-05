package com.workshop.okeatp.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 
 * 
 * @author Global
 * @date Sep 14, 2019
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") //
				.allowedOrigins("*") //
				.allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE") //
				.maxAge(168000) //
				.allowedHeaders("*") //
				.allowCredentials(true); //
	}
}