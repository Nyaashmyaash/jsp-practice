package com.nyash.jsp.repositories;

import com.nyash.jsp.models.User;

import java.util.List;

public interface UsersRepository {

    List<User> findAll();

    void save(User user);
}
