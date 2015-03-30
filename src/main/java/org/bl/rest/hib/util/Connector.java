package org.bl.rest.hib.util;

/**
 * Created by blupashko on 25.03.2015.
 */
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connector {
    private static SessionFactory sessionFactory = null;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
