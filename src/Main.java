import cn.xyy.bean.IItem;
import cn.xyy.bean.Item;
import cn.xyy.bean.ItemOrder;
import cn.xyy.bean.ShoppingCart;
import cn.xyy.dao.ICustomerDAO;
import cn.xyy.service.IUserService;
import cn.xyy.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "applicationContext.xml");
        Item item1 = (Item) ctx.getBean("item1");
        System.out.println(item1.getItemID());
        System.out.println(item1.getTitle());
        System.out.println(item1.getDescription());
        System.out.println(item1.getCost());
        Item item2 = (Item) ctx.getBean("item2");
        System.out.println(item2.getItemID());
        System.out.println(item2.getTitle());
        System.out.println(item2.getDescription());
        System.out.println(item2.getCost());

        ItemOrder itemorder1 = (ItemOrder) ctx.getBean("itemorder1");
        System.out.println("书名： "+itemorder1.getItem().getTitle());
        System.out.println("数量：" + itemorder1.getNumItems());
        ItemOrder itemorder2 = (ItemOrder) ctx.getBean("itemorder2");
        System.out.println("书名： "+itemorder2.getItem().getTitle());
        System.out.println("数量：" + itemorder2.getNumItems());

        ShoppingCart cart = (ShoppingCart) ctx.getBean("shoppingcart");
        List cartList = cart.getItemsOrdered();
        for (int i = 0; i < cartList.size(); i ++) {
            ItemOrder itemOrder = (ItemOrder) cartList.get(i);
            Item item = itemOrder.getItem();
            System.out.println("书号：" + item.getItemID());
            System.out.println("书名：" + item.getTitle());
            System.out.println("价格：" + item.getCost());
            System.out.println("描述：" + item.getDescription());

            System.out.println("购买数量：" + itemOrder.getNumItems());
            System.out.println("总价：" + itemOrder.getTotalCost());
        }

    }
}
