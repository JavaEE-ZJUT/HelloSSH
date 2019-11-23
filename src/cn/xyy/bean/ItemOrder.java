package cn.xyy.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ItemOrder implements IItemOrder, InitializingBean, DisposableBean {
    private Item item;
    private int numItems;
    private double unitCost;

    public ItemOrder() { System.out.println("Spring实例化ItemOrder..."); }

    public Item getItem() { return item; }
    public void setItem(Item item) { System.out.println("Spring注入item..."); this.item = item; }
    public int getNumItems() { return numItems; }
    public void setNumItems(int numItems) { this.numItems = numItems; }
    public double getUnitCost() { return this.item.getCost(); }
    public void setUnitCost(double unitCost) { this.unitCost = unitCost; }

    public void incrementNumItems() {
        System.out.println("Spring注入numItems...");
        setNumItems(getNumItems() + 1);
    }
    public void cancelOrder() {
        setNumItems(0);
    }
    public double getTotalCost() {
        return (getNumItems() * getUnitCost());
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行初始化方法 afterPropertiesSet...");
    }

    public void init() { System.out.println("正在执行初始化方法 init..."); }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean准备销毁");
    }
}
