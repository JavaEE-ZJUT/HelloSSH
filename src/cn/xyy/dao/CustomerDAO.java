package cn.xyy.dao;

import cn.xyy.po.Customer;

public class CustomerDAO implements ICustomerDAO {
    public CustomerDAO() {
        System.out.println("create CustomerDao.");
    }
    public void save(Customer transientInstance) {
        System.out.println("execute --save()-- method.");
    }
    public void delete(Customer transientInstance) {
        System.out.println("execute --delete()-- method.");
    }
    public void update(Customer transientInstance) {
        System.out.println("execute --update()-- method.");
    }
    public void findByHQL(String hql) {
        System.out.println("execute --findByHQL()-- method.");
    }
}
