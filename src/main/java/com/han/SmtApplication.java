package com.han;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmtApplication.class, args);
		System.out.println("启动完毕");
	}

}
