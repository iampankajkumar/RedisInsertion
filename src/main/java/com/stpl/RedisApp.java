package com.stpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@ComponentScan("com.stpl.*")
@EnableJpaRepositories("com.stpl.*")
@EntityScan("com.stpl.*")
@EnableCaching
@Controller
public class RedisApp {

	public static void main(String[] args) {
		SpringApplication.run(RedisApp.class, args);
	}

}
