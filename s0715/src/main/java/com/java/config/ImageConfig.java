package com.java.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ImageConfig  implements WebMvcConfigurer {

	public void addResourceHandlers(ResourceHandlerRegistration registry) {
		// *은 전부, **은 모든디렉토리안에 모든것을 의미
		registry.addResourceLocations("/images/**")
		.addResourceLocations("file:///c:/upload/");
	}
}
