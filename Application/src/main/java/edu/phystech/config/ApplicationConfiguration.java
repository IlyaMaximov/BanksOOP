package edu.phystech.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("edu.phystech.client")
public class ApplicationConfiguration {

}
