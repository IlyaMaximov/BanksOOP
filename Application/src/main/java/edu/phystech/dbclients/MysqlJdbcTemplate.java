package edu.phystech.dbclients;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.google.common.base.Preconditions;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.SqlProvider;
import org.springframework.jdbc.support.GeneratedKeyHolder;

public class MysqlJdbcTemplate extends JdbcTemplate {

    public MysqlJdbcTemplate(DataSource dataSource) {
        super(dataSource);
    }

    public long updateRowGetGeneratedKey(String q, Object... args) throws DataAccessException {
        return updateRowGetGeneratedKey(q, newArgPreparedStatementSetter(args));
    }

    public long updateRowGetGeneratedKey(String q, PreparedStatementSetter s) throws DataAccessException {
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        update(createGeneratedKeyStatementCreator(q, s), keyHolder);
        return Preconditions.checkNotNull(keyHolder.getKey(), "no_key").longValue();
    }

    private PreparedStatementCreator createGeneratedKeyStatementCreator(final String q, PreparedStatementSetter setter) {
        class GeneratedKeyPreparedStatementCreator implements PreparedStatementCreator, SqlProvider {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement(q, PreparedStatement.RETURN_GENERATED_KEYS);
                setter.setValues(ps);
                return ps;
            }

            @Override
            public String getSql() {
                return q;
            }
        }

        return new GeneratedKeyPreparedStatementCreator();
    }
}
