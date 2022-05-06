package com.laptrinhjava.dao;

import com.laptrinhjava.utils.QueryParam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AbstractEntityDAOImpl<T> implements EntityDao<T> {

    protected Logger logger;

    protected EntityManagerFactory factory;

    protected Class<T> genericClass;

    public AbstractEntityDAOImpl(EntityManagerFactory factory, Class<T> genericClass) {
        this.factory = factory;
        this.genericClass = genericClass;
        this.logger = LogManager.getLogger(getClass());
    }

    @Override
    public List<T> findAll() {
        EntityManager entityManager = null;
        try {
            entityManager = this.factory.createEntityManager();
            Query query = entityManager.createQuery("Select e from " + genericClass.getName() + " e");
            List res = query.getResultList();
            List<T> list = new ArrayList<>();
            for (Object o : res) {
                list.add(genericClass.cast(o));
            }
            return list;
        } catch (Exception e) {
            logger.error(getClass() + " findAll", e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        return null;
    }

    @Override
    public T find(List<QueryParam> params) {
        return null;
    }

    @Override
    public List<T> query(List<QueryParam> params, Map<String, String> orderByFields) {
        return null;
    }

    @Override
    public T save(T entity) {
        return null;
    }

    @Override
    public T saveOrUpdate(T entity) {
        return null;
    }

    @Override
    public T findById(Long id) {
        return null;
    }
}
