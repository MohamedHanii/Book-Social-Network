package com.mhani.book;

import com.mhani.book.role.Role;
import com.mhani.book.role.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
public class BookNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookNetworkApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(RoleRepository roleRepository){
		return  args -> {
			if(roleRepository.findByName("USER").isEmpty()){
				roleRepository.save(Role.builder().name("USER").createdDate(LocalDateTime.now()).build());
			}
		};
	}

	
}
