package cn.xyy.service;

import cn.xyy.dao.ICustomerDAO;

public class UserService {
    private ICustomerDAO customerDAO = null;
    public UserService(){
        System.out.println("create UserService.");
    }
    public void setCustomerDAO(ICustomerDAO customerDAO) {
        System.out.println("--setCustomerDAO--");
        this.customerDAO = customerDAO;
    }
    public void register() {
        System.out.println("execute --register()-- method.");
        customerDAO.save();
    }
}
