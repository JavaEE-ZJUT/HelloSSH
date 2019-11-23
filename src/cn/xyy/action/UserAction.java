package cn.xyy.action;

import cn.xyy.po.CustomerhellosshEntity;
import cn.xyy.service.UserService;

public class UserAction {
    public UserAction() {
        System.out.println("UserAction");
    }
    private CustomerhellosshEntity loginUser;
    public CustomerhellosshEntity getLoginUser() { return loginUser; }
    public void setLoginUser(CustomerhellosshEntity loginUser) { this.loginUser = loginUser; }

    private UserService userService;
    public void setUserService(UserService userService) {
        System.out.println("-- set userService to UserAction--");
        this.userService = userService;
    }

    public String execute() {
        userService.register(loginUser);
        return "success";
    }
}
