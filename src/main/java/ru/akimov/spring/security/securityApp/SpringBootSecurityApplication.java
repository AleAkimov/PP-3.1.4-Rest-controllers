package ru.akimov.spring.security.securityApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.akimov.spring.security.securityApp.config.CreateTable;

@SpringBootApplication
public class SpringBootSecurityApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(SpringBootSecurityApplication.class, args);
		app.getBean(CreateTable.class).create();
	}

}
