package edu.phystech.client;

import edu.phystech.dbclients.DbConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@Import(DbConfiguration.class)
public class ClientConfiguration {
    private final DbConfiguration dataConfig;

    public ClientConfiguration(DbConfiguration dataConfig) {
        this.dataConfig = dataConfig;
    }

//    @Bean
//    public ClientDao clientDao() {
//        return new ClientDao(dataConfig.jdbcTemplate());
//    }
}
