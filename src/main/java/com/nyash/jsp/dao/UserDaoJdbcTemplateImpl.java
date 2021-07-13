package com.nyash.jsp.dao;

import com.nyash.jsp.models.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class UserDaoJdbcTemplateImpl implements UserDao {

    private JdbcTemplate template;

    private final String SQL_SELECT_ALL =
            "SELECT * FROM fix_user_db.public.user";

    private final String SQL_SELECT_BY_ID =
            "SELECT * FROM fix_user_db.public.user WHERE id = ?";

    private final String SQL_SELECT_ALL_BY_FIRSTNAME =
            "SELECT * FROM fix_user_db.public.user WHERE first_name = ?";

    public UserDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    private RowMapper<User> userRowMapper = (rs, rowNum) -> {
        return new User(
                rs.getInt("id"),
                rs.getString("first_name"),
                rs.getString("last_name"));
    };

    @Override
    public Optional<User> find(int id) {
        return Optional.empty();
    }

    @Override
    public void save(User model) {

    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<User> findAll() {
        return template.query(SQL_SELECT_ALL, userRowMapper);
    }

    @Override
    public List<User> findAllByFirstName(String firstName) {
        return template.query(SQL_SELECT_ALL_BY_FIRSTNAME, userRowMapper, firstName);
    }
}
