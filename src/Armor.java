public class Armor extends Item {

    private int defense;
    
    public Armor(String name, int price, int minLevel, int defense) {
        this.name = name;
        this.price = price;
        this.minLevel = minLevel;
        this.defense = defense;
    }

    public String toString() {
        return name + " / " + Integer.toString(price) + " / " + Integer.toString(minLevel) + " / " + Integer.toString(defense);
    }

    public String inventoryHeader() {
        return "Armor Name / Price / Level Required / Defense";
    }

    public int getDefense() {
        return defense;
    }

}