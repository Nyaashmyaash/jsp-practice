package com.nyash.jsp.dao;

import com.nyash.jsp.models.User;

import java.util.List;

public interface UserDao extends CrudDao<User>{
    List<User> findAllByFirstName(String firstName);
}
