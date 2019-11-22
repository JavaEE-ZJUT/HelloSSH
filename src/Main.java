
import cn.xyy.po.CustomerhellosshEntity;
import cn.xyy.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "applicationContext.xml");
        IUserService userService = (IUserService) ctx.getBean("userService");
        CustomerhellosshEntity cust = new CustomerhellosshEntity();
        cust.setAccount("SPRING");
        cust.setPassword("SPRING");
//        cust.setName("xyy");
//        cust.setSex(1);
//        java.util.Date birthday = new java.util.Date("1999/08/13");
//        java.sql.Date s = new java.sql.Date(birthday.getTime());
//        cust.setBirthday(s);
//        cust.setPhone("17857690587");
//        cust.setEmail("xuyuyan999@126.com");
//        cust.setAddress("zjut");
//        cust.setZipcode("zipcode");
//        cust.setFax("fax");
        userService.register(cust);
    }
}
