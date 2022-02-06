package net.revature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import net.revature.repository.AccountRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = AccountRepository.class)
public class PuppyPalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuppyPalsApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
