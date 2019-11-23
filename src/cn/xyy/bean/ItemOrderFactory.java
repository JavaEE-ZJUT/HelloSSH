package cn.xyy.bean;

public class ItemOrderFactory {
    public static ItemOrder createItemOrder() {
        System.out.println("调用静态工厂方法创建bean...");
        return new ItemOrder();
    }
}
