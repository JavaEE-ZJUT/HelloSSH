import cn.xyy.bean.*;
import cn.xyy.dao.ICustomerDAO;
import cn.xyy.service.IUserService;
import cn.xyy.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "applicationContext.xml");
        System.out.println("getBean(item1)---1");
        IItem item11 = (IItem) ctx.getBean("item1");
        System.out.println("getBean(item1)---2");
        IItem item12 = (IItem) ctx.getBean("item1");
        System.out.println("getBean(item2)---1");
        IItem item21 = (IItem) ctx.getBean("item2");
        System.out.println("getBean(item2)---2");

        IItemOrder itemorder1 = (IItemOrder)ctx.getBean("itemorder1");

        IItemOrder itemorder2 = (IItemOrder)ctx.getBean("itemorder2");
    }
}
