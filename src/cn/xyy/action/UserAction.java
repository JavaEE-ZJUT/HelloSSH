package cn.xyy.action;

import cn.xyy.po.CustomerhellosshEntity;
import cn.xyy.service.IUserService;

public class UserAction {
    private CustomerhellosshEntity loginUser;
    public CustomerhellosshEntity getLoginUser() { return loginUser; }
    public void setLoginUser(CustomerhellosshEntity loginUser) { this.loginUser = loginUser; }

    IUserService userService = null;
    public IUserService getUserService() { return userService; }
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public String execute() {
        userService.register(loginUser);
        return "success";
    }
}
