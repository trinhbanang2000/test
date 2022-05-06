package com.laptrinhjava.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class HibernateUtil {

    public static final String DEFAULT = "anthinhphatjsc";

    private static final Logger logger = LogManager.getLogger(HibernateUtil.class);


    private EntityManagerFactory dbConnector;

    public HibernateUtil(String unit, String env) {
        dbConnector = connect(unit, env);
    }

    public HibernateUtil(String unit) {
        dbConnector = connect(unit, unit);
    }

    public EntityManagerFactory getDbConnector() {
        return dbConnector;
    }

    public void setDbConnector(EntityManagerFactory dbConnector) {
        this.dbConnector = dbConnector;
    }

    private EntityManagerFactory connect(String unit, String db) {
        Properties props = new Properties();
        try {
            props.load(getClass().getClassLoader().getResourceAsStream(String.format("conf/%s/%s.properties", getEnv(), db)));
        } catch (IOException e) {
            logger.error(getClass().getName() + "-find: ", e);
        }
        return Persistence.createEntityManagerFactory(unit, typeCastConvert(props));
    }

    private HashMap<String, String> typeCastConvert(Properties prop) {
        HashMap<String, String> retMap = new HashMap<>();
        for (Map.Entry<Object, Object> entry : prop.entrySet()) {
            retMap.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
        }
        System.out.println(retMap);
        return retMap;
    }

    private String getEnv() {
        String env = System.getenv("APP_ENV");
        return env != null ? env : "dev";
    }

    public void close() {
        if (dbConnector != null) {
            dbConnector.close();
        }
    }
}
