package com.xworkz.bikeshowroom.intializer;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.bikeshowroom.beanConfig.SpringConfig;
@Component
public class SprinWeb extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer{

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
		return new String[] {"/"};
	}
@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	System.out.println("default handler is enable");
	configurer.enable();;
}
}
