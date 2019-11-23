package cn.xyy.bean;

public class ItemOrder implements IItemOrder{
    private Item item;
    private int numItems;
    private double unitCost;

    public Item getItem() { return item; }
    public void setItem(Item item) { this.item = item; }
    public int getNumItems() { return numItems; }
    public void setNumItems(int numItems) { this.numItems = numItems; }
    public double getUnitCost() { return this.item.getCost(); }
    public void setUnitCost(double unitCost) { this.unitCost = unitCost; }

    public void incrementNumItems() {
        setNumItems(getNumItems() + 1);
    }
    public void cancelOrder() {
        setNumItems(0);
    }
    public double getTotalCost() {
        return (getNumItems() * getUnitCost());
    }
}
