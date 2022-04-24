package edu.phystech.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource("classpath:/swagger.properties")
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi publicUserApi() {
        return GroupedOpenApi.builder()
                .group("Users")
                .pathsToMatch("/users/**")
                .build();
    }

    @Bean
    public OpenAPI customOpenApi(@Value("${swagger.application.description}")String appDescription,
                                 @Value("${swagger.application.version}")String appVersion) {
        return new OpenAPI().info(new Info().title("Banks API")
                        .version(appVersion)
                        .description(appDescription)
                        .contact(new Contact().name("pushind")
                                .email("pushin.da@phystech.edu")))
                .servers(List.of(new Server().url("http://localhost:8080")
                                .description("Dev service")));
    }
}
