package cn.xyy.action;

import cn.xyy.po.CustomerhellosshEntity;
import cn.xyy.service.UserService;


public class UserAction1  {
    public UserAction1() {
        System.out.println("create UserAction.");
    }

    private CustomerhellosshEntity loginUser;
    public CustomerhellosshEntity getLoginUser() { return loginUser; }
    public void setLoginUser(CustomerhellosshEntity loginUser) { this.loginUser = loginUser; }

    private UserService userService;
    public void setUserService(UserService userService) {
        System.out.println("-- set userService to action--");
        this.userService = userService;
    }

    public String execute() {
        userService.register(loginUser);
        return "success";
    }
}
