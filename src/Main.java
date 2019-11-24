import cn.xyy.dao.ICustomerDAO;
import cn.xyy.po.Customer;
import cn.xyy.service.IUserService;
import cn.xyy.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //创建Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        Customer cust = new Customer();
        cust.setAccount("SPRING");
        cust.setPassword("SPRING");
        userService.addUser(cust);
    }
}
