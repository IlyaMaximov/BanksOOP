package edu.phystech.dbclients;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfiguration {

    @Bean(name = "mysqlDataSource")
    public DataSource getMysqlDataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        String host = System.getenv().getOrDefault("MYSQL_HOST", "localhost");
        int port = Integer.parseInt(System.getenv().getOrDefault("MYSQL_PORT", "3306"));
        String user = System.getenv().getOrDefault("MYSQL_USER", "root");
        String password = System.getenv().getOrDefault("MYSQL_PASSWORD", "root");
        String database = System.getenv().getOrDefault("MYSQL_DATABASE", "banks");
        dataSource.setPort(port);
        dataSource.setServerName(host);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setDatabaseName(database);
        return dataSource;
    }
}
