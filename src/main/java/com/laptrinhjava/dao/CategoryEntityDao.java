package com.laptrinhjava.dao;

import com.laptrinhjava.entity.Category;

import javax.persistence.EntityManagerFactory;

public class CategoryEntityDao extends AbstractEntityDAOImpl<Category> {
    public CategoryEntityDao(EntityManagerFactory factory) {
        super(factory, Category.class);
    }
}
