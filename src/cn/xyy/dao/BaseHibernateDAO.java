package cn.xyy.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseHibernateDAO {
    public BaseHibernateDAO() {System.out.println("create BaseDAO.");}
    private SessionFactory sessionFactory;
    public Session getSession(){
        return sessionFactory.openSession();
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
