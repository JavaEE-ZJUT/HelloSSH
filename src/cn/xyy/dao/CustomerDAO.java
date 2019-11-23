package cn.xyy.dao;

import cn.xyy.po.CustomerhellosshEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDAO extends BaseHibernateDAO implements ICustomerDAO {
    public CustomerDAO() {System.out.println("create CustomerDAO.");}
    @Override
    public void save(CustomerhellosshEntity transientInstance) {
        Transaction tran = null;
        Session session = null;
        try {
            session = getSession();
            tran = session.beginTransaction();
            session.save(transientInstance);
            tran.commit();
        } catch (RuntimeException re) {
            if (tran != null) tran.rollback();
            throw re;
        } finally {
            session.close();
        }
    }
}
