package com.xworkz.mall.intializer;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.mall.config.SpringConfig;

public class WebSpring extends AbstractAnnotationConfigDispatcherServletInitializer implements
WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		return new Class[] {SpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		return new String [] {"/"};
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("DefaultServletHandlerConfigurer");
		configurer.enable();
	}
}
