package com.laptrinhjava.dao;

import com.laptrinhjava.utils.QueryParam;

import java.util.List;
import java.util.Map;

public interface EntityDao<T> {
    public List<T> findAll();

    public T find(List<QueryParam> params);

    public List<T> query(List<QueryParam> params, Map<String, String> orderByFields);

    public T save(T entity);

    public T saveOrUpdate(T entity);

    public T findById(Long id);
}
