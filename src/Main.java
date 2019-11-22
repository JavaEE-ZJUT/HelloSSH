import cn.xyy.dao.ICustomerDAO;
import cn.xyy.service.IUserService;
import cn.xyy.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //创建Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "applicationContext.xml");
        //获取CustomerDAO实例
        ICustomerDAO userDao = (ICustomerDAO) ctx.getBean("userDAO");
        userDao.save();
        //获取UserService实例
        UserService userService = (UserService) ctx.getBean("userService");
        userService.register();

    }
}
