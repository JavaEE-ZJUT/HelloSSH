package cn.xyy.dao;

import cn.xyy.po.CustomerhellosshEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDAO extends BaseHibernateDAO implements ICustomerDAO {
    @Override
    public void save(CustomerhellosshEntity transientInstance) {
        System.out.println("execute --save()-- method.");
        try {
            getSession().save(transientInstance);
        } catch (RuntimeException re) {
            throw re;
        }
    }
}
