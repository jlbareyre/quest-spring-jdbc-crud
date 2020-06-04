package com.wildcodeschool.wildandwizard.dao;

import java.util.List;

public interface CrudDao<T> {

    T save(T entity);

    T findById(Long id);

    List<T> findAll();

    T update(T entity);

    void deleteById(Long id);
}