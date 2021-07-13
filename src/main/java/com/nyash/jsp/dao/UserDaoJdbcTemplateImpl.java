package com.nyash.jsp.dao;

import com.nyash.jsp.models.Car;
import com.nyash.jsp.models.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.*;

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

        if (!userMap.containsKey(id)) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            User user = new User(id, firstName, lastName, new ArrayList<>());
            userMap.put(id, user);
        }

        Car car = new Car(rs.getInt("car_id"), rs.getString("model"), userMap.get(id));

        userMap.get(id).getCars().add(car);

        return userMap.get(id);

    };

    @Override
    public Optional<User> find(int id) {
        if (userMap.containsKey(id)) {
            return Optional.of(userMap.get(id));
        } else {
            return Optional.empty();
        }
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
