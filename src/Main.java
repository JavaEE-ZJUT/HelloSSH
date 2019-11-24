
import cn.xyy.po.CustomerhellosshEntity;
import cn.xyy.service.IUserService;
import cn.xyy.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "applicationContext.xml");
        IUserService userService = (IUserService) ctx.getBean("logProxy");
        CustomerhellosshEntity cust = new CustomerhellosshEntity();
        cust.setAccount("xyy");
        cust.setPassword("xyy");
        userService.addUser(cust);

        ApplicationContext ctx2 = new ClassPathXmlApplicationContext( "applicationContext.xml");
        IUserService userService2 = (IUserService) ctx2.getBean("logProxy");
        CustomerhellosshEntity cust2 = new CustomerhellosshEntity();
        cust2.setAccount("xyy2");
        cust2.setPassword("xyy2");
        userService2.addUser(cust2);
    }
}
