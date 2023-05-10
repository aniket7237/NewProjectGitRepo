package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//It enable the swagger documentation for project
@EnableSwagger2
@SpringBootApplication
public class SpringDemoCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoCrudApplication.class, args);
	}
@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).
				select().apis(RequestHandlerSelectors.basePackage("com.example.demo")).build();
		
	}
	
	
}
