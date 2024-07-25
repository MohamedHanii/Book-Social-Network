package com.mhani.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaRepositories
@EnableAsync
public class BookNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookNetworkApplication.class, args);
	}


	
}
