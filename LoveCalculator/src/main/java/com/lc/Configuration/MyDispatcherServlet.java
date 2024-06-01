package com.lc.Configuration;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.lc")
@PropertySource("classpath:Email.properties")


public class MyDispatcherServlet implements WebMvcConfigurer {
	
	@Autowired
	Environment env;
	
	
	
	@Bean
	public InternalResourceViewResolver viewResolver ()
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/Views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}
	
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
	
	
	@Bean
	public  JavaMailSender javaMailSender()
	{
		
		String hostAddress= env.getProperty("Host")  ;
		String emailUserName= env.getProperty("setUsername");
		String emailPwd= env.getProperty("setPassword");
		int emailPort= Integer.parseInt(env.getProperty("setPort"));
		
		
		System.out.println(hostAddress);
		System.out.println(emailPwd);
		System.out.println(emailUserName);
		System.out.println(emailPort);
		
		
		JavaMailSenderImpl  javaMailImpl = new JavaMailSenderImpl();
		javaMailImpl.setHost(hostAddress);
		javaMailImpl.setUsername(emailUserName);
		javaMailImpl.setPassword(emailPwd);
		javaMailImpl.setPort( emailPort);
		
		Properties mailProperties = new Properties();
		mailProperties.put("mail.smtp.auth",true);
		mailProperties.put("mail.smtp.starttls.enable", true);
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		javaMailImpl.setJavaMailProperties(mailProperties);
		
		return javaMailImpl;
		
	}
	
	
	
	

}