package com.laptrinhjava;

import com.laptrinhjava.dao.NewEntityDao;

import com.laptrinhjava.entity.New;
import com.laptrinhjava.utils.HibernateUtil;
import javafx.application.Application;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class main {
    private static final Logger logger = LogManager.getLogger(Application.class);
    public static void main(String[] args) {
        HibernateUtil hibernateUtil = new HibernateUtil(HibernateUtil.DEFAULT);
        NewEntityDao dao = new NewEntityDao(hibernateUtil.getDbConnector());
        List<New> news = dao.findAll();
        for (New x : news) {
            logger.info(x);
        }



    }
}
