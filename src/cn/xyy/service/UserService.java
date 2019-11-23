package cn.xyy.service;

import cn.xyy.dao.CustomerDAO;
import cn.xyy.dao.ICustomerDAO;
import cn.xyy.po.CustomerhellosshEntity;

public class UserService implements IUserService{

    public UserService(){
        System.out.println("create UserService.");
    }

    private CustomerDAO userDAO = null;
    public void setUserDAO(CustomerDAO customerDAO) {
        System.out.println("--setCustomerDAO to service--");
        this.userDAO = customerDAO;
    }

    @Override
    public void register(CustomerhellosshEntity customer) {
        System.out.println("execute --register()-- method.");
        userDAO.save(customer);
    }
}
