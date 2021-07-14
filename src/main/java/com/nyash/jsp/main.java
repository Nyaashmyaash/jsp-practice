package com.nyash.jsp;

import com.nyash.jsp.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/fix_user_db");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "test");
        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.connection.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        User user = session.createQuery("from User user where user.id = 1", User.class).getSingleResult();
    }
}
