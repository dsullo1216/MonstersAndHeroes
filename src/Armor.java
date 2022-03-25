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

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }

        if (!(other instanceof Armor)) {
            return false;
        }
        
        Armor otherA = (Armor) other;
        return ((this.name == otherA.getName()) && 
                (this.price == otherA.getPrice()) && 
                (this.minLevel == otherA.getMinLevel()) && 
                (this.defense == otherA.getDefense()));
    
    }

    public String inventoryHeader() {
        return "Armor Name / Price / Level Required / Defense";
    }

    public int getDefense() {
        return defense;
    }

}