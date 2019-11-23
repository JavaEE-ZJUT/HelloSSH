package cn.xyy.bean;

public class ItemOrderFactory2 {
    public ItemOrder createItemOrder() {
        System.out.println("调用实例工厂方法创建bean...");
        return new ItemOrder();
    }

}
