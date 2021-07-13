package com.nyash.jsp.dao;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T> {

    Optional<T> find(int id);

    void save(T model);

    void update(T model);

    void delete(int id);

    List<T> findAll();
}
