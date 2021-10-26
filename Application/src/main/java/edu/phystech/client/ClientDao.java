package edu.phystech.client;

import edu.phystech.dbclients.MysqlJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClientDao {
    private final MysqlJdbcTemplate jdbcTeplate;

    public ClientDao(@Qualifier("mysqlJdbcTemplate") MysqlJdbcTemplate jdbcTeplate) {
        this.jdbcTeplate = jdbcTeplate;
    }

    public Client getClient(long clientId) {
        return jdbcTeplate.query("" +
                        "select first_name, second_name, address, passport_data, verified " +
                        "from clients " +
                        "where id = " + clientId,
                (rs) -> {
                    rs.next();
                    return new Client(clientId,
                            null,
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getBoolean(5)
                    );
                });
    }

    public long addClient(Client client) {
        return jdbcTeplate.updateRowGetGeneratedKey("" +
                "insert into clients (first_name, second_name, address, passport_data, verified) " +
                "values (?, ?, ?, ?, ?)",
                client.firstName(),
                client.secondName(),
                client.address(),
                client.passportData(),
                client.verified()
        );
    }
}
