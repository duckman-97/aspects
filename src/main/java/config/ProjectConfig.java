package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import service.CommentService;

@Configuration
@ComponentScan(basePackages ="services")
public class ProjectConfig {
	
	@Bean
	public CommentService service() {
	return new CommentService();
	
	}
}
