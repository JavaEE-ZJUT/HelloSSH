package cn.xyy.dao;

import cn.xyy.po.Customer;

public interface ICustomerDAO {
    public void save(Customer transientInstance);
    public void delete(Customer transientInstance);
    public void update(Customer transientInstance);
    public void findByHQL(String hql);
}
