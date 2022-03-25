public class Armor extends Item {

    private int defense;
    
    public Armor(String name, int price, int minLevel, int defense) {
        this.name = name;
        this.price = price;
        this.minLevel = minLevel;
        this.defense = defense;
    }

    public String toString() {
        return "Armor Name / Price / Level Required / Defense" + '\n' + name + " / " + Integer.toString(price) + " / " + Integer.toString(minLevel) + " / " + Integer.toString(defense);
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getMinLevel() {
        return this.minLevel;
    }

    public int getDefense() {
        return this.defense;
    }
}
