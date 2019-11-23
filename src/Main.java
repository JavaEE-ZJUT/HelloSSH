import cn.xyy.bean.*;
import cn.xyy.dao.ICustomerDAO;
import cn.xyy.event.EmailEvent;
import cn.xyy.service.IUserService;
import cn.xyy.service.UserService;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // XmlBeanFactory 创建
        FileSystemResource isr = new FileSystemResource("src/applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(isr);
        IItemOrder itemorder3 = (IItemOrder) factory.getBean("itemorder3");
        System.out.println("");

        // FileSystemXmlApplicationContext创建
        ClassPathResource res = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory1 = new XmlBeanFactory(res);
        IItemOrder itemorder4 = (IItemOrder) factory1.getBean("itemorder3");

        // ClassPathXmlApplicationContext创建
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "applicationContext.xml");
        IItemOrder itemorder5 = (IItemOrder)ctx.getBean("itemorder3");

        ApplicationContext ctx2 = new FileSystemXmlApplicationContext( "src/applicationContext.xml");
        IItemOrder itemorder6 = (IItemOrder)ctx.getBean("itemorder3");

        // 国际化测试
        ApplicationContext ctx3 = new ClassPathXmlApplicationContext( "applicationContext.xml");
        Object[] objects = new Object[]{"HelloWorld",new Date()};
        // String message= ctx3.getMessage("HelloWorld",objects, Locale.CHINA);
        String message = ctx3.getMessage("HelloWorld",objects,Locale.US);
        System.out.println(message);

        // 调用 ApplicationContext 的 publishEvent 来触发事件
        ApplicationContext ctx4 = new ClassPathXmlApplicationContext( "applicationContext.xml");
        EmailEvent ele = new EmailEvent("hello", "spring_test@zjut.edu.cn", "this is a test");
        ctx4.publishEvent(ele);

    }
}
