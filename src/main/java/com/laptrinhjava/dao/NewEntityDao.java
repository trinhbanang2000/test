package com.laptrinhjava.dao;

import com.laptrinhjava.entity.Category;
import com.laptrinhjava.entity.New;

import javax.persistence.EntityManagerFactory;

public class NewEntityDao extends AbstractEntityDAOImpl<New> {
    public NewEntityDao(EntityManagerFactory factory) {
        super(factory, New.class);
    }
}
