package com.nyash.jsp.dao;

import com.nyash.jsp.models.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UserDaoJdbcTemplateImpl implements UserDao {

    private JdbcTemplate template;

    private final String SQL_SELECT_ALL =
            "SELECT * FROM users";

    private final String SQL_SELECT_BY_ID =
            "SELECT * FROM users WHERE id = ?";

    private final String SQL_SELECT_ALL_BY_FIRSTNAME =
            "SELECT * FROM users WHERE first_name = ?";

    private final String SQL_SELECT_USER_WITH_CARS =
            "SELECT users.*, cars.id as car_id, cars.model" +
                    "FROM users " +
                    "LEFT JOIN cars ON users.id = cars.owner_id " +
                    "WHERE users.id = ?";

    private Map<Integer, User> userMap = new HashMap<>();

    public UserDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    private RowMapper<User> userRowMapper = (rs, rowNum) -> {
        Integer id = rs.getInt("id");

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
