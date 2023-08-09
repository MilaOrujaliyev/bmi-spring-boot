package com.baskent.edu.tr.dbhw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DbHwApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbHwApplication.class, args);
	}


}
