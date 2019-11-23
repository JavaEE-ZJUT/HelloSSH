package cn.xyy.bean;

public class ItemOrder implements IItemOrder{
    private Item item;
    private int numItems;
    private int unitCost;

    public Item getItem() { return item; }
    public void setItem(Item item) { this.item = item; }
    public int getNumItems() { return numItems; }
    public void setNumItems(int numItems) { this.numItems = numItems; }
    public int getUnitCost() { return unitCost; }
    public void setUnitCost(int unitCost) { this.unitCost = unitCost; }

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
