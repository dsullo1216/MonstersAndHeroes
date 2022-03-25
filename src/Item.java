// Abstract class representing Items for implementing Heroes and Monsters.
public abstract class Item {

    protected String name;
    protected int price;
    protected int minLevel;

    public abstract String toString();

    public abstract String inventoryHeader();

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMinLevel() {
        return minLevel;
    }
    
}