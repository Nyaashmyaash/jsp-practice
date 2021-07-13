package com.nyash.jsp.dao;

import java.util.List;

public interface CrudDao<T> {

    T find(int id);

    void save(T model);

    void update(T model);

    void delete(int id);

    List<T> findAll();
}
