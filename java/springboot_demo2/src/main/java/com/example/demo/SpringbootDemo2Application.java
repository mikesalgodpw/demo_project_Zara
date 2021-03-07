package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
  original code
 
  
@SpringBootApplication
public class SpringbootDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo2Application.class, args);
	}

}
*/


@SpringBootApplication
public class SpringbootDemo2Application extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(SpringbootDemo2Application.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringbootDemo2Application.class, args);
  }
}