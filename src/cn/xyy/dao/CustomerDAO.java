package cn.xyy.dao;

public class CustomerDAO implements ICustomerDAO {
    public CustomerDAO() {
        System.out.println("create CustomerDao.");
    }
    public void save() {
        System.out.println("execute --save()-- method.");
    }

}
