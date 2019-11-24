package cn.xyy.service;

import cn.xyy.dao.ICustomerDAO;
import cn.xyy.po.CustomerhellosshEntity;


public class UserService implements IUserService{
    private ICustomerDAO customerDAO = null;
    public UserService(){
        System.out.println("create UserService.");
    }
    public void setCustomerDAO(ICustomerDAO customerDAO) {
        System.out.println("--setCustomerDAO--");
        this.customerDAO = customerDAO;
    }

    @Override
    public void register(CustomerhellosshEntity customer) {
        System.out.println("execute --register()-- method.");
        customerDAO.save(customer);
    }

    @Override
    public void addUser(CustomerhellosshEntity cust) {
        System.out.println("execute --addUser()-- method.");
        customerDAO.save(cust);
    }
}
