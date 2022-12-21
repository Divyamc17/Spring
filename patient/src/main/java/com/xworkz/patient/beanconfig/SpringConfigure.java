package com.xworkz.patient.beanconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfigure {

	public SpringConfigure() {
		System.out.println("patient in SpringController");
	}

	@Bean
	LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean beanFactory = new LocalContainerEntityManagerFactoryBean();
		beanFactory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return beanFactory;
	}

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver view = new InternalResourceViewResolver("/", ".jsp");
		return view;
	}
	@Bean
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }


}
