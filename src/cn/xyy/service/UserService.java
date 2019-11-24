package cn.xyy.service;

import cn.xyy.dao.ICustomerDAO;
import cn.xyy.po.Customer;

public class UserService {
    private ICustomerDAO customerDAO = null;
    public UserService(){
        System.out.println("create UserService.");
    }
    public void setCustomerDAO(ICustomerDAO customerDAO) {
        System.out.println("--setCustomerDAO--");
        this.customerDAO = customerDAO;
    }
    public void addUser(Customer cust) {
        System.out.println("execute --addUser()-- method.");
        customerDAO.save(cust);
    }
    public void delUser(Customer cust) {
        System.out.println("execute --delUser()-- method.");
        customerDAO.delete(cust);
    }
    public void updateUser(Customer cust) {
        System.out.println("execute --updateUser()-- method.");
        customerDAO.update(cust);
    }
    public void findUser(Customer cust) {
        System.out.println("execute --findUser()-- method.");
    }

}
