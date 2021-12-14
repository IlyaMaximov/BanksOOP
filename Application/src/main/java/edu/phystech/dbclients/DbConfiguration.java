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
        String host = System.getenv("MYSQL_HOST");
        int port = Integer.parseInt(System.getenv("MYSQL_PORT"));
        String user = System.getenv("MYSQL_USER");
        String password = System.getenv("MYSQL_PASSWORD");
        String database = System.getenv("MYSQL_DATABASE");
        dataSource.setPort(port);
        dataSource.setServerName(host);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setDatabaseName(database);
        return dataSource;
    }
}
