package com.bdi.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class ResourceConfig implements WebMvcConfigurer{

	@Value("${location.path}")
	private String locationPath;
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		log.info(locationPath);
		registry.addResourceHandler("/resources/**")
		.addResourceLocations(locationPath);
	}
}
